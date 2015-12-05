//Duc Ngo
//CSE002
//Lab12
//
//
//
//

import java.util.Scanner;

public class move_array {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            try {
                System.out.print("Enter the array size: ");
                int size = scanner.nextInt();
                int[] array1 = new int[size];
                for (int i=0; i<array1.length;i++) {
                    array1[i] = (int)(Math.random()*100);
                }
                System.out.print("The randomized array is: ");
                for (int i=0; i<array1.length;i++) {
                    System.out.print(array1[i] + " ");
                }
                System.out.println("");
                boolean check2 = true;
                do {
                    try {
                        System.out.print("Enter the value of the index to be moved: ");
                        int index = scanner.nextInt();
                        int temp=0;
                        temp = array1[index];
                        for (int i=index; i<array1.length-1;i++) {
                            array1[i] = array1[i+1];
                        }
                        array1[array1.length-1] = temp;
                        System.out.print("The newly arranged array is: ");
                        for (int i=0; i<array1.length;i++) {
                            System.out.print(array1[i] + " ");
                        }
                        System.out.println("");
                        check2 = false;
                    }
                    catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Must enter a positive index value within array size");
                    }
                    catch (Exception e) {
                        System.out.println("Please enter a valid number for index value");
                        scanner.next();
                    }
                } while (check2);
                check=false;
            }
            catch (NegativeArraySizeException e) {
                System.out.println("Cannot enter a negative array");
            }
            catch (Exception e) {
                System.out.println("Must enter a positive integer");
                scanner.next();
            }
        }
        while (check);

    }
}


