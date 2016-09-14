import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        double testOne = 0.0;
        double testTwo = 0.0;
        double testThree = 0.0;

        int quizOne = 0;
        int quizTwo = 0;

        double homeWork = 0.0;

        double testAverage = 0.0;
        double quizAverage = 0.0;

        System.out.print("Please enter your test grades.\nTest 1: ");
        testOne = scan.nextDouble();
        System.out.print("\nTest 2: ");
        testTwo = scan.nextDouble();
        System.out.print("\nTest 3: "); 
        testThree = scan.nextDouble();
        
        System.out.println();

        System.out.print("Please enter your quiz grades.\nQuiz 1: ");
        quizOne = scan.nextInt();
        System.out.print("\nQuiz 2: ");
        quizTwo = scan.nextInt();

        System.out.println();

        System.out.println("Please enter your homework average.");
        System.out.print("\nHomework: ");
        homeWork = scan.nextDouble();

        testAverage = (testOne + testTwo + testThree)/ 3;
        quizAverage = ((double)quizOne + (double)quizTwo)/ 2;

        System.out.println("Test average: " + Double.toString(testAverage));
        System.out.println("Quiz average: " + Double.toString(quizAverage));
        
    }
}
