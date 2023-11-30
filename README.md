# Java Backend Application README

This is a Java backend application that demonstrates the functionality of three main classes: User, Arithmetic, and Reading. This application allows you to create and manage user profiles, track arithmetic scores, and record reading progress for books. Below, we'll provide an overview of each class and how to use them.

## User Class

The `User` class represents user profiles in the application. It stores information about users, such as their first name, last name, grade level, username, email, password (hashed using bcrypt for security), and two additional objects for tracking arithmetic scores (`Arithmetic`) and reading progress (`Reading`).

### Usage

- To create a new user without initial arithmetic scores and reading progress:

User newUser = new User(firstName, lastName, gradeLevel, username, email, password);

## Arithmetic Class
The Arithmetic class allows you to track arithmetic scores for users. It provides methods to add, append, and retrieve scores for different arithmetic operations (addition, subtraction, multiplication, and division).

To add a score for a specific operation:
user.getArithmetic().addScore(operation, scoreData);

To append new scores to a specific operation:
List<String> newScores = Arrays.asList("date1, score1", "date2, score2");
user.getArithmetic().appendScores(operation, newScores);

To retrieve scores for a specific operation:
List<String> scores = user.getArithmetic().getScores(operation);

## Reading Class
The Reading class allows you to track reading progress for books. It uses a map to store entries for different books, where each entry is a list containing information such as the date, time read, author, and last page read.

Usage
To add a new reading entry for a book:
String bookTitle = "Book Title";
List<String> entry = Arrays.asList("date", "time", "author", "lastPageRead");
user.getReading().addReadingEntry(bookTitle, entry);

To retrieve all reading entries for a book:
List<List<String>> readingEntries = user.getReading().getReadingEntries(bookTitle);

To retrieve all book titles with recorded reading progress:
List<String> bookTitles = user.getReading().getAllBookTitles();

Running the Application
To run the application, execute the main method in the Main class. This will create user objects, update their arithmetic scores, and record reading progress for specific users.
