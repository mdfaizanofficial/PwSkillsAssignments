// Q9- Write a program to check whether a prime Number can be expressed as a Sum of Two Prime Numbers.
import java.util.ArrayList;

public class Q09CheckSumOfTwoPrieNumbers {
    static boolean isPrime(int n)
    {
        int temp=0;
        for(int i =2;i*i<=n;i++)
        {
            if(n%i==0) temp++;
        } 
        return (temp==0);
    }
    public static void main(String[] args) {
        System.out.print("Enter your Prime Number: ");
        int n = Integer.parseInt(System.console().readLine());
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i=2;i<n;i++) 
        {
            if(isPrime(i)) prime.add(i);
        }

        boolean ans = false;
        int st=0;
        int len=prime.size()-1;
        while(st<len)
        {
            if(prime.get(st)+prime.get(len)==n){
                ans = true;
                break;
            }else{
                len--;
            }
        }
        System.out.println("All prime number till "+n+" --> "+prime);
        System.out.println(n+" is sum of two prime numbers: "+ans);
    }
    
}
