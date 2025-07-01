# Architecture Summary

This application is built with Spring Boot, which supports both MVC and REST controllers. The dashboard uses Thymeleaf templates, while other modules rely on REST APIs. For data storage, the system uses MySQL and MongoDB - MySQL handles structured data such as patients, doctors, and appointments, while MongoDB stores unstructured data like prescriptions. Controllers route requests through service layers, which then delegates tasks to the appropriate repositories.

---
# Flow of data and Control

1. Admin and Doctor users interact with the system through `AdminDashboard` and `DoctorDashboard` respectively. Requests through these dashboards are routed to **Thymeleaf controllers**.
2. Patients interact via REST-based interface `PatientDashboard` or `Appointment`. Requests through these dashboards are handled by **Spring Boot REST Controllers**.
3. Controllers delegate business logic to `Service layer`.
4. The service layer interacts with `MySQL Repositories` for structured data such as Patients, Doctors, Appointments; or `MongoDB Repositories` for unstructured data like Prescriptions.
5. Repositories access **MySQL Database** via `JPA Entities`; Repositories access **MongoDB Database** using `MongoDB Models` as BSON/JSON documents and managed by **Spring Data MongoDB**.
6. Fetched data is mapped into Models and passed back to the `Service layer` where business logic and processing are applied.
7. The controller returns the processed model to the `Thymeleaf View Engine` for the HTML templates to be rendered dynamically for the user.
