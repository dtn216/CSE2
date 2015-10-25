//CSE002
//Duc Ngo
//HW08
//
//this program prompts the user to choose a shape, and asks for the dimensions of the shape, then will print out an ouput of the area of the chosen shape.
//program will keep asking user to select a shape until it is valid, and there's also a function to quit the program at shape selection
import java.util.Scanner;

public class areas{
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
        int shape = 0;
        while (shape != 1 && shape != 2 && shape != 3 && shape != 999) { //this allows for shape selection, as well as option to exit
        System.out.print("Enter 1 for circle, 2 for rectangle, 3 for trapezoid, or 999 to exit: ");
        shape = scanner.nextInt(); //takes in the shape of user's choice
        }
           if (shape == 1) { //if statements to know how many variables to have to enter and what kind
               System.out.print("Enter radius: ");
               int radius = scanner.nextInt();
               System.out.println("The area of the circle is " +area(radius)); //method overloading
           }
           else if (shape ==2) { //if statements to know how many variables to have to enter and what kind
               System.out.print("Enter length: ");
               int length = scanner.nextInt();
               System.out.print("Enter width: ");
               int width = scanner.nextInt();
               System.out.println("The area of the rectangle is " +area(length,width)); //method overloading
           }
           else if (shape==3) { //if statements to know how many variables to have to enter and what kind
               System.out.print("Enter heigth: ");
               int height = scanner.nextInt();
               System.out.print("Enter length of first base: ");
               int base1 = scanner.nextInt();
               System.out.print("Enter length of second base: ");
               int base2 = scanner.nextInt();
               System.out.println("The area of the trapezoid is " +area(height,base1,base2)); //method overloading
           }
           else if (shape==999) { //if statements to exit
               System.exit(-1);
           }
   }
       

public static double area(int radius) { //area method for circles
    double area = radius*radius * Math.PI;
    return area;
}

public static double area(int length, int width) { //area method for rectangle
    double area = length * width;
    return area;
}

public static double area(int height, int base1, int base2) { //area method for trapezoid
    double area = height * ((base1 + base2)/2);
    return area;
}


}