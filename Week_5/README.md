# Week 5 - Encapsulation in Java

## Description

This project demonstrates the Object-Oriented Programming (OOP) concept of **Encapsulation** in Java.

The `Student` class stores its data using private attributes, ensuring they cannot be accessed directly from outside the class. Instead, public getter and setter methods are provided to read and modify the data safely.

## Files

### Student.java
Defines the `Student` class with the following private attributes:
- `studentID`
- `name`
- `cgpa`

The class includes:
- Setter methods:
  - `setStudentID()`
  - `setName()`
  - `setCGPA()`
- Getter methods:
  - `getStudentID()`
  - `getName()`
  - `getCGPA()`

### Main.java
Creates a `Student` object, assigns values using setter methods, and retrieves them using getter methods.

## Sample Code

```java
Student student = new Student();

student.setStudentID("CU12345");
student.setName("Ali");
student.setCGPA(3.75);
```

## Sample Output

```
Student ID : CU12345
Name       : Ali
CGPA       : 3.75
```

## OOP Concepts Demonstrated

- Packages
- Classes and Objects
- Encapsulation
- Private Instance Variables
- Getter Methods
- Setter Methods
- Data Hiding

## How to Run
 - Type java Main.java in the terminal


## Learning Outcomes

After completing this project, you should be able to:
- Understand the concept of encapsulation.
- Protect object data using private variables.
- Use getter methods to retrieve object data.
- Use setter methods to update object data.
- Apply data hiding to improve program security and maintainability.

