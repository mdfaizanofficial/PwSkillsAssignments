// Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
import java.util.Scanner;

class Q01FibonacciSeries
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = input.nextInt();
        input.close();
        
    // Fibonacci series
        int a=0,b=1;
        System.out.print("Fibonacci_Series:--> ");
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}