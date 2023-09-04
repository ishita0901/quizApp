# Spring Boot Quiz Application

## Table of Contents
- Overview
- Features
- Usage
- Endpoints

## Overview

The Spring Boot Quiz Application is a web-based quiz platform developed using Spring Boot, which provides a robust backend for creating, reading, and updating questions. It also incorporates Object-Relational Mapping (ORM) through the Java Persistence API (JPA) for seamless database operations.

## Features

- Create, read, and update quizzes.
- Create, read, and update questions.
- Store quiz and question data in a relational database using JPA.
- User-friendly API endpoints for interacting with quizzes and questions.

## Usage

### Endpoints
The API provides the following endpoints:
- GET /questions/allQuestions: Retrieve all questions.
- GET /questions/language/{language}: Retrieve specific questions by language.
- POST /quiz: Create a new quiz.
- POST/questions/add: Create new questions
- PUT /questions/{question}: Update an existing question.

### Examples
Here are some sample API requests-
- https://quizapp-production-fc3a.up.railway.app/questions/allQuestions
- https://quizapp-production-fc3a.up.railway.app/questions/language/python
- https://quizapp-production-fc3a.up.railway.app/questions/language/java
