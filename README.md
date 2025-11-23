# Distributed Tracing with OpenTelemetry and Jaeger

In this project I have figured out how we can integrate distributed tracing in a Spring Boot application.
We are using OpenTelemetry to export traces to Jaeger.

This service called service 1 that consume service 2. Make sure both services are started.

Make sure you the `docker-compose.yaml` with command `docker-compose up`

Service 2 consume fake API [{JSON} Placeholder](https://jsonplaceholder.typicode.com/)

Follow this link to monitor your traces http://localhost:16686/search