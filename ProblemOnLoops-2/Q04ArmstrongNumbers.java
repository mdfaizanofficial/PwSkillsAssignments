// Q4- Write a program to print all Armstrong numbers between 1 to n.
import java.util.Scanner;

public class Q04ArmstrongNumbers {
    public static boolean Armstrong(int n)
    {
        int temp=n; 
        int arm=0;
        while(temp>0)
        {
            int rem = temp%10;
            rem= rem*rem*rem;
            arm+=rem;
            temp/=10;
        }
        return (arm==n);
    }
    public static void main(String[] args) {
        System.out.print("Enter your N: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.print("Armstrong Number till N: ---> ");
        for(int i =1;i<=n;i++)
        {
            if(Armstrong(i)) System.out.print(i+", ");
        }
    }
    
}
