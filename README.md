# Spring Boot CRUD Application with H2 Database

This project is a Spring Boot application that provides a CRUD (Create, Read, Update, Delete) API, backed by an H2 in-memory database.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java JDK 8 or later
- Maven

### Installing

1. Clone the repository:

2. Navigate to the project directory:
```
cd spring-boot-h2-database-crud
```
3. Build the project:
```
mvn clean install
```
4. Run the application:
```
mvn spring-boot:run
```
## Usage

Once the application is running, you can access the CRUD API endpoints at `http://localhost:8080/`.

- `/api/tutorials`: GET, POST, DELETE
- `/api/tutorials/{id}`: GET, PUT, DELETE
- `/api/tutorials/published`: GET

## Running the Tests
```
mvn test
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

