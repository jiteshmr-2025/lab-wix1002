# WIX1002 Programming Lab Exercises

This repository contains Java programming lab exercises for the WIX1002 Programming course. Each lab focuses on different fundamental programming concepts, progressing from basic input/output to advanced object-oriented programming.

## 📚 Repository Structure

```
lab-wix1002/
├── Lab1/        # Introduction to Java Programming
├── Lab2/        # Input, Output, and Data Types
├── Lab3/        # Selection and Decision Making
├── Lab4/        # Loops and Repetition
├── Lab5/        # Arrays and Collections
├── Lab6/        # Methods and Functions
├── Lab7/        # File I/O Operations
└── Lab8/        # Object-Oriented Programming
```

## 📖 Lab Contents

### Lab 1: Introduction to Java Programming
**Topics:** Basic Java syntax, output formatting, simple calculations
- **L1Q2** - Display personal profile information (name, matric number, address, email, contact)
- **L1Q3** - Basic arithmetic operations and calculations
- **L1Q3_Extended** - Extended arithmetic operations
- **L1Q4** - Simple mathematical operations
- **L1Q4_Extended** - Advanced calculations
- **L2_Extras** - Additional practice exercises

**Key Concepts:** `System.out.println()`, string formatting, basic data types

---

### Lab 2: Input, Output, and Data Types
**Topics:** User input, Scanner class, data type conversions, mathematical operations
- **L2Q1** - Temperature conversion (Fahrenheit to Celsius)
- **L2Q2** - Working with user inputs and calculations
- **L2Q3** - Data type operations and conversions
- **L2Q4** - Mathematical expressions
- **L2Q5** - Variable manipulation
- **L2Q6** - Advanced input/output operations

**Key Concepts:** `Scanner` class, type casting, `printf()` formatting, mathematical operators

---

### Lab 3: Selection and Decision Making
**Topics:** Conditional statements, switch-case, boolean logic
- **L3Q1** - Simple calculator with basic arithmetic operations (+, -, *, /, %)
- **L3Q2** - Random number generation and switch-case for word conversion (0-5)
- **L3Q3** - Decision making with multiple conditions
- **L3Q4** - Complex conditional logic
- **L3Q5** - Nested if-else statements
- **L3Q6** - Boolean expressions and logical operators

**Key Concepts:** `if-else` statements, `switch-case`, comparison operators, logical operators, `Random` class

---

### Lab 4: Loops and Repetition
**Topics:** For loops, while loops, do-while loops, nested loops
- **L4Q1** - Finding all factors of a number
- **L4Q1_Extended** - Enhanced factor calculation
- **L4Q2** - Series summation: 1 + (1+2) + (1+2+3) + ... + (1+2+3+...+n)
- **L4Q2_Extended** - Advanced series calculations
- **L4Q3** - Loop iterations and patterns
- **L4Q4** - Nested loop structures
- **L4Q4_Extended** - Complex nested loops
- **L4Q5** - Loop control statements
- **L4Q6** - Multiple loop applications
- **L4Q7** - Advanced looping techniques
- **L4Q8** - Loop optimization

**Key Concepts:** `for` loops, `while` loops, loop control (`break`, `continue`), nested loops

---

### Lab 5: Arrays and Collections
**Topics:** Array declaration, initialization, manipulation, and algorithms
- **L5Q1** - Random student score generation (0-100), finding max, min, and average
- **L5Q2** - Generating 10 non-duplicate random integers (0-20) using HashSet
- **L5Q3** - Array operations and manipulations
- **L5Q4** - Array searching and sorting
- **L5Q4_Extended** - Advanced array algorithms
- **L5Q5** - Multi-dimensional arrays
- **L5Q6** - Array-based problem solving

**Key Concepts:** Array declaration, `Arrays.sort()`, `Random` class, `HashSet`, array traversal, min/max/average calculations

---

### Lab 6: Methods and Functions
**Topics:** Method definition, parameters, return values, method overloading
- **L6Q1** - Triangular number calculation using methods
- **L6Q2** - Method parameters and return values
- **L6Q3** - Multiple method implementations
- **L6Q4** - Recursive methods
- **L6Q5** - Method overloading
- **L6Q6** - Advanced function concepts

**Key Concepts:** Method declaration, parameters, return types, recursion, method overloading, void methods

---

### Lab 7: File I/O Operations
**Topics:** File reading/writing, binary files, object serialization
- **L7Q1** - Binary file operations: store course data in `coursename.dat` and retrieve by course code
- **L7Q2** - Reading web page contents and writing to text file (`index.htm`)
- **L7Q3** - Text file operations
- **L7Q4** - File parsing and processing
- **L7Q5** - Advanced file I/O
- **L7Q6** - Exception handling with files

