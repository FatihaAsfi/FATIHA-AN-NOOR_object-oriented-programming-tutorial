# Week 3 - Inheritance and Polymorphism in Java

## Description

This project demonstrates the Object-Oriented Programming (OOP) concepts of **Inheritance**, **Method Overriding**, and **Polymorphism** in Java.

A base class `Person` is created, and two subclasses, `Student` and `Lecturer`, inherit from it. Each subclass overrides the `introduce()` method to provide its own implementation.

## Files

### Person.java
The parent (superclass) containing:
- Private attributes:
  - `name`
  - `id`
- Constructor to initialize attributes.
- Getter methods:
  - `getName()`
  - `getID()`
- `introduce()` method.

### Student.java
A subclass of `Person` that:
- Inherits all attributes and methods from `Person`.
- Overrides the `introduce()` method to display:
  ```
  I am a student
  ```

### Lecturer.java
A subclass of `Person` that:
- Inherits from `Person`.
- Overrides the `introduce()` method to display:
  ```
  I am a lecturer
  ```

### Main.java
Creates three objects using polymorphism:

```java
Person p1 = new Person("Ali", "P001");
Person p2 = new Student("Asfi", "S001");
Person p3 = new Lecturer("Izzad", "R001");
```

Calls the `introduce()` method for each object.

## Sample Output

```
I am a person
I am a student
I am a lecturer
```

## OOP Concepts Demonstrated

- Packages
- Classes and Objects
- Inheritance (`extends`)
- Constructors
- Encapsulation (private fields with getter methods)
- Method Overriding (`@Override`)
- Runtime Polymorphism (dynamic method dispatch)

## How to Run
- Type java Main.java in the terminal

## Learning Outcomes

After completing this project, you should be able to:
- Create a superclass and subclasses.
- Use inheritance to reuse code.
- Override methods in child classes.
- Apply runtime polymorphism using parent class references.
- Understand the relationship between parent and child classes in Java.

