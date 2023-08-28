// Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
// negative or zero. Calculate the sum of numbers until a negative number is encountered.
// If the input is a negative number, current sum is discarded and print -1.

import java.util.Scanner;

public class Q02CalculateSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of input: ");
        int n = input.nextInt();
        int sum =0;
        System.out.println("Enter values: ");
        int temp =0;
        while(n>0){
            int value = input.nextInt();
            sum+=value;
            n--;
            if(value<0){
                temp++;
            }
        }
        if(temp!=0){
            System.out.println("Output: "+(-1));
        }else{
            System.out.println("Output: "+sum);
        }
    }
    
}
