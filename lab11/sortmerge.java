//Duc Ngo
//CSE002
//Lab11
//In this lab we created 2 arrays, one with 10 and one with 20 ints
//randomized the number between 0-100, sort the numbers
//and merged them into a new sorted and combined array
//we then print the value in the third combined array

import java.util.Arrays;

public class sortmerge {
    public static void main (String args[]) {
        int[] array1 = new int [20];
        for (int x=0; x<array1.length; x++) {
            array1[x] = (int)(Math.random()*100);
        }
        int[] array2 = new int [10];
        for (int x=0; x<array2.length; x++) {
            array2[x] = (int)(Math.random()*100);
        }
        
        sort(array1);
        sort(array2);
        for (int x=0; x<array1.length; x++) {
            System.out.print(array1[x] + " ");
        }
        System.out.println("");
        for (int x=0; x<array2.length; x++) {
            System.out.print(array2[x] + " ");
        }
        System.out.println("");
        
        int[] array3 = new int[30];
        for (int i=0; i<array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i=array1.length; i<array3.length; i++) {
            array3[i] = array2[i-array1.length];
        }
        sort(array3);
        
        for (int x=0; x<array3.length; x++) {
            System.out.print(array3[x] + " ");
        }
        System.out.println("");
    }
    
    public static void sort(int[] input) {
        Arrays.sort(input);
    }
}