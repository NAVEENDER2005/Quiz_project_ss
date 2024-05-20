

# Quiz Project in ss

## Overview
This is a quiz application developed using Java Spring Boot for the backend and PostgreSQL for the database. The application supports creating, managing, and participating in quizzes. It includes features such as user authentication, quiz creation, question management, and answer submission.

## Features
- User authentication and authorization
- Quiz creation and management
- Question addition and management
- Answer submission and validation
- Result calculation and display

## Technologies Used
- **Backend:** Java, Spring Boot
- **Database:** PostgreSQL
- **APIs:** RESTful APIs

## Installation

### Prerequisites
- Java 17 or higher
- PostgreSQL
- Maven

### Steps
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/quiz-project.git
   cd quiz-project
Set up the PostgreSQL database:

Create a database named quizdb.
Update the application.properties file with your PostgreSQL credentials.
Build the project:

bash
Copy code
mvn clean install
Run the application:

bash
Copy code
mvn spring-boot:run
**API Endpoints**
**User Authentication**
Register: POST /api/auth/register
Login: POST /api/auth/login

**Quiz Management**
Create Quiz: POST /api/quizzes
Get All Quizzes: GET /api/quizzes
Get Quiz by ID: GET /api/quizzes/{id}
Update Quiz: PUT /api/quizzes/{id}
Delete Quiz: DELETE /api/quizzes/{id}

**Question Management**
Add Question: POST /api/quizzes/{quizId}/questions
Get All Questions: GET /api/quizzes/{quizId}/questions
Get Question by ID: GET /api/quizzes/{quizId}/questions/{questionId}
Update Question: PUT /api/quizzes/{quizId}/questions/{questionId}
Delete Question: DELETE /api/quizzes/{quizId}/questions/{questionId}

**Answer Submission**
Submit Answer: POST /api/quizzes/{quizId}/questions/{questionId}/answers
Get Results: GET /api/quizzes/{quizId}/results

**Contributing**
Contributions are welcome! Please fork the repository and create a pull request.

**Contact**
For any inquiries or feedback, please reach out to naveender.m@gmail.com

Developed by Your Naveender M
