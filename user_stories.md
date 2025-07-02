# User Stories

---
## Admin User Stories
### User Story 1
**Title:**
As an Admin, I want to log into the portal with my username and password, so that I can manage the platform securely.

**Acceptance Criteria:**
1. Admin must be presented with login page requesting username and password.
2. Credentials must be validated against stored user data with hashed password.
3. Admin is redirected to AdminDashboard if successfully authenticated.

**Priority:** High

**Story Points:** 3

**Notes:**
- Secure password with Spring Security

### User Story 2
**Title:**
As an Admin, I want to log out of the portal, so that I can protect the system access.

**Acceptance Criteria:**
1. `Logout` button must be clearly present.
2. On clicking Logout button terminates current session.
3. On successful logout, user is redirected to login page.

**Priority:** High

**Story Points:** 2

**Notes:**
- Display success/error message


### User Story 3
**Title:**
As an Admin, I want to add doctors to the portal, so that they can access the system to manage appointments.

**Acceptance Criteria:**
1. A `Add Doctor` button must be present in the Admin Dashboard.
2. Add doctor page must have fields for name, email, contact number, username, temporary password, and specialty.
3. The entered data must be validated to avoid invalid inputs or duplicate records.
4. Appropriate message is displayed upon clicking `Register Doctor` in the add doctor page.

**Priority:** High

**Story Points:** 5

**Notes:**
- Consider sending Onboarding email to newly added doctor

### User Story 4
**Title:**
As an Admin, I want to delete doctor's profile from portal, so that patients' sensitive information are secured from un-authenticated doctors.

**Acceptance Criteria:**
1. A `Manage Doctors` button must be present in the admin dashboard.
2. The 'Manage Doctors' page must have `Edit` and `Delete` button.
3. Upon clicking `Delete` button, confirmation dialog box appear to prevent accidental deletion.
4. Show appropriate message after confirming to delete doctor profile.
5. Doctor data is removed from the database upon successful deletion.

**Priority:** Medium

**Story Points:** 5

**Notes:**
- Consider moving deleted doctor data to separate database table that holds past doctor profiles.
- Ensure assigned appointments and records are handled properly.


### User Story 5
**Title:**
As an Admin, I want to run a stored procedure in MySQL CLI to get the number of appointments per month so that I can track usage statistics.

**Acceptance Criteria:**
1. A stored procedure must exist in the MySQL database that aggregates appointment counts by month.
2. Admin should be able to connect to the database using MySQL CLI and execute the stored procedure using a CALL command.
3. The procedure should return a table showing each month and the corresponding number of appointments.

**Priority:** Low

**Story Points:** 2

**Notes:**

---
## Patient User Stories


### User Story 1
**Title:**
As a Patient, I want to view a list of doctors without logging in, so that I can explore options before registering.

**Acceptance Criteria:**
1. List of doctors can be accessed by public showing their names, specialty, and office hours.
2. Clicking on doctor card redirects user to specific doctor's profile with button to `Book Appointment`.

**Priority:** High

**Story Points:** 5


### User Story 2
**Title:**
As a Patient, I want to sign up using email and password, so that I can book my appointments.

**Acceptance Criteria:**
1. Patient must be able to access sign up form with fields firstname, lastname, email, password.
2. Entered data must be validated to avoid invalid input.
3. Upon successful signup, user data is stored in MySQL Database, user is redirected to appropriate page.

**Priority:** High

**Story Points:** 5

**Notes:**
- Notification should be sent to doctor when new appointment is booked.

### User Story 3
**Title:**
As a Patient, I want to log into the portal, so that I can manage my bookings.

**Acceptance Criteria:**
1. `Login` button must be present.
2. Login page must have email and password field.
3. Credentials are validated against stored patient data in the database.
4. On successful login, patient is redirected to dashboard where they can view, create, delete appointments.
5. Patient can specify duration of appointment given Doctor's availability.

**Priority:** High

**Story Points:** 3

**Notes:**


### User Story 4
**Title:**
As a Patient, I want to log out of the portal, so that my account is secure.

**Acceptance Criteria:**
1. `Logout` button must be present.
2. On logout, success message is displayed.
3. Current session is terminated, Patient is redirected to login page.

**Priority:** High

**Story Points:** 2

**Notes:**


### User Story 5
**Title:**
As a Patient, I want to view my upcoming appointments, so that I can prepare accordingly.

**Acceptance Criteria:**
1. Upcoming appointments are visible in Patient dashboard ordered by date and time of appointment.
2. Each appointment displays relevant details such as doctor name, specialty, date, time.

**Priority:** Medium

**Story Points:** 3

**Notes:**

---

## Doctor User Stories


### User Story 1
**Title:**
As a Doctor, I want to log into the portal, so that I can manage my appointments.

**Acceptance Criteria:**
1. `Login` button must be present.
2. On successful login, doctor is redirected to doctor dashboard where assigned appointments are listed.
3. `Profile`, `Appointments` menus must be present in doctor's dashboard.

**Priority:** High

**Story Points:** 2


### User Story 2
**Title:**
As a Doctor, I want to log out of the portal, so that my data is protected.

**Acceptance Criteria:**
1. `Logout` button must be present.
2. Session is terminated upon logout to prevent unauthenticated activity.

**Priority:** Medium

**Story Points:** 2


### User Story 3
**Title:**
As a Doctor, I want to view my appointment calendar, so that I can stay organized.

**Acceptance Criteria:**
1. `Appointments` button must be present to view appointments.
2. In the appointments page, a calendar must be present with appointments placed in its appropriate date and time.
3. Each appointment must be clickable to view more details.
4. In detailed appointment view, options to `Edit` and `Cancel` must be present.

**Priority:** High

**Story Points:** 5

**Notes:**
- Notification should be sent to patient if doctor cancels any appointment booking.


### User Story 4
**Title:**
As a Doctor, I want to mark my unavailability, so that patients are informed on available spots.

**Acceptance Criteria:**
1. `Add task` button must be present in the appointments page.
2. Add task page must have fields for date, time, task name, description, and location. `Save` and `Cancel` buttons must be present in the Add task page.
3. When `Save` button is clicked, new task appears on the calendar blocking off the slot to avoid any booking.

**Priority:** Medium

**Story Points:** 8

**Notes:**
- Handle error for when new task fall on slot for an existing booking.

### User Story 5
**Title:**
As a Doctor, I want to update my profile with specialization and contact information, so that patients have up-to-date information.

**Acceptance Criteria:**
1. `View Profile` menu must be present.
2. In profile page, `Edit profile` menu must be present where doctor can add specialization and contact information. `Save changes` and `Cancel` menu must be present.
3. When `Save changes` is clicked, data is validated and stored in the database. Page is redirected to profile view with updated information displayed.

**Priority:** Low

**Story Points:** 3


### User Story 6
**Title:**
As a Doctor, I want to view the patient details for upcoming appointments, so that I can be prepared.

**Acceptance Criteria:**
1. In detailed appointment page, Patient information is displayed. 
2. Patient information should include full name, gender, age, contact information, medical condition, medical consultation & prescription history, and reason for appointment.

**Priority:** Medium

**Story Points:** 5