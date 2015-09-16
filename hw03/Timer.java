//Duc Ngo
//CSE002
//This program will use the Scanner to input the current time
//as well as the time of the date, both in military format
//then calculate the time remaining until the date

//first we need to import Scanner in the program
import java.util.Scanner;

//then define class
public class Timer{

    //insert main method for program
    public static void main(String[] args) {

//declare an instance of the Scanner object and call the Scanner constructor    
Scanner myScanner = new Scanner (System.in);

//print prompt request for current time
System.out.print("Enter the current time: ");
int current = myScanner.nextInt();

//print prompt request for dinner time
System.out.print("Enter the time that you will be eating dinner: ");
int dinner = myScanner.nextInt();

//calculate the hour difference between current and dinner time
int hour = (dinner - current) / 100;

//calculate the minute difference between current time and dinner time
int minute = (60 + (dinner % 100) - (current % 100)) % 60;

//print output answer
System.out.println("You have " + hour + " hours and " + minute + " minutes until dinner.");


    } //end of method
} //end of class