# Getting Started

### Reference Documentation

This API is un example for spring-boot foreign client implemenatation

### Prerequisite

To get this API works, you need to have these folowing tools installed:

* Git
* Java 17+
* Maven
* Docker

### Guides

You need to execute the folowing command after clonning to get this API running :

* mvn clean package
* docker build -t demo-image .
* docker run -d -p 127.0.0.1:8080:8080 demo-image
