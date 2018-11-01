This project demonstrates how to write a Spring Boot application that has multiple related entities. Specifically, you get to learn the working on one to many and many to many relationship between entities.

# Running this application
1. Create a database and a user using the following commands:
```
CREATE DATABASE profilesdb;
CREATE USER 'john'@'localhost' identified by 'yourpasswordhere';
GRANT ALL ON contactsdb.* to 'john'@'localhost';
```

2. Import this project into Eclipse or Visual Studio Code

3. Configure application.properties with the appropriate values
4. Run the DemoApplication from your IDE
5. Examine the data created in the tables
```
show tables;
show create table profile;
show create table experience;
show create table website;
show create table profile_websites;
select * from profile;
select * from experience;
select * from website;
select * from profile_websites;
```