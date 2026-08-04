# Task Manager - Java File Handling

## Description

This project is a simple **Task Manager** application developed in Java. It allows users to enter a date and multiple tasks, stores the tasks in an `ArrayList`, saves them to a text file, and reads the saved tasks back from the file.

The project demonstrates how Java can be used to manage collections of data and perform basic file input/output (I/O) operations.

## Features

- Enter a date for the task list.
- Add three tasks from user input.
- Store tasks using an `ArrayList`.
- Display the task list on the console.
- Save tasks to a text file (`tasks.txt`).
- Load and display saved tasks from the file.

## Java Concepts Demonstrated

- Classes and Objects
- ArrayList Collection
- User Input with `Scanner`
- Loops (`for` and enhanced `for`)
- File Handling
  - `FileWriter`
  - `BufferedWriter`
  - `FileReader`
  - `BufferedReader`
- Exception Handling (`try-catch`)
- Try-with-Resources
- String Manipulation

## Program Flow

1. User enters the current date.
2. User enters three tasks.
3. Tasks are stored in an `ArrayList`.
4. The task list is displayed.
5. Tasks are saved to `tasks.txt`.
6. The program reads the file and displays all saved tasks.

## Sample Output

```
Enter Date (DD/MM/YYYY): 04/08/2026

===== ADD TASKS =====
Enter Task 1: Finish Java assignment
Enter Task 2: Attend lecture
Enter Task 3: Study OOP

===== TASK LIST =====
1. Finish Java assignment
2. Attend lecture
3. Study OOP

Tasks saved successfully.

===== TASKS LOADED FROM FILE =====
Today's Tasks
Date: 04/08/2026
Finish Java assignment
Attend lecture
Study OOP
```

## Output File

The program creates (or appends to) a file named:

```
tasks.txt
```

Example file content:

```
Date: 04/08/2026
Finish Java assignment
Attend lecture
Study OOP
```

## How to Run
 - Type java Main.java in the terminal 

## Learning Outcomes

After completing this project, you should be able to:

- Use `ArrayList` to store dynamic data.
- Accept user input using `Scanner`.
- Write data to a text file using `BufferedWriter`.
- Read data from a text file using `BufferedReader`.
- Handle file-related exceptions using `try-catch`.
- Apply the try-with-resources statement for automatic resource management.
