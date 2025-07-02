## MySQL Database Design

### Table: admin
- id: INT, Primary Key, Auto Increment
- firstName: VARCHAR, Not Null
- lastName: VARCHAR, Not Null,
- username: VARCHAR, Not Null,
- password: VARCHAR, Not Null, encrypted
- roleId: INT, Foreign Key &rarr; roles(id)
- employmentStatus: VARCHAR, Not Null
- createdDate: DATE, Not Null

### Table: doctors
- id: INT, Primary Key, Auto Increment
- firstName: VARCHAR, Not Null
- lastName: VARCHAR, Not Null
- username: VARCHAR, Not Null
- password: VARCHAR, Not Null, encrypted
- roleId: INT, Foreign Key &rarr; roles(id)
- specializationId: INT, Foreign Key &rarr; specializations(id)
- employmentStatus: VARCHAR, Not Null

### Table: patients
- id: INT, Primary Key, Auto Increment
- firstName: VARCHAR(255), Not Null
- lastName: VARCHAR(255), Not Null
- email: VARCHAR(50)
- password: VARCHAR(255), encrypted
- dateOfBirth: DATE, Not Null
- hospitalNo: VARCHAR, Not NULL, unique
- bloodType_id: INT, Foreign Key &rarr; blood_types(id)


### Table: doctors
