import java.util.Scanner;
import java.lang.Math;

class Lesson_9_Activity_Two
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      
      double[] tests = new double[3];
      int[] quizs = new int[2];
      double homework = 0.0;
      
      System.out.println("Please enter your test grades.");
      tests[0] = scan.nextDouble();
      tests[1] = scan.nextDouble();
      tests[2] = scan.nextDouble();
      for (int i = 0; i <= 2; i++)
      {
        System.out.println("Test " + (i + 1) + ": " + tests[i]);
      }
      
      System.out.println();
      
      System.out.println("Please enter your quiz grades.");
      
      
    }
    
}