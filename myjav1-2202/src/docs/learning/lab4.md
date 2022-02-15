# Tutorial 4
Lab 4 –Objects and Classes
Answer the following questions.

*`Figure` images can be found at learning/media*

Instructor-led Demo:
1.	Write a class named Account to model accounts. The UML diagram for the class is shown in Figure 4.0. Write a test program to test the Account class. In the client program, create an Account object with an account ID of 1222, a balance of 20000, and an annual interest rate of 4.5%. Use the withdraw method to withdraw $2500, use the deposit method to deposit $3000, and print the balance and the monthly interest.


Exercise:

1.	Write a class named Rectangle to represent rectangles. The UML diagram for the class is shown in Figure 4.1 Suppose that all the rectangles are the same colour. Use a static variable for colour. Write a client program to test the class Rectangle. In the client program, create two Rectangle objects. Assign width 5 and height 50 each of the objects. Assign colour yellow. Display the properties of both objects and their areas.

2.	Write a class named Fan to model fans. The properties, as shown in Figure 4.2, are speed, on, radius, and color. You need to provide the accessor and mutator methods for the properties, and the toString method for returning a string consisting of all the values of all the properties in this class. Suppose the fan has three fixed speeds. Use constants 1, 2, and 3 to denote slow, medium, and fast speed. Write a client program to test the Fan class. In the client program, create a Fan object. Assign maximum speed, radius 10, color yellow, and turn it on. Display the object by invoking its toString object.


3.	Java API has the GregorianCalendar class in the java.util package that can be used to obtain the year, month and day of a date. The no-arg constructor constructs an instance for the current date and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY) return the year, month and day. Write a program to test this class to display the current year, month and day.


4.	Write a class called Time. The Time class contains data fields hour, minute and second with their respective get methods. The no-arg constructor sets the hour, minute, and second for the current time in GMT. The current time can be obtained using System.currentTime(). Write a client program to test the Time class. In the client program, create a Time object and display hour, minute and second using the get methods.


5.	Using the Time class above, create an array storing Time object with its associated data (hour, minute, and second). Time object is created for every 5 seconds. Display the Time using toString method. The toString method returns hour:minute:second e.g., 1:30:30.

