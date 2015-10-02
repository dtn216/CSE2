//Duc Ngo
//CSE002
//This program will continuously ask for a grade between 0 and 100
//if not a message will be displayed
//the loop will keep running and the total grades will be tallied up

import java.util.Scanner;
public class averageGrade {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        double grade = 0;
        int counter = 0;
        double totalgrade = 0;
        
        while (grade != 999) {
            //prompt input for grade
            System.out.print("Enter the grade number, or 999 to exit and compute average: ");
            grade = myScanner.nextInt();
            //this number is the number to be tallied
            if (grade == 999) {
                break; //allows user to escape loop if he/she enters 999
            }
            else if (grade >= 0 && grade <=100) {
                totalgrade += grade; //this will allow the loop to keep tallying grades
                counter++; //keeps count of the number of entries made
            }
            else System.out.println("Invalid grade has been entered, try again");
                //error message when put a wrong number in
            
            
        
        }
        double average = totalgrade/counter; //calculates the average grade
        System.out.println("The average of grades entered is: " + average); //prints the result
        
    } //end of main method
} //end of class