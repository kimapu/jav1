# Tutorial 10
## Lab 10 –File Input/Output

Answer the following questions.

Demo:
Write a program that counts the number of characters including words and lines in a file. The program prompts the user for inputting the filename. Sample output as follows:
	<p align="center">
		Please enter the filename: narrative.txt <br/>
		File Sample.txt has <br/>
		1732 characters, <br/>
		204 words and 70 lines. <br/>
	</p>

Exercise:

1.	Suppose that a text file scores.txt contains an unspecified number of scores. Write a program that reads the scores from the file and displays their total and average. Hint: Use Files API and IntSummaryStatistics.

2.	Write a program that removes a specified string from a text file. Your program reads the file and generates a new file without the specified string, copies the new file to the original file. Prompt the user for a string to be removed and the filename. For example, remove “Java” string in datafile.txt.

3.	Write a program to create a file named ints.txt if it does not exist. Write one hundred integers created randomly into the file using text I/O. Integers are separated by spaces in the file. Using StringTokenizer/Scanner/Files.readAllLines to read the data back from the file and display the sorted data.