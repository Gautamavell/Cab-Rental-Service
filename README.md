# Cab Rental Service - Java Project

Welcome to the **Cab Rental Service** project! This is a simple Java-based simulation of a cab rental system. It allows users to rent and return cabs, manage available cabs, and handle exceptions like invalid data or unavailable services.

This project does **not** use a database and stores data temporarily during runtime.

## Features

- **Rent a cab**: Rent available cabs by providing the cab ID.
- **List available cabs**: View a list of cabs that are currently available for rent.
- **Exception handling**: Custom exceptions to manage invalid data and unavailable services.
  
### Core Classes
- **Cab**: Represents individual cabs with information like cab ID, driver, and availability.
- **CabDepot**: Manages a collection of cabs, adding/removing them and checking availability.
- **InvalidDataException**: Handles invalid input or data-related issues.
- **ServiceUnavailableException**: Thrown when there are no available cabs to rent.
- **CabRentalService**: Coordinates the rental process and manages interactions with cabs.
- **Main**: The entry point for the application, where users can interact with the system.

## Table of Contents
- [Classes](#classes)
  - [Cab](#cab)
  - [CabDepot](#cabdepot)
  - [InvalidDataException](#invaliddataexception)
  - [ServiceUnavailableException](#serviceunavailableexception)
  - [CabRentalService](#cabrentalservice)
  - [Main](#main)
- [Usage](#usage)
- [Installation](#installation)
- [How to Run](#how-to-run)
- [Example](#example)
- [Project Structure](#project-structure)
- [License](#license)

## Classes

### 1. **Cab**
This class represents a cab in the rental service.

#### Properties:
- `cabId`: A unique identifier for each cab.
- `isAvailable`: A boolean indicating if the cab is available for rent.


### 2. **CabDepot**
This class is responsible for managing a collection of cabs.


---

### 3. **InvalidDataException**
This is a custom exception thrown when the user provides invalid data, such as an invalid cab ID or malformed input.

---

### 4. **ServiceUnavailableException**
This custom exception is thrown when there are no available cabs to rent.

---

### 5. **CabRentalService**
This class provides the core functionality for renting and returning cabs.

---

### 6. **Main**
The main class that drives the application. It interacts with the user and allows them to:
- Rent or return cabs.
- View the list of available cabs.

---

## Usage

Once you run the application, you can interact with it by choosing the following options:

1. **View Available Cabs**: Displays a list of all available cabs.
2. **Rent a Cab**: Allows you to rent a cab by entering its ID.
3. **Exit**: Exits the application.

---

## Installation

To get started with this project, follow these steps:

1. **Clone the repository** to your local machine:

   ```bash
   git clone https://github.com/gautamavell/cab-rental-service.git
   cd cab-rental-service
