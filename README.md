# 🧾 Order Management System – Spring Boot Project

A complete CRUD web application built with **Spring Boot**, **Thymeleaf**, and **H2 Database**.  
Developed as part of the **Digital NAO Java Challenge**, this project demonstrates the use of Spring Boot architecture, controllers, services, repositories, and database integration.

---

## 📚 Table of Contents
- [🚀 Project Overview](#-project-overview)
- [⚙️ Technologies Used](#️-technologies-used)
- [📦 Dependencies](#-dependencies)
- [💾 Database (H2)](#-database-h2)
- [🧠 How It Works](#-how-it-works)
- [🧩 CRUD Functionalities](#-crud-functionalities)
- [📋 How to Clone and Run](#-how-to-clone-and-run)
- [📁 Folder Structure](#-folder-structure)
- [✅ What Was Implemented](#-what-was-implemented)
- [🧱 Future Improvements](#-future-improvements)
- [👨‍💻 Author](#-author)

---

## 🚀 Project Overview

This is a **Spring Boot-based Order Management System**.  
It allows users to **create, read, update, and delete (CRUD)** order records stored in an H2 database.  
The project simulates a real-world backend connected to a frontend built with **Thymeleaf templates**.

---

## ⚙️ Technologies Used

| Technology | Description |
|-------------|-------------|
| **Java 17** | Programming language |
| **Spring Boot 3** | Framework for rapid application development |
| **Spring Web** | To handle REST controllers and routing |
| **Spring Data JPA** | To manage database access |
| **H2 Database** | Lightweight in-memory database for testing |
| **Thymeleaf** | Template engine for frontend rendering |
| **Maven** | Dependency management and build tool |
| **Git & GitHub** | Version control and repository hosting |

---

## 📦 Dependencies

Main dependencies from the `pom.xml` file:

| Dependency | Use |
|-------------|-----|
| `spring-boot-starter-web` | Web and REST controllers |
| `spring-boot-starter-data-jpa` | ORM and repository pattern |
| `spring-boot-starter-thymeleaf` | Frontend templates |
| `com.h2database:h2` | In-memory database |
| `spring-boot-starter-test` | Testing utilities |

---

## 💾 Database (H2)

**H2** is an **in-memory database** that stores data temporarily while the application is running.  
It is ideal for development and testing because it does not require installation or configuration.

You can access the H2 console by visiting:

http://localhost:8080/h2-console

pgsql
Copy code

**Configuration Example (`application.properties`):**

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
🧠 How It Works
The user interacts with an HTML page built using Thymeleaf.

The form sends data to the Controller using HTTP methods.

The Controller delegates actions to the Service, which handles logic.

The Service communicates with the Repository, which interacts with the H2 database.

The results (data or messages) are returned to the frontend.

🧩 CRUD Functionalities
Operation	HTTP Method	Description	Example Endpoint
Create	POST	Adds a new order to the database	/orders/add
Read	GET	Retrieves all existing orders	/orders
Update	PUT	Updates an existing order’s data	/orders/update/{id}
Delete	DELETE	Removes an order from the database	/orders/delete/{id}

🧱 Create
Implemented with a POST request.

Uses a form or JSON body to send order data.

Data is persisted in H2 through the repository layer.

🔍 Read
Implemented with a GET request.

Returns a list of all stored orders.

Rendered using Thymeleaf templates or Postman.

✏️ Update
Implemented with a PUT request.

Updates existing order details by ID.

Validated and saved again to the database.

🗑️ Delete
Implemented with a DELETE request.

Removes an order by ID.

Confirms deletion through console logs or the frontend.

📋 How to Clone and Run
1️⃣ Clone the repository
bash
Copy code
git clone https://github.com/<your-username>/order-management-system.git
2️⃣ Navigate to the project folder
bash
Copy code
cd order-management-system
3️⃣ Build the project
bash
Copy code
mvn clean install
4️⃣ Run the application
bash
Copy code
mvn spring-boot:run
Then open:

arduino
Copy code
http://localhost:8080
📁 Folder Structure
swift
Copy code
OrderManagementSystem/
├── src/
│   ├── main/
│   │   ├── java/com/example/ordermanagement/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   │       ├── templates/
│   │       ├── static/
│   │       └── application.properties
├── pom.xml
└── README.md
✅ What Was Implemented
Sprint	User Stories Implemented	Duration
Sprint 1	CRUD operations (Create, Read, Update, Delete) and H2 connection	3 days
Sprint 2	Migration to MySQL, validations, and simple front-end	3 days
Sprint 3	Documentation, deployment on GitHub, and project packaging	2 days

🧱 Future Improvements
Add authentication and authorization.

Migrate frontend to React or Angular.

Integrate Swagger documentation.

Deploy on a cloud service like AWS or Render.

👨‍💻 Author
Diego González Miranda