import React,{ useState,useEffect } from 'react'

const Filter = () => {
  return (
    <div>
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

    <table>
      <thead>
        <tr>
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
      </thead>
      <tbody>
        {/* {patients.map((patient) => (
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
        ))} */}
        <tr className='row__content'>
         <td>1234</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         </tr>
         <tr className='row__content'>
         <td>1234</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         </tr>
         <tr className='row__content'>
         <td>1234</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         <td>4567</td>
         </tr>
      </tbody>
    </table>
  </div>
  )
}

export default Filter