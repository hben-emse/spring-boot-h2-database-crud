# Spring Boot H2 CRUD Application

## Overview
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

### Configuration

- **Database Configuration**: Located in `src/main/resources/application.properties`. Adjust settings here to change database behavior.
- **Port Configuration**: By default, the application runs on port 8080. This can be changed in the `application.properties` file.


## Architecture

This architecture of this application is a MVC (Model-View-Controller) one.

- **Model**: Represents the data structure. Located under `src/main/java/com/project/model`.
- **View**: Thymeleaf templates for the UI. Located under `src/main/resources/templates`.
- **Controller**: Handles HTTP requests. Located under `src/main/java/com/project/controller`.

## Technologies used

- **Spring Boot**: to simplify the setup and development of new Spring applications.
- **H2 Database**: an in-memory database used for rapid development and testing.

## API Documentation

This document outlines the RESTful API endpoints provided by the Tutorial application. Each endpoint is described with its HTTP method, path, request parameters, request and response body formats, and example responses.

### Endpoints

#### 1. Get All Tutorials
- **Endpoint**: `GET /api/tutorials`
- **Description**: Retrieves all tutorials. Can filter tutorials by title.
- **Query Parameters**:
    - `title` (optional, string): Filters tutorials by title (case-insensitive partial match).
- **Example Request**: `GET /api/tutorials?title=Spring`
- **Success Response**:
    - **Code**: 200 OK
    - **Content Example**:
      ```json
      [
        {
          "id": 1,
          "title": "Spring Boot Tutorial",
          "description": "Introduction to Spring Boot",
          "published": true
        }
      ]
      ```
- **Error Response**:
    - **Code**: 500 Internal Server Error
    - **Content**: `{"message": "Error occurred"}`

#### 2. Get Tutorial by ID
- **Endpoint**: `GET /api/tutorials/{id}`
- **Description**: Retrieves a specific tutorial by its ID.
- **Path Variables**:
    - `id` (required, long): The ID of the tutorial.
- **Example Request**: `GET /api/tutorials/1`
- **Success Response**:
    - **Code**: 200 OK
    - **Content Example**:
      ```json
      {
        "id": 1,
        "title": "Spring Boot Tutorial",
        "description": "Introduction to Spring Boot",
        "published": true
      }
      ```
- **Error Response**:
    - **Code**: 404 Not Found
    - **Content**: `{"message": "Tutorial not found"}`

#### 3. Create a New Tutorial
- **Endpoint**: `POST /api/tutorials`
- **Description**: Creates a new tutorial.
- **Request Body**:
    - **Content Example**:
      ```json
      {
        "title": "New Tutorial",
        "description": "Tutorial Description",
        "published": false
      }
      ```
- **Success Response**:
    - **Code**: 201 Created
    - **Content Example**:
      ```json
      {
        "id": 2,
        "title": "New Tutorial",
        "description": "Tutorial Description",
        "published": false
      }
      ```
- **Error Response**:
    - **Code**: 500 Internal Server Error
    - **Content**: `{"message": "Error creating tutorial"}`

### 4. Update an Existing Tutorial
- **Endpoint**: `PUT /api/tutorials/{id}`
- **Description**: Updates an existing tutorial.
- **Path Variables**:
    - `id` (required, long): The ID of the tutorial to update.
- **Request Body**:
    - **Content Example**:
      ```json
      {
        "title": "Updated Tutorial Title",
        "description": "Updated Description",
        "published": true
      }
      ```
- **Success Response**:
    - **Code**: 200 OK
    - **Content Example**:
      ```json
      {
        "id": 1,
        "title": "Updated Tutorial Title",
        "description": "Updated Description",
        "published": true
      }
      ```
- **Error Response**:
    - **Code**: 404 Not Found
    - **Content**: `{"message": "Tutorial not found"}`

#### 5. Delete a Tutorial by ID
- **Endpoint**: `DELETE /api/tutorials/{id}`
- **Description**: Deletes a tutorial by its ID.
- **Path Variables**:
    - `id` (required, long): The ID of the tutorial to delete.
- **Example Request**: `DELETE /api/tutorials/1`
- **Success Response**:
    - **Code**: 204 No Content
- **Error Response**:
    - **Code**: 500 Internal Server Error
    - **Content**: `{"message": "Error deleting tutorial"}`

#### 6. Delete All Tutorials
- **Endpoint**: `DELETE /api/tutorials`
- **Description**: Deletes all tutorials.
- **Example Request**: `DELETE /api/tutorials`
- **Success Response**:
    - **Code**: 204 No Content
- **Error Response**:
    - **Code**: 500 Internal Server Error
    - **Content**: `{"message": "Error deleting tutorials"}`

#### 7. Find All Published Tutorials
- **Endpoint**: `GET /api/tutorials/published`
- **Description**: Retrieves all tutorials that are marked as published.
- **Example Request**: `GET /api/tutorials/published`
- **Success Response**:
    - **Code**: 200 OK
    - **Content Example**:
      ```json
      [
        {
          "id": 2,
          "title": "Published Tutorial",
          "description": "Description of published tutorial",
          "published": true
        }
      ]
      ```
- **Error Response**:
    - **Code**: 204 No Content

    

## Troubleshooting

- **Application Doesn't Start**: Ensure that the correct Java and Maven versions are installed.
- **Database Connection Issues**: Verify the database configuration in `application.properties`.

## Contributing 

To contribute please respect these guidelines:
- **Code Style**: Adhere to standard Java coding conventions.
- **Testing**: Add unit tests for new features.
- **Pull Requests**: Submit PRs with detailed descriptions.

## FAQ

**Q: Can I use a different database?**
A: Yes, modify the `application.properties` file to connect to a different database.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For support or further questions, contact us at [hben.emse@gmail.com].

## Changelog

**v1.1.0** - Initial release.