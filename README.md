# School Personnel Information System

This project is a simple **School Personnel Information System** implemented using **Java** and Object-Oriented Programming (OOP) principles.

## Features

- View student, teacher, and principal information.
- Structured class hierarchy with inheritance (Teacher, Student, Principal).
- Simple text-based interface for interaction.

## Classes

- **Teacher**: Base class that stores the name, age, and subject of a teacher.
- **Student**: Inherits from Teacher, adds class and grade information.
- **Principal**: Inherits from Teacher, represents the principal of the school.

## How to Run

1. Clone the repository, Navigate project, Compile and Run the Project:
   ```bash
   git clone https://github.com/yourusername/school-personnel-information-system-medium-level.git
   cd school-personnel-system
   javac Main.java
   java Main
   ```
   ## Example Usage
When you run the program, you will be prompted to select which personnel's information you want to view (Student, Teacher, Principal) or exit the system.

**Example output for a Student**:
```
Welcome to the School Personnel Information System
*****************************************
Please select the unit whose information you want to view:
1- Student
2- Teacher
3- Principal
4- Exit the System
1
Displaying Student's Information...
Student's Name = Aiden
Student's Age = 19
Student's Subject = Math
Student's Class = 12/A
Student's Grade = 95
```




