# Week 6 - Inheritance in Java

## Description

This project demonstrates the Object-Oriented Programming (OOP) concept of **Inheritance** in Java.

The `Lecturer` class inherits common employee information from the `Employee` class and adds lecturer-specific attributes such as subject and department. The `super` keyword is used to initialize the inherited attributes through the parent class constructor.

## Files

### Employee.java
Defines the parent (superclass) `Employee` with:
- Protected attributes:
  - `id`
  - `name`
- Constructor to initialize employee information.
- `displayInfo()` method to display employee details.

### Lecturer.java
Defines the child (subclass) `Lecturer` that extends `Employee`.

Additional attributes:
- `subject`
- `department`

Methods:
- `displaySubject()` – Displays the lecturer's teaching subject.
- `displayDepartment()` – Displays the lecturer's department.

The constructor uses:

```java
super(id, name);
```

to call the parent class constructor.

### Main.java
Creates a `Lecturer` object and displays the lecturer's information, subject, and department.

## Sample Code

```java
Lecturer lecturer = new Lecturer(
    "L100",
    "Dr Ahmed",
    "Java Programming",
    "Faculty of Information Technology"
);
```

## Sample Output

```
Employee ID : L100
Name        : Dr Ahmed
Subject     : Java Programming
Department  : Faculty of Information Technology
```

## OOP Concepts Demonstrated

- Packages
- Classes and Objects
- Inheritance (`extends`)
- Parent and Child Classes
- Constructors
- `super` Keyword
- Protected Access Modifier
- Method Reuse

## How to Run

- Type java Main.java in the terminal

## Learning Outcomes

After completing this project, you should be able to:
- Understand inheritance in Java.
- Create parent and child classes.
- Use the `super` keyword to call a parent constructor.
- Reuse methods and attributes through inheritance.
- Organize related classes using inheritance for better code reusability.

