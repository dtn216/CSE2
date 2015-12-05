//Duc Ngo
//CSE002
//Lab10
//This lab uses array to generate a set of random numbers
//computes the average of those numbers
//then determine the numbers that are larger or equal to the average

import java.util.Scanner;
public class average{
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter number of values to be stored: ");
       int n = scanner.nextInt(); //take in array size
       int[] nums = new int[n]; //declare array list and how big the array will be
       for (int i=0; i < nums.length; i++) {
           nums[i] = (int)(Math.random()*100); //generates a random number between 0 and 100 for each array number
           System.out.print(nums[i] + " ");
       }
       System.out.println(" ");
       double sum=0;
       for (int x=0; x < nums.length; x++) {
           sum += nums[x]; //adds all the values of the array numbers to get a sum
       }
       double average = sum/(nums.length); //finds the average
       System.out.println("the average is: " +average);
       System.out.print("numbers greater than or equal to the average are: ");
       for (int z=0; z<nums.length; z++) {
           if (nums[z] >= average) { //prints a number within the array if it is larger or equal to the average
               System.out.print(nums[z] + " ");
           }
       }
       System.out.println(" ");
   }
}