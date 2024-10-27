# Calorie Counter App

This is a full-stack calorie counter application that lets users search for and view nutritional information about different foods. The backend is built with Java and Spring Boot, while the frontend is created using Vite, React, TypeScript, Tailwind CSS, and shadcn UI.

## Features
- **Search**: Enter a food item name in the search box to find relevant nutritional information.
- **Backend**: Developed with Spring Boot, exposing REST APIs to fetch food item data from a MySQL database.
- **Frontend**: Built with Vite and React, styled using Tailwind CSS and shadcn UI for a modern, responsive design.
- **Database Integration**: XML data is parsed and stored in a MySQL database, allowing users to query for nutritional data.

## Technologies Used
- **Frontend**: Vite, React, TypeScript, Tailwind CSS, shadcn UI
- **Backend**: Java, Spring Boot, JPA (for database integration)
- **Database**: MySQL

## Prerequisites
- **Java**: JDK 17 or higher
- **Node.js**: Version 16+ (for frontend)
- **MySQL**: A running MySQL instance
- **Maven**: To build the Spring Boot application

## Setup Instructions

### 1. Clone the Repository

2. Backend Setup
Step 2.1: Database Setup
Create a MySQL database for the app (e.g., calorie_counter_db).
Update the connection details in the backend configuration file.
In src/main/resources/application.properties, replace the placeholders with your database credentials:

properties

Copy code below
spring.datasource.url=jdbc:mysql://localhost:3306/calorie_counter_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

Step 2.2: Load Data
Ensure that your XML file with food data is placed in the appropriate directory in src/main/resources/data/.
Run the application once to load the data by navigating to http://localhost:8080/load-data.

Step 2.3: Start the Spring Boot Server
From the root directory of the backend:

mvn spring-boot:run

The backend server should now be running on http://localhost:8080.

3. Frontend Setup
Navigate to the frontend folder:
Install dependencies:

npm install
Start the Vite development server:

npm run dev
The frontend server should now be running at http://localhost:5173 (or the port specified by Vite).

4. Application Structure
Frontend (React): Uses Vite for fast builds, with a responsive UI styled using Tailwind CSS and shadcn UI. The frontend is seamlessly integrated with the backend API.
Backend (Spring Boot): Spring Boot is used to expose REST APIs that handle queries for food data. JPA/Hibernate handles interactions with MySQL, and XML parsing is used to load food data.
5. Expertise Showcased
Spring Boot API Development: Expertise in creating RESTful services, handling data parsing, and JPA/Hibernate ORM integration.
Frontend Development: Modern frontend stack using Vite, React, TypeScript, and Tailwind CSS, demonstrating advanced UI capabilities with shadcn UI.
Database Integration: Successfully parsed large XML data files into a relational database and enabled data querying.
Full-Stack Integration: Established and tested full-stack communication between React frontend and Spring Boot backend, ensuring data consistency and smooth API integration.
Testing
To test the backend, navigate to http://localhost:8080/api/food/{food-item-name} to get information for specific food items.
For frontend, test the search feature in the search box to check that it correctly pulls information from the backend.

