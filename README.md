# Java College Practice

A comprehensive collection of Java programming exercises and solutions covering fundamental to intermediate concepts. This repository documents learning progress through practical implementations of core Java principles including object-oriented programming, data structures, string manipulation, and algorithmic problem-solving.

## 📚 Overview

This repository contains Java practice programs designed for college-level coursework and skill development. It serves as a reference guide and hands-on learning resource for mastering Java fundamentals, with implementations ranging from basic input/output to complex data structure manipulation and algorithm implementations.

### Stack
- **Language:** Java (Core)
- **Framework/Runtime:** Java Development Kit (JDK)
- **Notable Concepts:** Object-Oriented Programming (OOP), Collections Framework, Strings, Arrays, Stack Data Structure

## 📁 Repository Structure

```
java-college-practice/
├── Basics/                          # Fundamental Java concepts
│   ├── Demo.java                    # Basic input/output with Scanner
│   ├── inputoutputdemo.java         # I/O demonstrations
│   ├── alphabet.java                # Character/string operations
│   ├── leapyear.java                # Conditional logic and year calculations
│   └── marks.java                   # Grade/mark evaluation
│
├── Arrays/                          # Array manipulation and operations
│   ├── array.java                   # Array declaration, initialization, iteration
│   ├── arrayeven.java               # Filtering even numbers from arrays
│   ├── arrayques.java               # Array-based problem solving
│   ├── ques2array.java              # Intermediate array challenges
│   ├── ques3array.java              # Advanced array operations
│   ├── palinarray.java              # Palindrome array validation
│   └── quesposition.java            # Rearranging arrays by position/value parity
│
├── Strings/                         # String operations and manipulations
│   ├── String1.java                 # String comparison (== vs .equals())
│   ├── stringques1.java             # Basic string problems
│   ├── stringques2.java             # Intermediate string challenges
│   └── stringques3.java             # Advanced string operations
│
├── OOP & Classes/                   # Object-Oriented Programming concepts
│   ├── book.java                    # Class definition example
│   ├── studentoopsques.java         # Student class implementation
│   ├── quesstudent.java             # Student-related OOP problems
│   ├── charity.java                 # Class inheritance/polymorphism example
│   └── oopsjava.txt                 # OOP concepts reference guide
│
├── Methods & Functions/             # Method design and usage
│   ├── method/
│   │   ├── BankAccounts.java        # Bank account system with methods
│   │   ├── myclass.java             # Method examples
│   │   ├── function.txt             # Methods concepts and definitions
│   │   ├── longestvalidparen.java   # Longest valid parenthesis algorithm
│   │   └── GENERATEPAREN.java       # Generate valid parentheses combinations
│   └── calculator.java              # Basic calculator with method operations
│
├── Algorithms & Problem Solving/    # Algorithmic implementations
│   ├── validparenthesis.java        # Valid parenthesis validation using Stack
│   ├── prime.java                   # Prime number checking
│   ├── prim.java                    # Prime number implementation
│   ├── pattern1.java                # Pattern generation
│   ├── prince.java                  # Prince/number-related algorithm
│   ├── rpsgame.java                 # Rock-Paper-Scissors game logic
│   ├── runsum.java                  # Running sum calculation
│   ├── secondl.java                 # Second largest element finding
│   └── ques9sept.java               # Date-specific practice questions
│
├── Miscellaneous/                   # Additional implementations
│   ├── carques.java                 # Car-related OOP problem
│   ├── demoo.java                   # Demo implementations
│   ├── score.java                   # Score calculation/ranking
│   ├── ques1.java                   # General practice question 1
│   └── quesmsg.java                 # Message-based problems
│
├── Reference Documents/
│   ├── Stringlec.txt                # String operations lecture notes
│   ├── array.txt                    # Array concepts reference
│   └── oopsjava.txt                 # OOP theory and principles
│
└── Configuration
    └── .gitignore                   # Git ignore rules
```

## 🎯 Core Concepts Covered

### 1. **Basics**
- Input/Output using `Scanner` class
- Variable declaration and initialization
- Basic conditional statements
- String and character operations

### 2. **Arrays**
- Array declaration, creation, and traversal
- Element access and manipulation
- Array filtering and rearrangement
- Palindrome detection in arrays

