# 🧩 Order Management System (CRUD with Spring Boot, H2 and MySQL)

This project is a **CRUD system (Create, Read, Update, Delete)** built with **Spring Boot**. It helps manage records in a relational database.
It has different **environment profiles (development, testing, production)** and is **ready to scale and deploy**.

---

## 📚 Table of Contents

* [🧠 General Description](#-general-description)
* [⚙️ Technologies Used](#️-technologies-used)
* [📦 Main Dependencies](#-main-dependencies)
* [🧱 Project Structure](#-project-structure)
* [🖥️ How to Clone](#️-how-to-clone)
* [▶️ How to Run](#️-how-to-run)
* [🌐 Environment Profiles (Sprint 2)](#-environment-profiles-sprint-2)
* [⚡ CRUD Explanation](#-crud-explanation)
* [🧩 H2 Database](#-h2-database)
* [🖼️ Profile Screenshots](#-profile-screenshots)
* [🚀 What Was Implemented](#-what-was-implemented)
* [🏁 Sprint 2 Delivery](#-sprint-2-delivery)
* [✍️ Credits](#-credits)

---

## 🧠 General Description

This project is a web app built with **Spring Boot** that uses CRUD operations on a database.
In **Sprint 1**, the CRUD structure and H2 database connection were created. In **Sprint 2**, environment profiles (**dev**, **test**, **prod**) were added.

> 💡 The system helps manage records (like orders, products, or users) with a web interface and keeps data organized in different environments.

---

## ⚙️ Technologies Used

| Type                  | Technology      |
| --------------------- | --------------- |
| Main language         | Java 17         |
| Framework             | Spring Boot 3.x |
| In-memory database    | H2              |
| Persistent database   | MySQL           |
| Front-end templates   | Thymeleaf       |
| Dependency management | Maven           |
| Development IDE       | IntelliJ IDEA   |
| Version control       | Git / GitHub    |

---

## 📦 Main Dependencies

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
</dependencies>
```

---

## 🧱 Project Structure

```
src/
 ├── main/
 │   ├── java/com/example/demo/
 │   │   ├── controller/
 │   │   │   └── ItemController.java
 │   │   ├── model/
 │   │   │   └── Item.java
 │   │   ├── repository/
 │   │   │   └── ItemRepository.java
 │   │   └── service/
 │   │       └── ItemService.java
 │   └── resources/
 │       ├── application.properties
 │       ├── application-dev.properties
 │       ├── application-test.properties
 │       └── application-prod.properties
 └── test/
     └── ItemControllerTest.java
```

---

## 🖥️ How to Clone

```bash
git clone https://github.com/tuusuario/nombre-del-proyecto.git
cd nombre-del-proyecto
```

---

## ▶️ How to Run

### 🔧 Run in development mode (default)

```bash
mvn spring-boot:run
```

### 🚀 Run in production mode

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

---

## 🌐 Environment Profiles (Sprint 2)

The project has **three environment profiles**:

| Profile | File                          | Database | Use               |
| ------- | ----------------------------- | -------- | ----------------- |
| dev     | `application-dev.properties`  | H2       | Local development |
| test    | `application-test.properties` | H2       | Automated tests   |
| prod    | `application-prod.properties` | MySQL    | Real production   |

### 🔁 How to change the profile

Edit this line in `application.properties`:

```properties
spring.profiles.active=prod
```

Or run from console:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=test
```

Spring Boot will show the active profile in console:

```
The following profiles are active: prod
```

---

## ⚡ CRUD Explanation

| Operation | HTTP Method | Endpoint                  | Description            |
| --------- | ----------- | ------------------------- | ---------------------- |
| Create    | POST        | `/items`                  | Add a new record       |
| Read      | GET         | `/items` or `/items/{id}` | Show all or one record |
| Update    | PUT         | `/items/{id}`             | Update a record        |
| Delete    | DELETE      | `/items/{id}`             | Delete a record by ID  |

### ⚡ CRUD Testing

All endpoints have been tested locally using Postman and the browser. Swagger documentation will be added in **Sprint 3**.

---

## 🧩 H2 Database

**H2** is an in-memory database, good for development and testing because it does not need installation.

### 🔗 Access H2 Console

1. Run the project in `dev` or `test` profile.
2. Open in browser:

   ```
   http://localhost:8080/h2-console
   ```
3. Enter the details from `application-dev.properties` (e.g., `jdbc:h2:mem:testdb`).

> ⚠️ When the server stops, data is deleted automatically. This makes testing fast and clean.

---

## 🖼️ Profile Screenshots

### Development (H2)

![Development Profile](Screenshots/BDD-dev.png)

### Testing (H2)

![Testing Profile](Screenshots/BDD-test.png)

### Production (MySQL)

![Production Profile](Screenshots/BDD-prod.png)

---

## 🚀 What Was Implemented

| Sprint | Goal                             | Deliverables                                                                       | Result                                  |
| ------ | -------------------------------- | ---------------------------------------------------------------------------------- | --------------------------------------- |
| 1      | Implement CRUD and H2 connection | Full CRUD, database connected                                                      | CRUD works correctly                    |
| 2      | Configure environment profiles   | `application-dev/test/prod.properties`, tested in all environments, README updated | Connections tested, documentation ready |

---

## 🏁 Sprint 2 Delivery

The project includes:

✅ CRUD tested and working
✅ Separate connections per environment
✅ H2 and MySQL correctly configured
✅ Technical documentation and run steps
✅ Code ready for GitHub or production deployment

---

## ✍️ Credits

💻 **Developed by:** Diego González Miranda
📄 **License:** Free to use
🚀 **Version:** Sprint 2 - October 2025
