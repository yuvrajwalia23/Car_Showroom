# Car Showroom Management System

## Overview

This Java project is a simple Car Showroom Management System. It provides functionalities to manage the details of showrooms, employees, and cars. Users can add new showrooms, employees, and cars, as well as view the details of the existing entries. The system is implemented using Java and includes a basic menu-driven interface for user interaction.

## Features

- **Add Showroom**: Allows the user to enter details about a new showroom.
- **Add Employees**: Allows the user to enter details about new employees.
- **Add Cars**: Allows the user to enter details about new cars.
- **Get Showroom Details**: Displays the details of all showrooms.
- **Get Employee Details**: Displays the details of all employees.
- **Get Car Details**: Displays the details of all cars.

## Project Structure

- `Main.java`: Contains the main menu and handles user interactions.
- `showroom.java`: Defines the showroom class with methods to set and get showroom details.
- `employees.java`: Defines the employees class with methods to set and get employee details.
- `cars.java`: Defines the cars class with methods to set and get car details.
- `utility.java`: An interface that defines methods for setting and getting details.

## Classes and Interfaces

- **`showroom`**: Implements the `utility` interface and manages showroom details.
- **`employees`**: Extends `showroom` and implements the `utility` interface for managing employee details.
- **`cars`**: Extends `showroom` and implements the `utility` interface for managing car details.
- **`utility`**: Interface defining methods `get_details()` and `set_details()` for managing details.

## Usage

1. **Run the Project**: Compile and run the `Main` class.
2. **Interact with Menu**: Follow the menu prompts to add or view showrooms, employees, and cars.

### Example Menu Interaction

=================== *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** ==================

========================= *** ENTER YOUR CHOICE *** =======================

1)ADD SHOWROOM           2) ADD EMPLOYEES           3) ADD CARS
4)GET SHOWROOM           5) GET EMPLOYEES           6) GET CARS
========================= *** ENTER 0 TO EXIT *** =======================


## Compilation and Execution

To compile and run the project:

```bash
javac Main.java showroom.java employees.java cars.java utility.java
java Main

Dependencies
Java JDK: Ensure you have Java Development Kit (JDK) installed to compile and run the project.

Contributing:
Feel free to fork this repository and submit pull requests. If you find any issues or have suggestions for improvement, please open an issue or contact me.

Contact:
For any queries, you can reach me at yuvrajwalia2023@gmail.com.