### 3. **Strings**
- String comparison using `==` vs `.equals()`
- String manipulation methods
- String validation and transformation

### 4. **Object-Oriented Programming (OOP)**
- Class definition and object creation
- Constructors (default, parameterized)
- Access modifiers (default, private, protected, public)
- Inheritance and method overriding
- Abstract classes and interfaces
- Singleton pattern
- Encapsulation and data hiding

### 5. **Methods & Functions**
- Method signature and declaration
- Parameter passing and return values
- Static vs instance methods
- Method overloading
- Predefined vs user-defined methods

### 6. **Data Structures & Algorithms**
- Stack operations (parenthesis validation)
- Algorithm implementation (prime checking, pattern generation)
- Game logic (Rock-Paper-Scissors)
- Array manipulation algorithms

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java IDE (IntelliJ IDEA, Eclipse, VS Code) or command-line compiler

### Running Programs

**From Command Line:**
```bash
# Compile
javac FileName.java

# Run
java FileName
```

**For programs requiring input:**
```bash
javac calculator.java
java calculator 10 20 +
# Output: Addition = 30
```

**For programs with interactive input:**
```bash
javac BankAccounts.java
java BankAccounts
# Follow the menu prompts
```

## 📖 Key Programs

### Bank Account Management System
**File:** `method/BankAccounts.java`
- Interactive menu-driven banking application
- Deposit and withdrawal operations
- Balance inquiry and validation
- **Run:** `java BankAccounts`

### Valid Parenthesis Validator
**File:** `validparenthesis.java`
- Validates balanced parentheses, brackets, and braces
- Uses Stack data structure
- **Run:** `java validparenthesis` and enter a string with parentheses

### Calculator
**File:** `calculator.java`
- Command-line calculator supporting +, -, *, /
- **Run:** `java calculator 10 20 +`

### String Comparison Demo
**File:** `String1.java`
- Demonstrates difference between `==` and `.equals()` methods
- String pool vs heap memory concepts

### Array Rearrangement Challenge
**File:** `quesposition.java`
- Rearranges array so even numbers occupy even indices and odd numbers occupy odd indices

## 📝 Learning Notes

The repository includes reference documents (`*.txt` files) with lecture-style notes covering:
- **OOP Concepts:** Class types, constructors, access modifiers, design patterns
- **String Operations:** String methods, comparison techniques
- **Array Fundamentals:** Declaration, initialization, traversal patterns
- **Methods in Java:** Types, signatures, advantages, best practices

## 🏆 Problem Categories

| Category | Files | Difficulty |
|----------|-------|------------|
| Basics | Demo.java, inputoutputdemo.java | Beginner |
| Arrays | array.java, arrayques.java, palinarray.java | Intermediate |
| Strings | stringques1-3.java, String1.java | Intermediate |
| OOP | book.java, studentoopsques.java, charity.java | Intermediate |
| Algorithms | validparenthesis.java, rpsgame.java, prime.java | Intermediate-Advanced |
| System Design | BankAccounts.java | Advanced |

## 🔗 Use Cases

- **Students:** Reference for college programming assignments and exams
- **Learners:** Self-paced Java learning with practical examples
- **Developers:** Quick lookup for common Java patterns and algorithms
- **Interviewers:** Coding interview preparation examples

## 📚 Reference Topics

- Java syntax and semantics
- Object-oriented design principles
- Algorithm implementation and analysis
- Stack and array-based data structures
- String manipulation techniques
- Input/output handling
- Control flow and conditional logic

## ⚠️ Notes

- Some files are skeletons or work-in-progress (e.g., `prime.java`)
- Code style and naming conventions follow Java conventions with some classroom variations
- Included `*.txt` files serve as theoretical reference documentation alongside practical implementations

## 🤝 Contributing

This is an educational repository. Feel free to:
- Suggest improvements to existing implementations
- Identify bugs or edge cases
- Propose additional practice problems
- Improve documentation and comments

## 📄 License

This project is a personal/educational repository. Usage is permitted for learning and educational purposes.

---

**Last Updated:** October 2026  
**Primary Language:** Java  
**Educational Level:** College/University
