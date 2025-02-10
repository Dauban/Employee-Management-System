# Employee Management System

## Overview
This project is a **Java-based Employee Management System** that tracks employee records, attendance, leave, and payroll details. It utilizes **Java Records** for efficient data handling and demonstrates modular design principles for real-world HR applications.

## Features
- **Employee Records**: Maintain details such as ID, name, and position.
- **Attendance Tracking**: Record employee attendance logs.
- **Leave Management**: Track leave requests and approvals.
- **Payroll Processing**: Store and calculate salary details.
- **Modular Structure**: Uses Java records for efficient and structured data management.

## Project Structure
```
Employee-Management-System/
│── EmployeeManagementSystem.java  # Main class handling operations
│── EmployeeRecord.java            # Stores employee details
│── AttendanceRecord.java          # Tracks employee attendance
│── LeaveRecord.java               # Manages leave requests
│── PayrollRecord.java             # Stores payroll information
```

## Installation & Usage
### Compilation
Compile all Java files:
```sh
javac *.java
```

### Execution
Run the `EmployeeManagementSystem` class to interact with the system:
```sh
java EmployeeManagementSystem
```

## Example Usage
**Employee Record Sample:**
```java
EmployeeRecord emp = new EmployeeRecord(1001, "John Doe", "Software Engineer");
System.out.println(emp);
```

**Payroll Calculation Sample:**
```java
PayrollRecord payroll = new PayrollRecord(1001, 5000, 10);
System.out.println("Final Salary: " + payroll.calculateSalary());
```

## Potential Enhancements
- **Database Integration** (MySQL/SQLite) for persistent storage.
- **User Interaction via Console** for CRUD operations.
- **Graphical Interface (GUI)** for better usability.
- **Additional HR Features** such as performance tracking and promotions.

## Author
**Or Adar**  
GitHub: [github.com/Dauban](https://github.com/Dauban)  

---
This project showcases structured data management using Java and can be extended for real-world HR applications.

