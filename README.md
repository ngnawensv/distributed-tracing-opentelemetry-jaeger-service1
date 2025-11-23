# Distributed Tracing with OpenTelemetry and Jaeger

In this project I have figured out how we can integrate distributed tracing in a Spring Boot application.
We are using OpenTelemetry to export traces to Jaeger.

This service called service 1 that consume [service 2](https://github.com/ngnawensv/-distributed-tracing-opentelemetry-jaeger-service2). Make sure both services are started.

Make sure you the `docker-compose.yaml` with command `docker-compose up`

Service 2 consume fake API [{JSON} Placeholder](https://jsonplaceholder.typicode.com/)

Follow this link to monitor your traces [http://localhost:16686/search](http://localhost:16686/search)

here is the [ Postman Collection](https://universal-astronaut-31238.postman.co/workspace/Cad-workspace~738aee90-9fbd-41ee-840e-67f1815afe82/collection/7848965-76146291-86b5-409a-9a5c-97630d3bb302?action=share&creator=7848965&active-environment=7848965-9c867869-450f-491c-b7c3-2b256807bcac)
