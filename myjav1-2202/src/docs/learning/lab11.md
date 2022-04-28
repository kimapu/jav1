# Tutorial 11
## Lab 11 – Data Driven Development

Answer the following questions.

Instructor-led Demo for JavaDB:
1.	Given any requirement, demonstrate insert, update, and select records from database in an application. This demonstration includes database, table, configuration, connection etc setup.

Support: Open source Java JDBC driver implementation that alloes Java developers and JDBC client programs to read/write MS Access databases. 
http://ucanaccess.sourceforge.net/site.html

Exercise for MS Access:

1.	Create a MS Access database namely, DemoDB.accdb. 
	- Make a Staff table which contains ID, FNAME, LNAME, AGE, DOB, DEPARTMENT, DATE_JOINED, etc. 
	- Make a Customer table which contains ID, FNAME, LNAME, DOB, USERNAME, PASSWORD, etc.
	- Make a Product table which contains ID, CODE, NAME, DESC, COST, RETAIL_PRICE, QUANTITY, etc.
	- Note: Recommended to put sample data for testing purpose.

2.	Setup the data source for the accessing the DemoDB.accdb.
	- Enter to the ODBC Data Source Administrator by either of these ways:
		- Start menu -> Control Panel -> System and Security -> Administrative Tools -> Data Source (ODBC)
		OR
		- Type Data Source in the search textbox on the Start menu.
	- In the ODBC Data Source Administrator, click Add button.
	- Select the driver: Microsoft Access Driver (*.mdb, *.accdb).
	- In the ODBC Microsoft Access Setup dialog, enter a DATASOURCE_NAME. Click on Select to choose the targeted database, DemoDB.accdb in this case. Click OK.
	- It will then add a new data source for users in the ODBC Data Source Administrator.
	- Note: The data source name will be used in Database URL in the program.

3.	Based on DemoDB.accdb, answer the following questions:
	- Write a program that views, inserts and updates staff information stored in a database.
	- Write a program that validates the customer login information. This program prompts the user for username and password input. 
	- Write a program that lists all the product information in an ascending order.
