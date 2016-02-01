import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready;

    System.out.println("Give me a number, and I'll find it's square root. ");
    System.out.print("Are you ready?!?");
    ready = keyboard.next();

    while ( ! ready.equalsIgnoreCase("yes") ) {
      System.out.print(" ... are you ready now???? ");
      ready = keyboard.next();
    }

    System.out.println("OK, give me that number. (No negatives, please.)");
    x = keyboard.nextDouble();

    while (x<0) {
      System.out.println("I wont't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }

      y = Math.sqrt(x);

      System.out.println("The square root of "+x+" is " +y);
  }
}
