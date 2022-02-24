# Tutorial 7
Lab 7 –Handling Exceptions
Answer the following questions.

Instructor-led Demo:
1.	Write a program that meets the following requirements:
a.	Create an array with one hundred randomly chosen integers.
b.	Cause an exception, ArrayIndexOutOfBoundsException, display the message “Out Of Bound”. You can display all the array elements using looping.


Exercise:

1.	“Passing Command-Line Arguments” is a simple command-line calculator. Note that the program terminates if any operand is non-numeric. Write a program with an exception handler that deals with non-numeric operands. Your program should display a message that informs the user of the wrong operand type before existing. For example,
|	Command arguments	|	Output	|
|	---	|	---	|
|	3+4	|	3+4=7	|
|	3/2+4	|	Wrong input: 3/2	|

| First Header  | Second Header |
| ------------- | ------------- |
| Content Cell  | Content Cell  |
| Content Cell  | Content Cell  |

2.	Given the Loan class, demo/lab7/Loan.java. Modify the Loan class to throw IllegalArgumentException if the loan amount, interest rate or number of years is less than or equal to zero.

3.	Consider a Calculator program, note that number 1 and number 2 were a non-numeric string, the program would report exceptions. Modify the program with an exception handler to catch ArithmeticException (e.g., divided by 0) and NumberFormatException (e.g., input is not an integer), and display the errors in a message dialog box.
