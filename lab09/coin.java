import java.util.Scanner;
public class coin{
   public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter 0 to flip once, or a number less than 100 to flip multiple times, or a number larger to exit: ");
       int attempt = scanner.nextInt();
       if (attempt ==0) {
           System.out.println(flip());
       }
       if (attempt > 0 && attempt <=100) {
           flip(attempt);
       }
       if (attempt > 100) {
           System.exit(-1);
       }
   }

    public static int flip() {
        double i = Math.random();
        if (i < 0.5) {
            System.out.println("tail");
            return 0;
        }
        else {
            System.out.println("head");
            return 1;
        }
    }
    
    public static void flip(int a) {
        int times = 0;
        int countertail=0;
        int counterhead=0;
        while (times < a) {
            flip();
            if (flip() < 0.5) {
                countertail++;
            }
            else counterhead++;
            times++;
        }
        System.out.println("you flipped " +counterhead + " heads and " +countertail + " tails.");
        
    }

}