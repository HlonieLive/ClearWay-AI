# ClearWay-AI

## Overview
ClearWay-AI is a Smart City Route Management System architected as a **microservices-based** application. It is designed to enhance urban mobility by optimizing transport routes through a distributed system of specialized services. The system aims to reduce travel times, congestion, and operational costs for transport authorities.

## Architecture
The system is decomposed into the following core microservices:

1.  **Graph Service**:
    *   Manages the city's road network data (nodes and edges).
    *   Provides endpoints to query connectivity, distances, and traffic conditions.
2.  **Routing Service**:
    *   Implements pathfinding algorithms (e.g., Dijkstra, A*).
    *   Consumes the Graph Service to calculate optimal routes between locations.
3.  **XAI (Explainable AI) Service**:
    *   Analyzes selected routes to provide human-readable explanations.
    *   Details why a specific path was chosen over alternatives (e.g., "fastest route despite higher distance").
4.  **API Gateway**:
    *   Central entry point for client applications, routing requests to the appropriate internal services.

## Key Features
*   **Scalability**: Independent scaling of routing and data management components.
*   **Resilience**: Fault isolation between services.
*   **Transparency**: Dedicated XAI service for decision explainability.

## Tech Stack
*   **Microservices Framework**: Spring Boot (Java) or ASP.NET Core (C#)
*   **Containerization**: Docker
*   **Orchestration**: Docker Compose (for local development)
*   **Communication**: REST APIs (JSON) or gRPC
*   **Database**: Per-service databases (e.g., PostgreSQL for map data, Redis for caching)

## Usage
### Prerequisites
*   Docker & Docker Compose
*   Java 17+ or .NET 8.0+ (depending on implementation choice)

### Installation
1.  **Clone the repository**
    ```bash
    git clone [https://github.com/HlonieLive/ClearWay-AI.git](https://github.com/HlonieLive/ClearWay-AI.git)
    cd ClearWay-AI
    ```

2.  **Start the System**
    Using Docker Compose to spin up all services:
    ```bash
    docker-compose up --build
    ```

3.  **Access the Application**
    *   API Gateway will be available at `http://localhost:8080` (default port).
    *   Documentation (Swagger/OpenAPI) available at `http://localhost:8080/swagger-ui.html`.