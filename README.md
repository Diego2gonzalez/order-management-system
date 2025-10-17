# 🛒 Order Management System – Spring Boot Project

> Developed by **Diego González Miranda**  
> Challenge: *Spring and Spring Boot in Java for Web Applications (Digital NAO)*  
> Sprint 1 – CRUD and Database Connection (H2)

---

## 📖 Project Description

This project is part of the **Digital NAO Challenge**, focused on solving issues in an online retail company’s **Order Management System**.  
The goal is to implement a **RESTful API** using **Spring Boot 3.0** and **Java 17**, providing a complete **CRUD** (Create, Read, Update, Delete) for order handling, connected to an **H2 in-memory database**.

Future sprints will include:
- Environment profiles for dev/test/prod
- Swagger documentation
- Unit and integration testing (JUnit)
- Final deployment and presentation

---

## 🧠 Table of Contents

1. [How to Clone and Run](#-how-to-clone-and-run)
2. [How It Works](#-how-it-works)
3. [CRUD Functionality Explained](#-crud-functionality-explained)
4. [Technologies Used](#-technologies-used)
5. [Dependencies](#-dependencies)
6. [Database (H2)](#-database-h2)
7. [Project Structure](#-project-structure)
8. [API Endpoints](#-api-endpoints)
9. [Example JSON](#-example-json)
10. [Testing the API](#-testing-the-api)
11. [Author](#-author)

---

## 🧩 How to Clone and Run

### 1️⃣ Prerequisites
Before starting, make sure you have installed:

- **Java 17+**
- **Maven 3.8+**
- **Git**
- (Optional) **Postman** for testing endpoints

### 2️⃣ Clone the repository

```bash
git clone https://github.com/YOUR-USERNAME/order-management-system.git
cd order-management-system
3️⃣ Run the application
bash
Copy code
mvn spring-boot:run
The application will be available at 👉
http://localhost:8080

⚙️ How It Works
The system simulates an order management platform for an e-commerce company.
Users can create, view, update, and delete orders stored in a database.

The backend is built with Spring Boot, using Spring MVC for routing and Spring Data JPA for database access.

When a user sends a POST request, a new order is created.

When a GET request is made, orders are retrieved from the database.

A PUT request updates an existing record.

A DELETE request removes the order.

All data is managed using a lightweight H2 in-memory database, which is automatically created when the app runs.

🧮 CRUD Functionality Explained
Operation	HTTP Method	Endpoint	Description
Create	POST	/orders	Adds a new order to the database.
Read	GET	/orders	Retrieves all existing orders.
Read by ID	GET	/orders/{id}	Retrieves a specific order by ID.
Update	PUT	/orders/{id}	Updates an order’s details.
Delete	DELETE	/orders/{id}	Deletes an order permanently.

🧾 Example JSON (for POST or PUT)
json
Copy code
{
  "customerName": "Diego González",
  "product": "Laptop HP Omen",
  "quantity": 2,
  "price": 1800.50,
  "date": "2025-10-16"
}
🧰 Technologies Used
Technology	Purpose
Java 17	Programming language
Spring Boot 3.0	Main framework for web development
Spring Web (MVC)	REST controller and routing
Spring Data JPA	Simplified database access
H2 Database	In-memory database for development
Postman	API testing
Maven	Build automation and dependency management

📦 Dependencies
Main dependencies in pom.xml:

xml
Copy code
<dependencies>
    <!-- Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>

    <!-- H2 Database -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Spring Boot Starter Test (for future Sprints) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
🗄️ Database (H2)
🔹 What is H2?
H2 is a lightweight, open-source in-memory relational database used for testing and development.
It stores data in the RAM, meaning it resets every time the application restarts.
This makes it perfect for prototypes or early project stages (like Sprint 1).

🔹 Configuration
File: src/main/resources/application.properties

properties
Copy code
spring.datasource.url=jdbc:h2:mem:ordersdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
Access the console at:
👉 http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:ordersdb

🧱 Project Structure
bash
Copy code
OrderManagementSystem/
├── src/
│   ├── main/
│   │   ├── java/com/example/ordermanagement/
│   │   │   ├── controller/         # REST Controllers (CRUD endpoints)
│   │   │   ├── entity/             # Entity classes (Order.java)
│   │   │   ├── repository/         # JPA Repositories (OrderRepository.java)
│   │   │   └── service/ (optional) # Business logic (future sprint)
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql (optional: preload data)
│   └── test/
│       └── java/com/example/ordermanagement/
│           └── OrderControllerTests.java
└── pom.xml
🌐 API Endpoints Overview
Method	Endpoint	Description	Example
POST	/orders	Create a new order	/orders
GET	/orders	Get all orders	/orders
GET	/orders/{id}	Get order by ID	/orders/1
PUT	/orders/{id}	Update order	/orders/1
DELETE	/orders/{id}	Delete order	/orders/1

🧪 Testing the API with Postman
Open Postman

Create a new collection called Order Management

Add requests for:

POST /orders

GET /orders

PUT /orders/{id}

DELETE /orders/{id}

Use the example JSON above for body requests.

Verify correct responses (status codes 200, 201, 204).

✅ What Was Done (Sprint 1)
Task	Description	Status
Create CRUD operations	Implemented POST, GET, PUT, and DELETE methods.	✅
Configure H2 database	Connected and tested local H2 in-memory DB.	✅
Test endpoints	Verified CRUD in Postman successfully.	✅
Add JavaDoc comments	Documented public classes and methods.	✅
Prepare GitHub repository	Project uploaded and documented.	✅

👨‍💻 Author
Diego González Miranda
📅 October 2025
🎓 Pathway: Spring and Spring Boot in Java for Web Applications
🏫 Institution: ITESP
🌍 Location: Michoacán, México

