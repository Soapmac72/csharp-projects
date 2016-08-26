using System;

class Fib
{
    public static int Fibonacci (int n)
    {
        int fib1 = 1;
        int fib2 = 1;

        for (int i = 0; i < n; i++)
        {
            int temp = fib1;
            fib1 = fib2;
            fib2 = temp + fib2;
        }
        return fib1;
    }

    static void Main(string[] args)
    {
        for (int i = 0; i < 5; i++)
        {
            Console.WriteLine(Fibonacci(i));
        }
    }
}