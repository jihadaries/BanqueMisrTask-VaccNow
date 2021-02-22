VaccNow
------------------------------------------------------------------------------------------------------------------------------------------------------------

Technologies used:
-Java 1.8.0_281
-Spring Boot(v2.4.3)
-H2 Database
------------------------------------------------------------------------------------------------------------------------------------------------------------

To run this project please import the project as Maven project and run VaccNowJsabryApplication.java located in package com.jsabry.vaccNowjsabry.

------------------------------------------------------------------------------------------------------------------------------------------------------------

Test data is loaded on run. Please refer to vaccNow-jsabry\src\main\resources\data.sql

------------------------------------------------------------------------------------------------------------------------------------------------------------

All REST APIs can be found in the attached Postman JSON file with test data set as variables. 
Please refer to file VaccNowJsabry.postman_collection.json

------------------------------------------------------------------------------------------------------------------------------------------------------------

Sample Test Data:
branchid = 101
vaccineId= 1
timeSlot= 10:15AM-10:30AM
userId= 121
Date format = YYYY-MM-DD

------------------------------------------------------------------------------------------------------------------------------------------------------------

APIs 

-Get a list of all branches
http://localhost:7070/availability/branches

-Get a list of all available vaccines per branch
http://localhost:7070/availability/vaccines

-Get a specific availability by branch
http://localhost:7070/availability/branches/{branchid}/vaccines

-Get available time for a branch 
http://localhost:7070/availability/branches/{branchid}/availabletimeslot


-Schedule caccination timeslot (POST)
http://localhost:7070/vaccination/schedulevaccination?branchId={{branchid}}&vaccineId={{vaccineId}}&timeSlot={{timeSlot}}&userId={{userId}}

-Choose Payment method (POST)
http://localhost:7070/vaccination/choosepayment?userId={{userId}}
 
-Confirm scheduled vaccination by email
http://localhost:7070/vaccination/scheduleconfirmationemail?userId={{userId}}


-Get a list of all applied vaccination per branch
http://localhost:7070/reporting/branches/{{branchid}}/appliedvaccination

-Get a list of all applied vaccination per day
http://localhost:7070/reporting/appliedvaccinationperday/{{currentdate}}

-Get a list of all confirmed vaccinations over a time period
http://localhost:7070/reporting/listallconfirmedvaccination/{{startdate}}/{{currentdate}}
