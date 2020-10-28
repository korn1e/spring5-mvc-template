Spring 5 MVC Basic Minimum Template
===================================



Overview
--------
Spring 5 MVC minimum configuration template:
- No Spring Boot
- Use JSP and JSTL as View Technology
- Traditional deployment: .war file to be deployed (manually) to Servlet container



Dependencies (tested)
---------------------
- JDK 1.8  
- Maven 3.5.x
- Tomcat 8.5


Deploy & Run
-------------
1. Maven Compile: mvn clean package  
2. Put "spring5mvc.war" file under "target" directory into your Tomcat's "webapps" directory  
3. Access http://localhost:8080/spring5mvc/ajigile from your browser  



