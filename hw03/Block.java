//Duc Ngo
//CSE002
//This program will use the Scanner to input the dimensions of a block
//then calculate the volume and surface area

//first we need to import Scanner in the program
import java.util.Scanner;

//then define class
public class Block{

    //insert main method for program
    public static void main(String[] args) {

//declare an instance of the Scanner object and call the Scanner constructor    
Scanner myScanner = new Scanner (System.in);

//print prompt request for first block dimension
System.out.print("Enter the length of the block: ");
//declare variable to accept user input in the line above
double length = myScanner.nextDouble();

//print prompt request for second block dimension
System.out.print("Enter the width of the block: ");
//declare variable to accept user input in the line above
double width = myScanner.nextDouble();

//print prompt request for third block dimension
System.out.print("Enter the height of the block: ");
//declare variable to accept user input in the line above
double height = myScanner.nextDouble();

//calculate volume of block
double volume = length * width * height;

//calculate surface area of block
double surface = (length * width * 2) + (length * height * 2) + (width * height * 2);

//print ouput answer
System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume + ". The surface area of the block is " + surface + ".");


    } //end of main method
} //end of class