# CRUD-USER-APP-using-JSP-and-Servlets
A simple web application built using JSP, Servlets, and MySQL to perform CRUD operations on user data.
# User CRUD App

A simple web application built using JSP, Servlets, and MySQL that performs full CRUD (Create, Read, Update, Delete) operations on user data.

This project was developed as part of my learning journey at **Meerut Institute of Engineering and Technology (MIET)** to gain practical experience in Java EE technologies and full-stack web development.

## 💡 Features

- ➕ Add new users
- 👀 View all users
- 📝 Update existing user details
- ❌ Delete users from the database
- ✅ Simple and responsive UI using HTML, CSS, and JavaScript

## 🧰 Technologies Used

- Java (JDK 8+)
- JSP & Servlets
- Apache Tomcat 10
- MySQL 8
- JDBC
- HTML/CSS/JS (Vanilla)
- Eclipse IDE (Dynamic Web Project)

## 📁 Project Structure

UserCRUDApp/
├── WebContent/
│ ├── assets/ # CSS, JS, images
│ ├── site.jsp # Main JSP logic
│ ├── about.jsp # About page
│ └── other JSP pages
├── src/
│ └── org.studyeasy/ # Servlet classes
├── lib/ # MySQL JDBC driver
├── .project/.classpath # Eclipse metadata
## 🛠️ Database Setup

Before running the project, create the required database and table using the following SQL:

```sql
CREATE DATABASE userdb;

USE userdb;

CREATE TABLE users (
  user_id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL
);
