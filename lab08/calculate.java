import java.util.Scanner;

public class calculate{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[10];
    System.out.println("Enter 10 numbers, each followed by the enter key: ");
    for(int i=0; i<10; i++) {
      array[i] = scanner.nextInt();  
    }
    System.out.println("The mean of the above 10 numbers is: " +mean(array));
    
  }

  public static double mean(int[] a) {
    double sum=0;
    for(int z=0;z<10;z++) {
      sum += a[z];
    }
    double average = sum/10;
    return average;
  }
  
  public static double median(int[] b) {
    if (b.length % 2 == 0) {
      
    }
  }

  
}

