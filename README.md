# Spring IoC Configuration Using XML

## Project Description

This project demonstrates **Inversion of Control (IoC)** in the Spring Framework using XML-based configuration. Spring creates and manages the `Student` object, injects values into its properties, and provides the object to the main application using the Spring IoC container.

## Technologies Used

- Java
- Spring Framework
- Maven
- XML Configuration
- Eclipse / Spring Tools

## Project Structure

```text
IOCConfiguration
├── src/main/java
│   └── com.demo
│       ├── Main.java
│       └── Student.java
└── src/main/resources
    └── app.xml
```

## Implementation

### 1. Main.java

- Creates the Spring IoC container using `ClassPathXmlApplicationContext`.
- Retrieves the `Student` bean from the container.
- Calls the `Display()` method to display student details.

### 2. Student.java

- Defines the `Student` class with `id` and `name` properties.
- Uses setter methods to initialize the properties.
- Contains a default constructor that prints a message when the object is created.
- Displays the student details using the `Display()` method.

### 3. app.xml

- Defines the `Student` bean with the class name `com.demo.Student`.
- Configures the student ID as `101`.
- Configures the student name as `artha`.
- Uses setter-based dependency injection to assign values to the properties.

## Output

```text
object is created
ID  =101
Name =artha
```

## Key Concepts

- **IoC (Inversion of Control):** Spring manages object creation and configuration instead of requiring the application to create and configure every object manually.
- **Spring IoC Container:** Manages beans and their dependencies.
- **Bean:** An object managed by the Spring container.
- **XML Configuration:** Defines beans and their property values in an XML file.
- **Setter Injection:** Spring uses setter methods to inject values into object properties.

## Conclusion

This project demonstrates how Spring IoC works with XML configuration. The Spring container creates the `Student` object, injects the configured property values through setter methods, and provides the bean to the main application.
