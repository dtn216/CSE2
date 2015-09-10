//Duc Ngo
//CSE002
//This program will use the Scanner to input the original cost of the check
//the percentage tip they wish to pay
//and how many ways the check will be split between

//import scanner
import java.util.Scanner;

//define class
public class Check{
    
    //insert main method for program
public static void main(String[] args) {

//declare an instance of the Scanner object and call the Scanner constructor    
Scanner myScanner = new Scanner (System.in);

//print prompt request for original cost input
System.out.print("Enter the orginal cost of the check in the form of xx.xx: ");

//declare variable to accept user input in the line above
double checkCost = myScanner.nextDouble();

//print prompt request for tip percentage input
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form of xx): ");

//declare variable to accept tip input in the line above
double tipPercent = myScanner.nextDouble();
tipPercent/= 100; //converts the tip input into a decimal value

//print prompt request for numbers of way the check will be split
System.out.print("Enter the number of people who went out to dinner: ");

//declare int variable to accept number of people
int numPeople = myScanner.nextInt();

//create shell variables for outputs
double totalCost;
double costPerPerson;
int dollars,
    dimes, pennies;

//calculations for outputs
totalCost = checkCost * (1+tipPercent);
costPerPerson = totalCost/numPeople;

dollars = (int)costPerPerson;
dimes = (int)(costPerPerson * 10) % 10;
pennies = (int)(costPerPerson * 100) % 10;
//gets whole dollar, dimes, and pennies amount

//print out output answer
System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);


    } //end of main method
} //end of class