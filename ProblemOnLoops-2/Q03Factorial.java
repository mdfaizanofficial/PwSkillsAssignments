// Q3 - Write a program to calculate the factorial of a number.

import java.util.Scanner;
public class Q03Factorial {
    public static int fact(int n)
    {
        if(n==0||n==1) return 1;

        int factorial=n;
        factorial = factorial*fact(n-1);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Numebr: ");
        int n = input.nextInt();
        int result = fact(n);
        System.out.println("Factorial of "+n+" is:--> "+result);

    }
    
}
