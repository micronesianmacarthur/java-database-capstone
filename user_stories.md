# User Stories

## Admin User Stories
### User Story 1
**Title:**
As an Admin user, I want to log into the portal with my username and password, so that I can manage the platform securely.

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
As an admin user, I want to log out of the portal, so that I can protect the system access.

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
As an Admin user, I want to add doctors to the portal, so that they can access the system to manage appointments.

**Acceptance Criteria:**
1. A `Add Doctor` button must be present in the Admin Dashboard.
2. Add doctor page must have fields for name, email, contact number, username, temporary password, and specialty.
3. The entered data must be validated to avoid invalid inputs or duplicate records.
4. Appropriate message is displayed upon clicking `Register Doctor` in the add doctor page.

**Priority:** High

**Story Points:** 4

**Notes:**
- Consider sending Onboarding email to newly added doctor

### User Story 4
**Title:**
As an Admin user, I want to delete doctor's profile from portal, so that patients' sensitive information are secured from un-authenticated doctors.

**Acceptance Criteria:**
1. A `Manage Doctors` button must be present in the admin dashboard.
2. The 'Manage Doctors' page must have `Edit` and `Delete` button.
3. Upon clicking `Delete` button, confirmation dialog box appear to prevent accidental deletion.
4. Show appropriate message after confirming to delete doctor profile.
5. Doctor data is removed from the database upon successful deletion.

**Priority:** Medium

**Story Points:** 4

**Notes:**
- Consider moving deleted doctor data to separate database table that holds past doctor profiles.
- Ensure assigned appointments and records are handled properly.


### User Story 5
**Title:**
As an Admin user, I want to run a stored procedure in MySQL CLI to get the number of appointments per month so that I can track usage statistics.

**Acceptance Criteria:**
1. A stored procedure must exist in the MySQL database that aggregates appointment counts by month.
2. Admin should be able to connect to the database using MySQL CLI and execute the stored procedure using a CALL command.
3. The procedure should return a table showing each month and the corresponding number of appointments.

**Priority:** Low

**Story Points:** 2

**Notes:**
