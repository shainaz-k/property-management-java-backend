
Property Management System
Overview
This is a Spring Boot-based Property Management System that allows users to manage properties and perform basic arithmetic operations using a calculator API. The system supports CRUD operations for properties, user authentication (registration and login), and database connectivity using MySQL.

How to Run the Project
Prerequisites
Java 8 or later installed
Maven installed
MySQL Server running
Postman for API testing (optional)
Steps to Set Up and Run
Clone the Repository

bash
Copy
Edit
git clone <repository-url>
cd property-management
Configure MySQL Database

Ensure MySQL is running and create a database named property_management.
Update the database configurations in application.properties:
properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/property_management
spring.datasource.username=root
spring.datasource.password=root
Enable the H2 database console if needed:
properties
Copy
Edit
spring.h2.console.enabled=true
Build and Run the Project

bash
Copy
Edit
mvn clean install
mvn spring-boot:run
The application will start on port 7278.

API Endpoints
Calculator API
Addition: GET /api/v1/calculator/add/{num3}?num1=value&num2=value
Subtraction: GET /api/v1/calculator/sub/{num111}/{num2}
Multiplication: POST /api/v1/calculator/mul (Requires JSON body)
User API
Register a new user: POST /api/v1/user/register
Login: POST /api/v1/user/login
Property API
Create a property: POST /api/v1/properties
Retrieve all properties: GET /api/v1/properties
Retrieve properties by user ID: GET /api/v1/properties/users/{userId}
Update property: PUT /api/v1/properties/{propertyId}
Update property description: PATCH /api/v1/properties/update-description/{propertyId}
Update property price: PATCH /api/v1/properties/update-price/{propertyId}
Delete a property: DELETE /api/v1/properties/{propertyId}
Testing in Postman
1. User Registration
Method: POST
URL: http://localhost:7278/api/v1/user/register
Body (JSON):
json
Copy
Edit
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "password": "password123"
}
2. User Login
Method: POST
URL: http://localhost:7278/api/v1/user/login
Body (JSON):
json
Copy
Edit
{
  "email": "john.doe@example.com",
  "password": "password123"
}
3. Create a Property
Method: POST
URL: http://localhost:7278/api/v1/properties
Body (JSON):
json
Copy
Edit
{
  "name": "Luxury Apartment",
  "location": "New York",
  "price": 1000000.00
}
4. Retrieve All Properties
Method: GET
URL: http://localhost:7278/api/v1/properties
5. Delete a Property
Method: DELETE
URL: http://localhost:7278/api/v1/properties/{propertyId}
Database Information
Database: MySQL
Dialect: org.hibernate.dialect.MySQL8Dialect
Driver: com.mysql.cj.jdbc.Driver
Logs and Debugging
Enable SQL logging by setting:
properties
Copy
Edit
spring.jpa.show-sql=true
Application logs are displayed in the console.
Technologies Used
Java 8+
Spring Boot
Spring Data JPA
Spring MVC
MySQL
H2 (for in-memory testing)
Maven
