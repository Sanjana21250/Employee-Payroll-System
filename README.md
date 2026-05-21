# Employee-Payroll-System

A simple Java-based Employee Payroll System that demonstrates the use of **Object-Oriented Programming (OOP)** concepts such as **Inheritance, Abstraction, and Polymorphism**.
This project allows management of employee salary details for both full-time and part-time employees.

---

## Features

* Add employee details
* Calculate employee salary
* Support for:

  * Full-Time Employees
  * Part-Time Employees
* Object-Oriented Design
* Console-based user interface
* Simple and beginner-friendly Java project

---

## Technologies Used

* Java
* OOP Concepts
* IntelliJ IDEA (Recommended)

---

## Project Structure

```bash
Employee Payroll System/
│
├── Employee.java
├── FullTimeEmployee.java
├── PartTimeEmployee.java
├── Main.java
└── PayrollSystem.java
```

---

## File Description

### `Employee.java`

* Base abstract class for employees
* Contains common properties:

  * Employee ID
  * Name
  * Salary
* Defines salary calculation structure

### `FullTimeEmployee.java`

* Extends `Employee`
* Handles salary calculation for full-time employees

### `PartTimeEmployee.java`

* Extends `Employee`
* Handles salary calculation based on hours worked

### `Main.java`

* Main execution file
* Runs the payroll management system

### `PayrollSystem.java`
* Manages all employee records using ArrayList
* Provides methods to:
    * Add employees
    * Remove employees using employee ID
    * Display employee details
* Acts as the main payroll management class of the project
* Helps organize and manage employee operations efficiently

---

## OOP Concepts Used

### Inheritance

`FullTimeEmployee` and `PartTimeEmployee` inherit from the `Employee` class.

### Abstraction

Abstract methods are used to define salary calculation behavior.

### Polymorphism

Different employee types calculate salary differently using method overriding.

---

## How to Run the Project

### Using Command Prompt

1. Open terminal or CMD
2. Navigate to project folder

```bash
cd "Employee Payroll System"
```

3. Compile the files

```bash
javac *.java
```

4. Run the program

```bash
java Main
```

---

## Example Output

```bash
Initial Employee Details: 
Employee[name=Ram,id=1,salary=100000.0]
Employee[name=Sita,id=2,salary=5028.0]
Removing Employees
Remaining Employees Details: 
Employee[name=Ram,id=1,salary=100000.0]
```

---

## Learning Outcomes

This project helps beginners understand:

* Java Classes & Objects
* Abstract Classes
* Method Overriding
* Constructor Usage
* Salary Calculation Logic
* Java Console Applications
