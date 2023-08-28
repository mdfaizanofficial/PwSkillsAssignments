// Q8 - Write a program to print a triangle of prime numbers upto given number of lines of the trinagle,
import java.util.ArrayList;

public class Q8PrimeNumberPattern {
    static boolean prime(int n)
    {
        int temp=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) temp++;
        }
        return (temp==0);
    }
    public static void main(String[] args) {
        System.out.print("Enter your Number(Range 1-6): ");
        int n = Integer.parseInt(System.console().readLine());
        ArrayList<Integer> prime = new ArrayList<>();
        // insert prime element in the arrays.
        for(int i =2;i<=100;i++) if(prime(i)) prime.add(i);

        int k=0;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(prime.get(k++)+" ");
            }
            System.out.println();
        }

    }
    
}
