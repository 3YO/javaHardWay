import java.util.Scanner;

public class RudeQuestions {
    public static void main( String[] args) {
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello, What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print( "Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + "." );

    String college;

    System.out.print( "One last question, where did you go to college? ");
    college = keyboard.next();
    System.out.println( "Oh, nice." + college + " is a good school." );

    /* Study Drills
    1. No. Double can handle Integer with no problem.
    2. No. Strings can also hold numbers.
    3. I can't get question 1 to blow up. Question 2 blows up using decimals and
    non numerical characters. Question 3 and 4 blow up using non numerical characters.
    */
    }
}
