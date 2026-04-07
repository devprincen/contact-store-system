# 📇 Contact Store System

A full-stack web application that allows users to securely manage and store their contacts. Built using modern technologies like **Spring Boot**, **Java**, and **React.js**, this project demonstrates authentication, API integration, and database handling.

---

## 🚀 Features

* 🔐 **User Authentication**

  * Login with predefined username and password
  * Token-based authentication (JWT)

* 🏠 **Home Dashboard**

  * Access granted only after successful login
  * Add and manage contacts securely

* ➕ **Add Contacts**

  * Store contact details like **Name** and **Email**
  * Token required for every authorized request

* ⚠️ **Validation & Error Handling**

  * Invalid login → Error popup
  * Empty fields (Name/Email) → Validation error

* 🔓 **Logout**

  * Secure logout from homepage

* 🎨 **Modern UI**

  * Clean and responsive design
  * Multiple pages using React Router

---

## 🛠️ Tech Stack

### Frontend:

* React.js
* React Router
* HTML, CSS, JavaScript

### Backend:

* Spring Boot
* Java
* REST APIs

### Database:

* MySQL

---

## 🔐 Authentication Flow

1. User enters predefined credentials
2. On successful login:

   * JWT Token is generated
3. Token is required to:

   * Access Home Page
   * Add Contacts
4. Invalid credentials → Access denied

---

## 📸 Project Image

### 🔑 Login Page

<img width="400" height="400" alt="Screenshot from 2026-04-07 18-22-37" src="https://github.com/user-attachments/assets/99c9ebf0-82b0-44bd-bb19-80dfd8b55d13" />

### 🏠 Home Page

 <img width="1400" height="600" alt="Screenshot from 2026-04-07 18-24-54" src="https://github.com/user-attachments/assets/b7bfaa4e-d22e-4831-85fc-419065cc18d9" />


### ➕ Add Contact

<img width="1400" height="600" alt="Screenshot from 2026-04-07 18-25-18" src="https://github.com/user-attachments/assets/468b87a8-ba23-4768-aa0e-abe9fa8bbdd1" />

### ➕ After Add Contact

<img width="1400" height="600" alt="Screenshot from 2026-04-07 18-25-24" src="https://github.com/user-attachments/assets/0dd8dd02-64d3-4c30-bba1-eadfbac5452f" />

---

## 📂 Project Structure

The project is organized into different directories and files. Here's a brief overview of the structure:

* **backend/**: Contains the Spring Boot application (Java backend logic).
* **frontend/**: Contains the React.js application (UI and client-side logic).
* **controller/**: Handles incoming API requests and responses.
* **service/**: Contains business logic and processing.
* **model/**: Defines data structures and entities.
* **repository/**: Manages database operations and queries.
* **security/**: Handles JWT authentication and authorization.
* **components/**: Reusable React components.
* **pages/**: Different UI pages like Login and Home.
* **routes/**: Manages navigation using React Router.
* **assets/**: Stores images, styles, and static files.

---

## ⚙️ Uses

This project is built using modern full-stack technologies:

* **Frontend**: React.js, React Router, HTML, CSS, JavaScript
* **Backend**: Spring Boot, Java
* **Authentication**: JWT (JSON Web Token)
* **API**: RESTful APIs
* **Database**: (MySQL / H2 - based on your setup)

This project demonstrates how frontend and backend communicate securely using APIs and token-based authentication.

---

## ⚙️ How to Run

### Backend:

```bash
cd backend
mvn spring-boot:run
```

### Frontend:

```bash
cd frontend
npm install
npm start
```

---

## 💡 Learning Outcomes

* Full-stack development
* JWT Authentication
* REST API integration
* State management in React
* Secure data handling

---

## 📌 Conclusion

This project is a complete **Contact Management System** that demonstrates real-world full-stack development skills, including authentication, API handling, and UI/UX design.

---

Contact Store System is a full-stack web application for managing contacts efficiently with CRUD operations. Built using **Spring Boot**, **React.js**, and **MySQL**, it includes features like user authentication (JWT), contact management, and search functionality with a responsive UI.

First, I implemented simple CRUD operations. Then, I connected the project with MySQL. After that, I added React.js and improved the UI to give it a more advanced and attractive look. Later, someone suggested that I should also integrate JWT (JSON Web Token), so I plan to add that as well.
