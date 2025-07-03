# Honor Society Eligibility Checker

## Overview
This Java application reads student academic records from a file and determines which students qualify for the Honor Society based on GPA calculations. It supports both undergraduate and graduate students, applying object-oriented programming concepts such as inheritance, encapsulation, and polymorphism.

## Features
- Reads and parses student data from a text file
- Calculates GPA for each student
- Dynamically sets the eligibility threshold
- Identifies eligible students for the Honor Society
- Uses inheritance for `Undergraduate` and `Graduate` subclasses

## File Structure
- `Project2.java` – Main application logic
- `Student.java` – Abstract class for shared student attributes
- `Undergraduate.java` – Handles undergraduate-specific logic
- `Graduate.java` – Handles graduate-specific logic
- `students.txt` – Input file containing student records (format: `First Last creditHours qualityPoints YearOrDegree`)
