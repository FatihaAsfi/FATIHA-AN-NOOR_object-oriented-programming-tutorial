# Week 7 - Abstraction and Polymorphism in Java

## Description

This project demonstrates the Object-Oriented Programming (OOP) concepts of **Abstraction** and **Polymorphism** in Java.

An abstract class named `Appliance` defines common attributes and behaviors shared by all appliances. Several subclasses (`WashingMachine`, `Television`, `Microwave`, and `AirConditioner`) inherit from the abstract class and provide their own implementation of the abstract `operate()` method.

## Files

### Appliance.java
Defines the abstract parent class with:
- Protected attribute:
  - `brand`
- Constructor to initialize the appliance brand.
- Common methods:
  - `displayBrand()`
  - `turnOn()`
  - `turnOff()`
- Abstract method:
  - `operate()`

### WashingMachine.java
Extends `Appliance` and implements:

```java
operate()
```

Output:
```
Washing clothes...
```

### Television.java
Extends `Appliance` and implements:

```java
operate()
```

Output:
```
Playing TV channels...
```

### Microwave.java
Extends `Appliance` and implements:

```java
operate()
```

Output:
```
Heating food...
```

### AirConditioner.java
Extends `Appliance` and implements:

```java
operate()
```

Output:
```
Cooling the room...
```

### Main.java
Creates appliance objects using the parent class reference and demonstrates runtime polymorphism by calling the overridden `operate()` method.

## Sample Code

```java
Appliance app1 = new WashingMachine("LG");
app1.displayBrand();
app1.turnOn();
app1.operate();
app1.turnOff();
```

## Sample Output

```
Brand: LG
Power ON
Washing clothes...
Power OFF

Brand: Panasonic
Power ON
Washing clothes...
Power OFF

Brand: Sony
Power ON
Playing TV channels...
Power OFF

Brand: Miyako
Power ON
Heating food...
Power OFF
```

> **Note:** Although the `AirConditioner` class is included in the project, it is not instantiated in `main()`. You can add the following code to demonstrate it:

```java
Appliance app5 = new AirConditioner("Daikin");
app5.displayBrand();
app5.turnOn();
app5.operate();
app5.turnOff();
```

Expected output:

```
Brand: Daikin
Power ON
Cooling the room...
Power OFF
```

## OOP Concepts Demonstrated

- Packages
- Abstract Classes
- Abstraction
- Inheritance (`extends`)
- Method Overriding
- Runtime Polymorphism
- Constructors
- Protected Access Modifier

## Class Hierarchy

```
               Appliance (Abstract)
                     │
      ┌──────────────┼──────────────┬──────────────┐
      │              │              │              │
WashingMachine   Television   Microwave   AirConditioner
```

## How to Run
- Type java Main.java in the terminal

## Learning Outcomes

After completing this project, you should be able to:
- Understand the purpose of abstract classes.
- Create and implement abstract methods.
- Apply inheritance to create specialized subclasses.
- Override methods to provide class-specific behavior.
- Demonstrate runtime polymorphism using parent class references.

