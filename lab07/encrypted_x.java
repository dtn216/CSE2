import java.util.Scanner;

public class encrypted_x{
  public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
      int input = myScanner.nextInt();
      
      if (input >= 0 || input <= 100) {
          for(int i = 0; i < input; i++) {
              for(int x = 0; x < input; x++) {
                  if (x - i == 0 || (input - (i+x)) == 1) {
                      System.out.print(" ");
                  }
                  else {
                    System.out.print("*");
                  }
              }
              System.out.println();
          }
      }
      
      else System.exit(-1);
      
  }
}
