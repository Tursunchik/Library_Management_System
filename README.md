# Library Management System

A simple, console-based **Library Management System** built in Java. This project allows users to manage library books, register members, and handle borrowing and returning operations through an interactive command-line interface.

---

## Features

- **Book Management:** Add new books to the library inventory and view a complete list of all available and borrowed books.
- **Book Search:** Search for books by title using case-insensitive partial keyword matching.
- **Member Registration:** Register new library members using a unique member ID and name.
- **Borrowing System:** Borrow books using their unique ISBN, with availability checks to prevent double-borrowing.
- **Return System:** Return borrowed books back to the library inventory seamlessly.

---

## Project Structure

The project is structured using clean object-oriented principles across several classes:
- `Main.java`: Handles the console user interface, application loop, and menu choices.
- `Library.java`: Manages the core business logic (adding books, searching, borrowing, returning, and member registration).
- `Book.java`: Represents individual books with properties like title, author, ISBN, and availability status.
- `Member.java`: Represents registered library members.
- `Loan.java`: Tracks loan transactions associated with books and members.

---

## Getting Started

### Prerequisites
Make sure you have **Java Development Kit (JDK 8 or higher)** installed on your machine.

### Installation & Running

1. Clone the repository or download the source code files into a single directory:
   ```bash
   git clone https://github.com/your-username/library-management-system.git
   cd library-management-system
   ```

2. Compile all Java files:
   ```bash
   javac *.java
   ```

3. Run the application:
   ```bash
   java Main
   ```

---

## Usage Guide

When you run the application, you will see an interactive menu:
```text
===== Library Management System =====
1. Add a book
2. View all books
3. Search for a book
4. Register a member
5. Borrow a book
6. Return a book
7. Exit
Choose an option: 
```

Follow the on-screen prompts to input details such as book titles, authors, ISBNs, and member information.

---

## Contributing

Contributions, issues, and feature requests are welcome! Feel free to check out the issues page if you want to contribute.

---

## License

This project is open-source and available under the [MIT License](LICENSE).