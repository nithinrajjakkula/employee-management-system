# Employee Management System – Spring Boot

A backend Employee Management System built using Spring Boot demonstrating real-world REST API development with validation, exception handling, and database integration.

This project is designed to be **industry-ready for fresher / junior backend roles**.

---

## 🚀 Features

- Full CRUD operations for Employee management
- RESTful API design
- Input validation using Bean Validation
- Global exception handling
- Proper HTTP status codes (400, 404)
- Clean layered architecture

---

## 🧱 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Embedded Tomcat

---

## 🏗️ Architecture

Controller → Service → Repository → Database

- Controller: Handles HTTP requests
- Service: Business logic
- Repository: Database access using JPA
- Entity: Database model
- Exception: Global error handling

---

## 📌 API Endpoints

| Method | Endpoint | Description |
|------|--------|-------------|
| POST | /employees | Create employee |
| GET | /employees | Get all employees |
| GET | /employees/{id} | Get employee by ID |
| PUT | /employees/{id} | Update employee |
| DELETE | /employees/{id} | Delete employee |

---

## ✅ Validation Rules

- Name cannot be empty
- Department cannot be empty
- Salary must be greater than 0

---

## ⚠️ Exception Handling

- EmployeeNotFoundException → 404 NOT FOUND
- Validation errors → 400 BAD REQUEST
- Implemented using `@ControllerAdvice`

---

## 🧪 Testing

APIs tested using:
- curl (Command Prompt)
- Browser (GET requests)

---

## 📈 Future Enhancements

- DTO implementation
- Pagination & sorting
- Swagger / OpenAPI documentation
- Authentication (JWT)

---

## 👨‍💻 Author

**Nithin Raj**  
Aspiring Java Backend Developer
