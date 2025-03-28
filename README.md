# TodoList REST API

This is a simple REST API for managing a Todo List using **Java Spring Boot**. It provides basic CRUD operations for handling tasks.

## Features
- **Create a Task** (`POST /task/post`)
- **Retrieve all Tasks** (`GET /task/getAll`)
- **Retrieve a Task by ID** (`GET /task/get/{id}`)
- **Update a Task** (`PUT /task/put`)
- **Delete a Task** (`DELETE /task/delete/{id}`)

## Technologies Used
- **Java 17+**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **Maven**
- **MongoDB** *(or update with your database choice)*

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/todolist-api.git
   cd todolist-api
   ```
2. Install dependencies and build the project:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
4. The API will be accessible at `http://localhost:8080/task`

## API Endpoints
### 1. Create a Task
- **URL:** `POST /task/post`
- **Request Body:**
  ```json
  {
    "title": "My Task",
    "description": "This is a new task",
    "completed": false
  }
  ```
- **Response:** Returns the created task with `201 Created`.

### 2. Get All Tasks
- **URL:** `GET /task/getAll`
- **Response:** Returns a list of all tasks.

### 3. Get a Task by ID
- **URL:** `GET /task/get/{id}`
- **Response:** Returns the task if found, else `404 Not Found`.

### 4. Update a Task
- **URL:** `PUT /task/put`
- **Request Body:**
  ```json
  {
    "id": 1,
    "title": "Updated Task",
    "description": "Updated description",
    "completed": true
  }
  ```
- **Response:** Returns `200 OK` if successful.

### 5. Delete a Task
- **URL:** `DELETE /task/delete/{id}`
- **Response:** Returns `200 OK` if successful, or `404 Not Found` if the task does not exist.

## Future Improvements
- Add user authentication.
- Implement task priorities and deadlines.
- Improve error handling and validation.

## License
This project is licensed under the **MIT License**.

---
Feel free to contribute by submitting issues and pull requests! 🚀

