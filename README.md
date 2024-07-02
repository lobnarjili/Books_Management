# Books_Management
# Description
This project consists of a Book Management App that uses Spring Boot for the backend, Angular for the frontend, and MySQL as the database . Backend Book Management App is a Spring Boot application for managing books. It provides RESTful endpoints to create, read, update, and delete book information Frontend Book Mangement App is a angular application for managing Books  It provides Interface to create, read, update, and delete book information .

## Backend 
The application will be accessible at http://localhost:1997.

# Dependencies
. Spring Boot Starter Parent: 3.3.0
. Spring Boot Starter Data JPA
. Spring Boot Starter Validation
. Spring Boot Starter Web
. Spring Boot DevTools
. Project Lombok
. Spring Boot Starter Test
. MySQL Connector Java
. Sping boot starter oauth2 resource server

# Configuration
The application uses MySQL as the database. create a new DataBase "books_db" . Configure the application.properties file with your database settings :
 
spring.datasource.url=jdbc:mysql://localhost:3306/books_db
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true



## Frontend 
This project was generated with Angular CLI version 16.2.9 and uses node v18.4.0

# Installation
To install the project dependencies, follow these steps:

1. Clone this repository: git clone https://github.com/lobnarjili/Books_Management.git 

2. Navigate into the project directory: cd Frontend_bookStore

3. Install the dependencies with npm: npm install

Run ng serve  for a dev server. Navigate to http://localhost:4200/. The application will automatically reload if you change any of the source files.
