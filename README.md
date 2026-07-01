<div align="center">

<img src="assets/banner.png" alt="Event Ticketing Platform Banner" width="500"/>

# 🎟️ Event Ticketing Platform

### Production-Ready Event Ticketing Backend built with Java & Spring Boot

[![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)]()
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot)]()
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-17-336791?style=for-the-badge&logo=postgresql)]()
[![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)]()
[![Git](https://img.shields.io/badge/Git-Version_Control-F05032?style=for-the-badge&logo=git)]()

*A production-oriented backend application built using modern Spring Boot architecture and software engineering best practices.*

</div>

---

#  Overview

The **Event Ticketing Platform** is a backend application designed to simulate a real-world ticket booking ecosystem.

Rather than simply implementing CRUD operations, this project is being developed following **industry-standard backend architecture**, emphasizing clean code, maintainability, scalability, and professional software engineering practices.

The goal is to understand **how production Spring Boot applications are designed**, not just how to make them work.

---

#  Objectives

- Learn Spring Boot by building a real project
- Master Layered Architecture
- Understand Dependency Injection deeply
- Build production-quality REST APIs
- Work with PostgreSQL using JPA/Hibernate
- Apply Spring Security and JWT Authentication
- Follow professional Git workflow
- Create a portfolio-quality backend project

---

#  Current Progress

##  Sprint 1 — Project Initialization

- Spring Boot Project Setup
- Maven Configuration
- Java 21 Configuration
- PostgreSQL Integration
- Git Repository Initialization
- GitHub Repository Setup
- Spring Security Configuration
- Health Check REST API
- DTO Creation
- JSON Response

---

##  Sprint 2 — Layered Architecture

- Service Layer
- Dependency Injection
- Constructor Injection
- Spring Bean Management
- Separation of Concerns
- Controller Refactoring

---

#  Current Architecture

```text
Browser
    │
    ▼
HealthController
    │
    ▼
HealthService
    │
    ▼
HealthResponse (DTO)
    │
    ▼
JSON Response
```

Future architecture:

```text
Browser
    │
    ▼
Controller
    │
    ▼
Service
    │
    ▼
Repository
    │
    ▼
PostgreSQL
```

---

#  Tech Stack

## Backend

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security

## Database

- PostgreSQL 17
- Hibernate ORM

## Build Tool

- Maven

## Development

- IntelliJ IDEA
- Git
- GitHub

---

#  Project Structure

```text
src
└── main
    ├── java
    │   └── com.mohansai.eventticketing
    │       ├── common
    │       ├── config
    │       ├── controller
    │       ├── dto
    │       ├── entity
    │       ├── exception
    │       ├── repository
    │       ├── security
    │       ├── service
    │       ├── util
    │       └── EventTicketingPlatformApplication.java
    │
    └── resources
        └── application.properties
```

---

#  API

## Health Check Endpoint

### Request

```http
GET /api/v1/health
```

### Sample Response

```json
{
    "status": "UP",
    "application": "event-ticketing-platform",
    "version": "1.0.0",
    "timestamp": "2026-07-01T15:36:05.1034961"
}
```

---

#  Concepts Implemented

- REST APIs
- DTO (Data Transfer Object)
- Controller Layer
- Service Layer
- Spring Beans
- Dependency Injection
- Constructor Injection
- JSON Serialization
- Layered Architecture
- Spring Security Configuration
- Git Workflow

---

#  Development Roadmap

## Phase 1 

- [x] Spring Boot Setup
- [x] PostgreSQL Configuration
- [x] Health Check API
- [x] DTO Layer
- [x] Service Layer

---

## Phase 2 

- [ ] Event Entity
- [ ] Repository Layer
- [ ] Event Service
- [ ] CRUD REST APIs
- [ ] Validation

---

## Phase 3

- [ ] User Registration
- [ ] Login
- [ ] JWT Authentication
- [ ] Role-Based Authorization

---

## Phase 4

- [ ] Venue Management
- [ ] Seat Management
- [ ] Booking Module
- [ ] Payment Integration (Simulation)

---

## Phase 5

- [ ] Global Exception Handling
- [ ] Logging
- [ ] Pagination
- [ ] Filtering
- [ ] Unit Testing
- [ ] Integration Testing

---

## Phase 6

- [ ] Docker
- [ ] CI/CD
- [ ] Deployment

---

#  Local Setup

Clone the repository

```bash
git clone https://github.com/MohanSaiPandeti/event-ticketing-platform.git
```

Navigate to the project

```bash
cd event-ticketing-platform
```

Run the application

```bash
./mvnw spring-boot:run
```

or on Windows

```bash
mvnw.cmd spring-boot:run
```

---

#  Learning Approach

This repository is intentionally being built **feature by feature**.

Each sprint follows this workflow:

```text
Learn Concept
      │
      ▼
Design
      │
      ▼
Implement
      │
      ▼
Test
      │
      ▼
Git Commit
      │
      ▼
Push to GitHub
```

The objective is to understand **why** each design decision is made rather than simply following tutorials.

---

#  Author

## Mohan Sai Pandeti

 **Email**

pandetimohansai@gmail.com

 **LinkedIn**

https://www.linkedin.com/in/mohansaipandeti/

---

#  Future Vision

By the end of development, this repository will include:

- Clean Architecture
- Spring Security + JWT
- PostgreSQL
- JPA/Hibernate
- Docker
- Unit & Integration Testing
- API Documentation
- CI/CD Pipeline
- Production Deployment

---

<div align="center">

###  If you like this project, consider giving it a star!

**More exciting features coming soon...**

</div>
