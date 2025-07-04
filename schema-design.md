## MySQL Database Design

### Table: admin
- id: INT, Primary Key, Auto Increment
- firstName: VARCHAR, Not Null
- lastName: VARCHAR, Not Null,
- username: VARCHAR, Not Null,
- password: VARCHAR, Not Null, encrypted
- roleId: INT, Foreign Key &rarr; roles(id)
- employmentStatus: INT (0 = deactivated, 1 = active)
- createDate: DATE, Not Null
- deactivateDate: DATE

### Table: doctors
- id: INT, Primary Key, Auto Increment
- firstName: VARCHAR, Not Null
- lastName: VARCHAR, Not Null
- username: VARCHAR, Not Null
- password: VARCHAR, Not Null, encrypted
- roleId: INT, Foreign Key &rarr; roles(id)
- specializationId: INT, Foreign Key &rarr; specializations(id)
- employmentStatus: INT (0 = deactivated, 1 = active)
- deactivateDate: DATE

### Table: patients
- id: INT, Primary Key, Auto Increment
- firstName: VARCHAR(255), Not Null
- lastName: VARCHAR(255), Not Null
- email: VARCHAR(50)
- password: VARCHAR(255), encrypted
- dateOfBirth: DATE, Not Null
- hospitalNo: VARCHAR, Not NULL, unique
- bloodType_id: INT, Foreign Key &rarr; blood_types(id)
- accountStatus: INT (0 = deactivated, 1 = active)

### Table: appointments
- id: INT, Primary Key, Auto Increment
- doctor_id: INT, Foreign Key &rarr; doctors(id)
- patient_id: INT, Foreign Key &rarr; patients(id)
- appointment_time: DATETIME, Not Null
- status: INT (0 = Scheduled, 1 = Completed, 2 = Cancelled)

### Table: roles
- id: INT, Primary Key, Auto Increment
- name: VARCHAR, Not Null

### Table: specializations
- id: INT, Primary Key, Auto Increment
- name: VARCHAR, Not Null

### Table: blood_types
- id: INT, Primary Key, Auto Increment
- code: VARCHAR, Not Null

### Table: payments
- id: INT, Primary Key, Auto Increment
- appointment_id: INT, Foreign Key &rarr; appointments(id)
- patient_id: INT, Foreign Key &rarr; patients(id)
- total_price: Decimal, Not Null

### Table: payment_item
- id: INT, Primary Key, Auto Increment
- payment_id: INT, Foreign Key &rarr; payments(id)
- supply_id: INT, Foreign Key &rarr; supplies(id)
- quantity: Decimal, Not Null

### Table: supplies
- id: INT, Primary Key, Auto Increment
- name: VARCHAR, Not Null
- price: Decimal, Not Null
- type: INT (0 = Non-supply item, 1 = supply item)
- dosage: Double
- dosageUnit: VARCHAR
- stock_level: INT


## MongoDB Collection Design

### Collection: prescriptions
```json
{
  "_id": "ObjectId('64abc123456')",
  "patientId": 10,
  "appointmentId": 51,
  "medication": "Paracetamol",
  "dosage": "500mg",
  "doctorNotes": "Take 1 tablet every 6 hours.",
  "refillCount": 2,
  "pharmacy": {
    "name": "Walgreens SF",
    "location": "Market Street"
  }
}
```

### Collection: feedbacks
```json
{
  "_id": "ObjectId('124249852u3')",
  "patientId": 10,
  "doctorId": 4,
  "content": {
    "subject": "Some title",
    "comment": "Some comment paragaph"
  },
  "postDate": "DATETIME"
}
```