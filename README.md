# Employee Management REST API

## Project Overview

Employee Management REST API is a Spring Boot backend application developed to perform CRUD operations on employee records using Oracle Database. The application follows a layered architecture (Controller → Service → Repository) and exposes RESTful endpoints that can be tested using Postman or Thunder Client.

This project demonstrates backend development skills including REST API design, database integration, exception handling, and ORM mapping using JPA & Hibernate.

---

## Technologies Used

* Java 25
* Spring Boot
* Spring Data JPA
* Hibernate ORM
* Oracle Database
* Maven
* REST API
* JSON
* Thunder Client / Postman

---

## Project Architecture

The project follows a layered architecture:

Controller Layer
→ Handles HTTP requests and responses

Service Layer
→ Contains business logic

Repository Layer
→ Handles database operations using JPA

Database
→ Oracle (SCOTT Schema / Custom Schema)

---

## Features Implemented

* Create Employee
* Get All Employees
* Get Employee By ID
* Update Employee
* Delete Employee
* Global Exception Handling using @ControllerAdvice
* Proper HTTP Status Codes
* JSON Request & Response Handling

---

## API Endpoints

| Method | Endpoint        | Description         |
| ------ | --------------- | ------------------- |
| GET    | /employees      | Get all employees   |
| GET    | /employees/{id} | Get employee by ID  |
| POST   | /employees      | Create new employee |
| PUT    | /employees/{id} | Update employee     |
| DELETE | /employees/{id} | Delete employee     |

---

## Testing

The APIs were tested using:

* Thunder Client (VS Code Extension)
* Postman

All endpoints return proper HTTP status codes such as:

* 200 OK
* 201 Created
* 404 Not Found
* 400 Bad Request

---

## How to Run the Project

1. Clone the repository

```
git clone https://github.com/Joshuanesaraja/employee-management-api.git
```

2. Open the project in VS Code or IntelliJ

3. Configure your Oracle Database credentials in:

```
application.properties
```

4. Run the application

5. Access APIs at:

```
http://localhost:8080/employees
```

---

## Author
Joshua Nesaraja
---
