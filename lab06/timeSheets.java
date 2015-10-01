//Duc Ngo
//CSE002
//This program will ask for number of employees
//number of hours per day for each employees
//and the pay rate of the employees
//after which the program will print out the payroll of all employees

import java.util.Scanner;

public class timeSheets {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        
        //first ask for the number of total employees
        System.out.print("Enter the number of employees you have ");
        int number = myScanner.nextInt();
        //this number will the be sentinel variable for the nested loop
        
        double totalpay = 0;
        
        int counter = 0, day;
        //this is the counter for said loop
        
        while (counter < number) { //this allows the loop to run a number of iteration
        //equals to number of employees
        
        System.out.print("Enter the amount of pay per hour for employee " + (counter+1) + ": ");
        double payperhour = myScanner.nextDouble();
        //this will record the amount paid per hour    
        day = 0; //this is for running a number of days
        
            while (day < 5) {
                System.out.print("Enter the amount of hours worked on day " + (day+1) + ": ");
                int hours = myScanner.nextInt();
                //this will record the number of hours worked everyday
                
                totalpay += hours * payperhour;
                //this will help tally up the payroll
                
                day++; //increases the counter
            }
        
        counter++; //increases the counter
            
        }
        
        System.out.println("The total payroll of all employees is: " + totalpay);
        
    }
}