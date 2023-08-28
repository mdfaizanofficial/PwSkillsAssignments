// Q6- Write a program to print alphabet diamond pattern:
import java.util.Scanner;
public class Q06AlphabetDiamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = input.nextInt();
        for(int i = 1;i<=n;i++)
        {
            char ch = 65;
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i*2-1;j++)
            {
                System.out.print(ch++);
            } 
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            char ch = 65;
            for(int j = 1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    
}