**Key Concepts:** `ObjectOutputStream`, `ObjectInputStream`, `FileOutputStream`, `FileInputStream`, `BufferedReader`, `BufferedWriter`, serialization, IOException handling

---

### Lab 8: Object-Oriented Programming
**Topics:** Classes, objects, constructors, encapsulation, accessor/mutator methods, static members

- **Q1/Number.java** - Number class with array operations
  - **New Concepts:** Constructor overloading (3 constructors with different parameters), instance variables, methods working with arrays
  - **What you'll learn:** Creating multiple constructors (default, parameterized, partially parameterized) to initialize objects flexibly
  - **Operations:** Random number generation, finding even/prime numbers, calculating max/min/average, array squaring

- **Q2/BankAccount.java** - Bank account management system
  - **New Concepts:** Instance variables for object state, multiple methods working together
  - **What you'll learn:** Building a complete class with deposit/withdraw/balance operations, input validation, conditional string checking with `.matches()`
  - **Real-world application:** Simulating a banking system with balance tracking and transaction validation

- **Q3/WeightCalculator.java** - Recommended weight calculator
  - **New Concepts:** Combining user input with calculations in a class
  - **What you'll learn:** Creating methods that interact (input → calculation → display), using Scanner within a class
  - **Formula application:** `recommendedWeight = (height - 100 + age / 10) * 0.9`

- **Q4/Fraction.java** - Fraction reduction and manipulation
  - **New Concepts:** **Accessor (getter) and Mutator (setter) methods**, private instance variables
  - **What you'll learn:** Implementing encapsulation with private fields, using getters/setters to control access, recursive GCD algorithm
  - **Key feature:** Reducing fractions to lowest terms using Greatest Common Divisor (GCD)

- **Q5/Game.java** - Dice game simulation
  - **New Concepts:** Object interaction, tracking state across method calls
  - **What you'll learn:** Creating game objects with state (player name, cumulative score), simulating random events (dice rolls)
  - **Game logic:** Rolling dice until a player reaches 100 or more points

- **Q6/Burger.java** - Multi-stall burger sales tracker
  - **New Concepts:** **Static variables and static methods**, tracking data across all instances
  - **What you'll learn:** Difference between instance variables (per object) and static variables (shared by all objects), class-level data tracking
  - **Application:** Tracking individual stall sales AND total sales across all stalls

- **Q7/Money.java** - Currency breakdown calculator
  - **New Concepts:** Object arithmetic (adding/subtracting objects), working with cents, Swedish rounding
  - **What you'll learn:** Creating methods that return new objects (`add()` and `subtract()` methods), currency rounding algorithms, modulo operations for rounding
  - **Challenge:** Breaking down money into notes (RM100, RM50, RM10, RM5, RM1) and coins (50¢, 20¢, 10¢, 5¢)

**Key Concepts:** Class design, constructors (default, parameterized, overloaded), instance variables, private fields, accessor/mutator methods, static variables/methods, encapsulation, object instantiation, object arithmetic, recursion

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- NetBeans IDE (recommended) or any Java IDE
- Basic understanding of programming concepts

### Running the Programs

1. **Clone the repository:**
   ```bash
   git clone https://github.com/jiteshmr-2025/lab-wix1002.git
   cd lab-wix1002
   ```

2. **Navigate to any lab:**
   ```bash
   cd Lab1/L1Q2
   ```

3. **Compile and run using command line:**
   ```bash
   javac src/l1q2/*.java
   java -cp src l1q2.MyProfile
   ```

4. **Or open in NetBeans:**
   - Open the project folder in NetBeans
   - Right-click on the project → Run

### Project Structure
Each lab question follows the NetBeans project structure:
```
LxQy/
├── src/          # Source files
├── build/        # Compiled classes
├── nbproject/    # NetBeans project files
├── build.xml     # Ant build file
└── manifest.mf   # Manifest file
```

## 📝 Notes

- All programs are written in Java
- NetBeans IDE was used for development
- Programs follow standard Java naming conventions
- Each program includes inline comments for clarity
- Some questions have "_Extended" versions with additional features

## 👤 Author

**Jitesh Mogana Raja**
- Matric Number: 25006745
- Email: jiteshmoganaraja@gmail.com

## 📄 License

This project is licensed under the terms included in the LICENSE file.

---

*Last Updated: December 2025*
