# Project Statement

## 1. Problem Statement

Manual course registration and fee management in universities are often inefficient, error-prone, and time-consuming. Librarians and administrators struggle to maintain up-to-date records of available courses and their respective fees using paper-based methods or disconnected spreadsheets.

## 2. Proposed Solution

The **University Course Management System (UCMS)** is a digital solution that automates the tracking of course offerings. It provides a centralized platform where administrators can add new courses and students can view the complete curriculum along with accurate fee details.

## 3. Scope of the Project

* **Target Users:** University Administrators and Students.

* **Domain:** Education Technology (EdTech).

* **Core Functionality:**
    * Adding and validating new course data.
    * Persistent storage of data using file systems.
    * Displaying structured course information to the console.

## 4. Future Enhancements

* Student Login and Enrollment capabilities.
* Database integration (MySQL) for larger datasets.
* GUI implementation using JavaFX.

## 5. Non-Functional Requirements

* **Data Persistence:** The system uses File I/O to ensure course records are saved permanently to `courses.txt` and recovered upon restart.
* **Scalability:** The application uses `ArrayList` (Java Collections), allowing the system to handle a dynamic and growing number of courses without memory overflow errors.
* **Maintainability:** The code follows strict Object-Oriented Programming (OOP) principles with a modular design (separating Logic, Data, and File handling), making it easy to upgrade.
* **Usability:** The console interface provides clear, formatted text output (User-friendly CLI) to guide administrators through the workflow.