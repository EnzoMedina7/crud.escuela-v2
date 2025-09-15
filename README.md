This project is a CRUD application (Create, Read, Update, Delete) built with Spring Boot and PostgreSQL to manage student information. Technologies -Java 24 -Spring Boot 3.5.5 -Maven -PostgreSQL 17 -pgAdmin 4 -Postman

Features Create Student → POST /api/alumnos Get All Students → GET /api/alumnos Get Student by ID → GET /api/alumnos/{id} Update Student → PUT /api/alumnos/{id} Delete Student → DELETE /api/alumnos/{id}

Project Structure model/Alumno.java → JPA entity representing the student repository/AlumnoRepository.java → Repository interface extending JpaRepository controller/AlumnoController.java → REST controller exposing CRUD endpoints

How to Run Clone the repository Configure your database in application.properties Run the application with: mvn spring-boot:run Test the endpoints using Postman or in your browser at http://localhost:8080/api/alumnos.
