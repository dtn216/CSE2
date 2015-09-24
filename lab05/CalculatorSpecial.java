//Duc Ngo
//CSE002
//This program will use the Scanner to input 2 numerical values
//and ask for an operator (+,-,*,/)
//if operation is invalid, display illegal operator
//additionally there will be a while loop at the end

//first we need to import Scanner in the program
import java.util.Scanner;

//then define class
public class CalculatorSpecial{

    //insert main method for program
    public static void main(String[] args) {
        
//declare an instance of the Scanner object and call the Scanner constructor    
Scanner myScanner = new Scanner (System.in);

//declare variable for the while loop Y
String y = "";

//set up while loop
while (!y.equals("n") && !y.equals("N")) {
    
//print prompt request for variable a
System.out.print("Enter the first interger: ");
int a = myScanner.nextInt();

//print prompt request for variable a
System.out.print("Enter the second interger: ");
int b = myScanner.nextInt();

//print prompt request for operator
System.out.print("Enter your desired operator(+,-,*,/): ");
char operator = myScanner.next().charAt(0);

double total;

//implement switch statement
switch (operator) {
    case '+': System.out.println("The result of the operation is: " + (total = a + b));
            break;
    case '-': System.out.println("The result of the operation is: " + (total = a - b));
            break;
    case '*': System.out.println("The result of the operation is: " + (total = a * b));
            break;
    case '/': System.out.println("The result of the operation is: " + (total = (double)a / (double)b));
            break;
    default: System.out.println("illegal operator");

} //end of switch statement

    //print prompt request for loop input
System.out.print("Type n or N to stop: ");
y = myScanner.next();
    
    
} //end of loop

} //end of main method
} //end of class