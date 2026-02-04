# S1.05 — Java Utils
## 🎯Objetives
This project is part of the Java Utils unit, focused on practicing essential Java I/O features such as file and directory handling, recursive navigation, text file operations, and object serialization.

The goal of this level is to build reusable tools for working with the file system using clean and beginner-friendly object-oriented code.

## 📌 Level 1
### ✅ Exercise 1 — Alphabetical Directory Listing
A utility class that lists the contents of a directory received as a parameter, sorted alphabetically.

### ✅ Exercise 2 — Recursive Directory Tree
Extends the previous exercise by printing the full directory tree recursively, showing:
- Directories (D)
- Files (F)
- Last modification date
- Alphabetical ordering at each level

### ✅ Exercise 3 — Export Tree Output to TXT
Instead of printing the directory tree to the console, the program saves the result into a .txt file.

### ✅ Exercise 4 — TXT File Reader
Adds functionality to read any text file `(.txt)` and display its content directly in the terminal.

### ✅ Exercise 5 — Object Serialization & Deserialization
Demonstrates how to:
- Serialize a Java object into a `.ser` file
- Deserialize it back to recover the object state

## 🛠 Technologies Used
- Java 21+
- IntelliJ IDEA
- Git & GitHub
- Command Line Execution (Git Bash / Terminal)

## 🚀 Installation and Execution

### 📂Clone Repository

`git clone https://github.com/carlasalmeron/S1.05-Java-Utils.git`

### ▶️ How to Compile
All programs are designed to run from the command line.

From the project root directory:

`javac -d out src/main/java/filemanager/*.java`

This compiles all .java source files into `.class` bytecode inside the out directory.

### ▶️ How to Run
Execute the main program with:

`java -cp out filemanager.Main`

### 📂 Output Files Generated
During execution, the program generates:
- output.txt → directory tree result.
- person.ser → serialized Java object.

### 🌍 Portability & Best Practices
- This project follows good practices to ensure portability.
- Uses relative paths instead of absolute paths.
- Applies recursive traversal for directory trees.
- Separates responsibilities into different utility classes.