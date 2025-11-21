# University Course Management System (UCMS)

A robust Java-based console application designed to streamline course management and student enrollment in universities. This project demonstrates core concepts of **Object-Oriented Programming (OOP)**, **File Handling**, **Modular Design**, and **Data Persistence**.

![Application Output](output.jpg)

---

## 📌 Project Overview
The system allows administrators and students to interact with university data efficiently. It replaces manual record-keeping with a digital solution that:
* **Adds new courses** to the curriculum.
* **Stores data permanently** using file handling (`courses.txt`).
* **Displays fee structures** clearly.
* **Simulates student enrollment** workflows.

Data is saved automatically, ensuring persistence across application restarts.

---

## 🚀 Key Features

### ✅ 1. Course Management Module
* Add new courses with specific IDs, Names, and Fees.
* Validates course data to ensure integrity.
* Lists all available courses in a formatted console view.

### ✅ 2. Student Enrollment Module
* Simulates a student login/detection event.
* Processes course registration.
* Calculates and displays pending fee details.

### ✅ 3. Persistent Storage (File I/O)
* All course data is written to `courses.txt`.
* Data is appended safely without overwriting existing records.
* Demonstrates the use of `FileWriter` and `IOException` handling.

### ✅ 4. Modular Architecture
* Built using strict OOP principles:
    * **Inheritance:** `Student` extends `User`.
    * **Encapsulation:** Private fields with public getters/setters.
    * **Separation of Concerns:** Distinct classes for Logic (`CourseManager`), Data (`Course`), and Storage (`FileManager`).

---

## 🛠️ Tech Stack
* **Language:** Java (JDK 17+)
* **Concepts:** OOP, Collections Framework (ArrayList), Exception Handling, File I/O.
* **Tools:** VS Code, Git/GitHub.

---

## 📁 Project Structure

```text
src/
 └── com/university/management/
      ├── Main.java           // Entry point & workflow simulation
      ├── Course.java         // Data model for Courses
      ├── Student.java        // Data model for Students (inherits User)
      ├── User.java           // Parent class for actors
      ├── CourseManager.java  // Business logic (Add/List courses)
      └── FileManager.java    // File persistence logic
courses.txt                   // Data storage file
README.md                     // Project documentation
statement.md                  // Problem statement & requirements

📥 Installation & How to Run

Definition:

This section provides the necessary commands and steps to set up, compile, and execute the application locally.

1. Clone the Repository (Download)

Definition: Downloads a complete, local copy of the project's source code from GitHub.

Action: Open your terminal and run the following commands:

git clone https://github.com/goyalk01/University-Course-System.git
cd University-Course-System


2. Compile the Source Code (Build)

Definition: Converts the Java source files (.java) into executable bytecode (.class) using the Java compiler (javac).

Prerequisites: Requires Java Development Kit (JDK 17+) installed on the system.

Command:

javac src/com/university/management/*.java


3. Run the Application (Execute)

Definition: Executes the compiled bytecode using the Java Virtual Machine (java), launching the console-based system.

Command:

java -cp src com.university.management.Main


Example: Running this command initiates the program, displaying the main menu (e.g., "Welcome to UCMS. Enter 1 to Add Course, 2 to List Courses...").

🧪 Testing Instructions

Definition:

The testing strategy validates that the core functions of the system operate correctly and meet the expected requirements, focusing on essential CRUD (Create, Read, Update, Delete) and I/O operations.

Test 1: Application Launch & Data Loading

Action: Run the program (java -cp src com.university.management.Main).

Expected Result: Console displays "University Course Management System" and successfully lists courses loaded from the code/file.

Test 2: Student Enrollment Simulation

Action: Check the bottom of the console output (or navigate the menu to the enrollment feature).

Expected Result: The system detects student "Krish Goyal", successfully registers for a specific course, and displays the fee confirmation.

Test 3: Data Persistence

Action: Run the program once, adding a new course. Close the program. Then, open the courses.txt file in your project folder.

Expected Result: The courses.txt file should contain the list of courses added during the application run.

✨ Future Enhancements

Definition:

Planned features and architectural upgrades necessary to evolve the system from a basic console application to a production-ready system.

User Authentication: Implement robust login systems to differentiate between Admin and Student roles, ensuring restricted access to core management functions.

Database Integration (Data Persistence Upgrade): Replace the simple text file data persistence (courses.txt) with a relational database (e.g., MySQL/PostgreSQL) for scalability and improved data integrity.

GUI Implementation: Develop a graphical user interface using JavaFX or Swing to replace the current command-line interface, significantly improving user experience and accessibility.

Search Functionality: Add functionality for quickly finding courses by ID or Name within the CourseManager logic.

🙌 Author & Course Details

Definition:

This section provides attribution for the project author and details related to the academic context of the assignment.

Author: Krish Goyal

Registration No.: 24BCE11020

University: VIT Bhopal University

Course: Java Programming (flipped evaluation)