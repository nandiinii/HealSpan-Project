import React,{useState,useEffect} from 'react'
import styles from "./MainPage.css"
import { BsFilter } from "react-icons/bs";
import filterIcon from "../../assets/iconFilter.png";
import { baseUrl } from '../../utils/Urls';

const MainPage = () => {
    const [showFilter, setShowFilter] = useState(false);
    const [patients, setPatients] = useState([]);
  const [filter, setFilter] = useState({ stage: '', status: '' });

  useEffect(() => {
    fetchPatients();
  }, []);

  const fetchPatients = async () => {
    try {
      const { stage, status } = filter;
      const response = await fetch(`${baseUrl}/api/healspan/search?stage=${stage}&status=${status}`);
      const data = await response.json();
      console.log(data)
      setPatients(data);
    } catch (error) {
      console.log('Error fetching patients:', error);
    }
  };

  const handleFilterChange = (event) => {
    const { name, value } = event.target;
    setFilter((prevFilter) => ({ ...prevFilter, [name]: value }));
  };

  const handleFilterSubmit = (event) => {
    event.preventDefault();
    fetchPatients();
  };

  const toggleFilter = () => {
    setShowFilter((prevShowFilter) => !prevShowFilter);
  };
  return (
    <>
    <div className="table__content">
        <div className='filter__content' onClick={toggleFilter}>
            <img src={filterIcon}></img>
            <h3>Filter</h3>
        </div>
        {showFilter && (
        <div className='dropdown__content'>
          <form onSubmit={handleFilterSubmit}>
            
      <label htmlFor="stageFilter">Stage:</label>
      <select id="stageFilter" name="stage" value={filter.stage} onChange={handleFilterChange}>
        <option value="">All</option>
        <option value="Initial Authorization">Initial Authorization</option>
        <option value="Enhancement">Enhancement</option>
        <option value="Discharge">Discharge</option>
        <option value="Final Authorization">Final Authorization</option>
      </select>

      <label htmlFor="statusFilter">Status:</label>
      <select id="statusFilter" name="status" value={filter.status} onChange={handleFilterChange}>
        <option value="">All</option>
        <option value="Pending Approval">Pending Approval</option>
        <option value="TPA Query">TPA Query</option>
      </select>

      <button type="submit">Apply Filter</button>
    </form>
        </div>
      )}
        <hr/>
     <table className='table__content'>
         <tr className='row__content'>
           <th>Claim ID</th>
           <th>Name</th>
           <th>Ailment</th>
           <th>SLA</th>
           <th>P-TAT</th>
           <th>Stage</th>
           <th>Status</th>
           <th>Approved Amount</th>
           <th>Hospital</th>
         </tr>
         {Array.isArray(patients) && patients.map((patient) => (
           <tr key={patient.id}>
             <td>{patient.claimId}</td>
             <td>{patient.name}</td>
             <td>{patient.ailment}</td>
             <td>{patient.sla}</td>
             <td>{patient.ptat}</td>
             <td>{patient.stage}</td>
             <td>{patient.status}</td>
             <td>{patient.approvedAmount}</td>
             <td>{patient.hospital}</td>
           </tr>
         ))}
     </table>
</div>
</>
  );
};

export default MainPage