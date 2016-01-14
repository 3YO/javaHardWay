import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double ft, inches, pounds, bmi;

    System.out.print( "Your height (feet only): " );
    ft = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    bmi = (pounds * 703) / ((ft*12+inches)*(ft*12+inches));

    System.out.println( "Your BMI is " + bmi );
  }
}
