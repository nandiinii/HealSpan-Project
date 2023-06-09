# HealSpan-Project

## How it Works ?
1. Landing page of the website contains filter option where you would be able to filter based on attributes "Stage" and "Status".
2. The filter dropdown will help you to choose the value of the attribute according to which you need to filter the data and would display the details of that filtered patients' detail.

## Technologies used
Java Spring Boot, ReactJS, MongoDB

## How to configure and run
1. Clone this repository.
2. cd into 'healspan' folder for backend.
```bash
cd healspan
```
3. Run the class HealspanApplication 

4. Now open frontend folder in a new window.
```bash
cd ..
cd healspan-f
```
5. Run the command:
```bash
npm install
```
```bash
npm start
```

## Database Configuration

This project uses MongoDB as the database. Follow the steps below to set up the MongoDB database:

1. Install MongoDB on your local machine or use a cloud-based MongoDB service.
2. Create a new MongoDB database.
3. Note down the following database details:

   - Host: [hostname or IP address]
   - Port: [port number]
   - Database Name: [database name]
   - Authentication: [if applicable, specify username and password]

4. Update the application configuration file with the MongoDB connection details.
5. Run the application and verify the database connectivity.
All the necessary details about the database including host,port,etc is included in the application.properties of the backend folder.

## Input Data
1.The data was inputted through Postman services by using the POST option for url http://localhost:8081/api/healspan/patients
2.The data will be passed in JSON format like :

{
    "claimId": "124563",
    "name": "Nandini",
    "ailment": "Headache",
    "sla": "25",
    "ptat": "2 days",
    "stage": "Discharge",
    "status": "TPA Query",
    "approvedAmount": "5000",
    "hospital": "ABC Hospital"
}

## Images 
![image](https://github.com/nandiinii/HealSpan-Project/assets/99135337/eb107391-b01c-426b-892b-db923b191ad9)
![Screenshot 2023-06-10 025718](https://github.com/nandiinii/HealSpan-Project/assets/99135337/3f5102b9-4670-4e61-8ec6-1b06163a59bb)


