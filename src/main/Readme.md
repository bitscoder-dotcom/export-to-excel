Customer Management System
This is a simple application that allows you to manage customer information. It enables you to export all customer data to an Excel file.

Table of Contents
Technologies Used
How to Run the Application
API Endpoints
Excel Export
Contributing
License
Technologies Used
Java 17
Spring Boot 3.0.6
Maven
MySQL 8.0
Apache POI 5.2.3
How to Run the Application
To run the application, you need to have the following installed on your system:

Java 17 or later
MySQL 8.0 or later
To get started, follow these steps:

Clone the repository:

bash
Copy code
git clone https://github.com/your-username/customer-management-system.git
cd customer-management-system
Configure the database by editing the application.properties file:

properties

Copy code

spring.datasource.url=jdbc:mysql://localhost:3306/customerdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your-password
Build and run the application:

bash
Copy code
mvn spring-boot:run
The application will be available at http://localhost:8080/customers.

API Endpoints
The following endpoints are available:

Method	Endpoint	Description
GET	/customers	Get all customers
GET	/customers/{id}	Get a customer by ID
POST	/customers	Add a new customer
PUT	/customers/{id}	Update an existing customer
DELETE	/customers/{id}	Delete a customer
GET	/customers/export-to-excel	Export all customers to an Excel file
Excel Export
To export all customers to an Excel file, send a GET request to the /customers/export-to-excel endpoint. The application will return a file named Customers_Information.xlsx.

Contributing
If you'd like to contribute to this project, please follow these steps:

Fork the repository
Create a new branch (git checkout -b my-new-feature)
Make your changes
Commit your changes (git commit -am 'Add some feature')
Push to the branch (git push origin my-new-feature)
Create a new pull request
License
This project is licensed under the MIT License. See the LICENSE file for details.