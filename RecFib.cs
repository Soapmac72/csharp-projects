using System;

class RecFib
{
    static void Main(string[] args)
    {
        for (int i = 2; i < 15; i++)
        {
            Console.WriteLine(RecursiveFib(i));
        }
    }

    static public long RecursiveFib(int n)
    {
        if ((n == 0)||(n == 1))
        {
            return n;
        }

        return RecursiveFib(n - 1) + RecursiveFib(n - 2);
    }

}