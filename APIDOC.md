# API Documentation for Tutorial Application

This document outlines the RESTful API endpoints provided by the Tutorial application. Each endpoint is described with its HTTP method, path, request parameters, request and response body formats, and example responses.

## Endpoints

### 1. Get All Tutorials
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
        // more tutorials
      ]
      ```
- **Error Response**:
    - **Code**: 500 Internal Server Error
    - **Content**: `{"message": "Error occurred"}`

### 2. Get Tutorial by ID
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

### 3. Create a New Tutorial
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

### 5. Delete a Tutorial by ID
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

### 6. Delete All Tutorials
- **Endpoint**: `DELETE /api/tutorials`
- **Description**: Deletes all tutorials.
- **Example Request**: `DELETE /api/tutorials`
- **Success Response**:
    - **Code**: 204 No Content
- **Error Response**:
    - **Code**: 500 Internal Server Error
    - **Content**: `{"message": "Error deleting tutorials"}`

### 7. Find All Published Tutorials
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
        // more published tutorials
      ]
      ```
- **Error Response**:
    - **Code**: 204 No Content
