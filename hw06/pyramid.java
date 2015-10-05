//Duc Ngo
//CSE002
//This program will ask the user for the size of the pyramid
//and will display a pyramid with the number of rows equal to the size indicated
//the row starts with one star and increases by 2 each row

//idea is to run loops so that the more rows, the more stars are added to the bottom row
//and to have equal amount of space in previous rows

import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("What size is the pyramid?");
        int row = myScanner.nextInt();
        //this is for obtaining the size of pyramid aka number of rows
        //this number will also act as a sentinel variable for the while loop
        
        int n = 0; //this is going to be the counter for the row
        for (n=0; n<row; n++) { 
            for (int space1=n; space1<(row-1); space1++) { //this allows the for loop to run " " a number of times equal to row-1
                System.out.print(" ");                     //and then the next iteration will start with a higher counter, allow the next row to have one less space
            } //this for loop ensures the stars are aligned correctly in the middle
           
            for (int stars=0; stars<(1+(n*2)); stars++) {
                System.out.print("*");
            } //this for loop creates the body of the pyramid, by starting with one and then adding 2 stars to each subsequent row
           
            System.out.println(""); //this command lets each overall iteration be printed out on a different line, making the shape of the pyramid
        } //this is going to make the outer for loop run "row" times,thus creating the depth of pyramid

        
        
    } //end of main method
} //end of class