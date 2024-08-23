# Springstorebook
## SPRING-BOOK-STORE SYSTEM
#### IMPORTANT: 
To run the website, the developer should go to MySQL and create a schema (database),
Then, from the MySQL, please import database's structure and data from the following folder
      .\database.sql
to the created database and dumbdata.

#### IMPORTANT 2: 
The developer please goes to resources\application.properties
then change the database password to your current one in order to use it.

- The developer can run the website by accessing localhost:2400
- for login as admin account:
  admin@gmail.com
  admin

- for login as buyer:
  test123@gmail.com
  test123

#### Technologies
+ Spring boot MVC with thymeleaf + Rest API.
+ Hibernate, lombok + JPA as ORM.
+ MySQL as the database.
+ Springboot Security as authentication & authorization.
+ Springboot multipart support for upload file.
+ Project Features
+ Roles: Admin, User

#### Features of Admin
+ Manage banner
+ Manage user
+ Manage type
+ Manage category
+ Manage product
+ Manage order
+ Manage voucher
  
#### Features of User
- Register
- Login and logout
- View store pages
- Shopping cart management
- Checkout
