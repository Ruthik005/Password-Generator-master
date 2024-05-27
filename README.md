"# Password-Generator-master" 

# Password Generator

This repository contains a Java-based Password Generator application that allows users to create secure passwords tailored to their preferences. It offers a simple command-line interface for generating passwords and checking their strength.

## Features

- *Customizable Password Generation*: Users can specify the types of characters (uppercase letters, lowercase letters, numbers, symbols) and the length of the password.
- *Password Strength Checking*: The application evaluates the strength of passwords based on criteria such as length, character types, and complexity.
- *Useful Information*: Provides guidelines and tips for creating strong passwords, including avoiding common pitfalls and weak password patterns.

## Installation and Usage

### Installation

1. Clone the repository:

   bash
   git clone  https://github.com/Ruthik005/Password-Generator-master.git
   

2. Navigate to the project directory:

   bash
   cd Password-Generator
   

3. Compile the project:

   bash
   javac -d bin src/*.java

   To run the application in Visual Studio Code, use the shortcut Ctrl+F5.

### Usage

1. Run the project:

   bash
   java -cp bin Main
   
2. Follow the prompts in the command-line interface to customize the password generation options.
3. After generating a password, the application will provide feedback on its strength and suggest improvements if necessary.
4. Users can also access useful information on creating strong passwords by selecting the appropriate menu option.

## Design Choices

- *Modular Design*: The application is divided into separate classes for alphabet generation, password generation, password strength evaluation, and user interaction.
- *User-Friendly Interface*: The command-line interface provides clear instructions and feedback to guide users through the password generation process.
- *Error Handling*: Implemented error handling mechanisms to address incorrect user input and provide helpful error messages.
- *Randomization*: Ensured randomness in password generation to enhance security and prevent predictability.

## Challenges Faced

- *User Input Validation*: Ensuring that user input is properly validated and handled to prevent runtime errors and unexpected behavior.
- *Algorithm Complexity*: Balancing between generating secure passwords and ensuring efficient performance, especially for longer passwords.
- *Feedback Mechanism*: Designing a robust feedback system to provide users with meaningful insights into their generated passwords' strength and potential weaknesses.

## Contributions

Feel free to contribute to this project by submitting pull requests with new features, enhancements, or bug fixes! Your feedback and contributions are highly appreciated.
