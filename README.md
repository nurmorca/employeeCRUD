# employee crud application

a simple employee management system built with spring boot and thymeleaf that allows you to perform basic crud operations on employee records.

## features

- view list of all employees
- add new employees
- update existing employee information
- delete employees
- clean and responsive ui with thymeleaf templates
- mysql database integration

## technologies used

- java
- spring boot
- spring data jpa
- thymeleaf
- mysql
- html/css
- bootstrap

## prerequisites

before running this application, make sure you have the following installed:

- java 8 or higher
- maven
- mysql server

## database setup

create a mysql database for the application and run `scripts.sql`.

## configuration

to run the application locally, you need to configure your database connection in the `application.properties` file located in `src/main/resources/`.

update the following properties with your mysql database information:

```properties
# database configuration
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/employee_tracker
spring.datasource.username=your_username
spring.datasource.password=your_password
```
replace `your_username` and `your_password` with your actual mysql credentials. you also need to change the `spring.datasource.url` field if you're using a database other than mysql.

## how to run

1. clone the repository:
```bash
git clone https://github.com/nurmorca/employeeCRUD.git
cd employeeCRUD
```

2. configure your database settings in `application.properties` as described above

3. run the application using maven:
```bash
mvn spring-boot:run
```

4. open your web browser and navigate to:
```
http://localhost:8080
```
