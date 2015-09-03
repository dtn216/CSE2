import java.util.Scanner;

public class InterestCalc{

public static void main(String[] args) {

Scanner user_input = new Scanner(System.in);
    
double balance;
System.out.println("what is your current account balance?");
balance = user_input.nextDouble();

double interest;
System.out.println("what is your interest rate?");
interest = user_input.nextDouble();

double result = balance * (interest / 100) + balance;
    
System.out.println("your account balance in a year will be " + Math.round(result) );  
}
}