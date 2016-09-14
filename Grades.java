import java.util.Scanner;

class Grades
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String testOne;
        String testTwo;
        String testThree;

        String quizOne;
        String quizTwo;

        String homeWork;

        double testAverage;
        double quizAverage;

        System.out.println("Please enter your first test grade.");
        testOne = scan.nextLine();
        double testOneScore = Double.parseDouble(testOne);
        System.out.println("Now enter your second test grade.");
        testTwo = scan.nextLine();
        double testTwoScore = Double.parseDouble(testTwo);
        System.out.println("Finally, enter your third test");
        testThree = scan.nextLine();
        double testThreeScore = Double.parseDouble(testThree);
        System.out.println("Test 1: " + testOne);
        System.out.println("Test 2: " + testTwo);
        System.out.println("Test 3: " + testThree);

        System.out.println();

        System.out.println("Please enter your first quiz grade.");
        quizOne = scan.nextLine();
        int quizOneScore = Integer.parseInt(quizOne);
        System.out.println("Now enter your second quiz grade.");
        quizTwo = scan.nextLine();
        int quizTwoScore = Integer.parseInt(quizTwo);
        System.out.println("Quiz 1: " + quizOne);
        System.out.println("Quiz 2: " + quizTwo);

        System.out.println();

        System.out.println("Please enter your homework average.");
        homeWork = scan.nextLine();
        double homeWorkAvg = Double.parseDouble(homeWork);

        testAverage = (testOneScore + testTwoScore + testThreeScore)/ 3;
        quizAverage = ((double)quizOneScore + (double)quizTwoScore)/ 2;

        System.out.println("Test average: " + Double.toString(testAverage));
        System.out.println("Quiz average: " + Double.toString(quizAverage));
        
    }
}