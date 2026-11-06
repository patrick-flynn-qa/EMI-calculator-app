# EMI Calculator

## Project Overview
The EMI Calculator is a beginner-level Java console application that calculates the estimated monthly payment for a loan based on the loan amount, repayment term, and annual interest rate.

The program allows the user to enter the loan term in either months or years. It then converts the term into the total number of monthly payments and uses a standard loan payment formula to calculate the monthly installment.

## Features
- Accepts a loan amount from the user.
- Allows the user to select a loan term in months or years.
- Converts loan terms entered in years into monthly payments.
- Accepts an annual interest rate.
- Calculates the monthly interest rate.
- Uses a loan payment formula to calculate the monthly installment.
- Displays the total number of monthly payments.
- Formats the monthly payment to two decimal places.
- Handles an invalid loan-term selection.

## Technologies Used
- Java 25
- Eclipse IDE
- Java Scanner class for user input
- Java Math class for mathematical calculations

## Java Concepts Practiced
- Variables and data types (`double` and `int`)
- User input using the `Scanner` class
- Conditional statements (`if`, `else if`, and `else`)
- Arithmetic operations
- Converting loan terms from years to months
- Mathematical calculations using `Math.pow()`
- Formatted output using `System.out.printf()`
- Basic input validation

## How to Run
1. Open the project in Eclipse IDE.
2. Locate the `EmiCalculator.java` file in the `day3` package.
3. Run the program as a Java application.
4. Follow the prompts in the console to enter the loan information.
5. Review the calculated monthly payment.

## Example Usage

**Example Input:**
- Loan Amount: $60,000
- Term Selection: 1 (Months)
- Loan Term: 76
- Annual Interest Rate: 6%

**Example Output:**
```text
Number of monthly payments: 76
Monthly Payment: $897.47
```

## Learning Objectives
This project provided practice combining user input, conditional statements, variables, and mathematical operations to solve a practical financial calculation.

It also introduced the use of Java's built-in `Math.pow()` method and formatted console output to display a calculated currency value.
