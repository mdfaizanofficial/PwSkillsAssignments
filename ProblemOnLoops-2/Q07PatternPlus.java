// Q7- Write a program to print pattern given below (plus pattern):
public class Q07PatternPlus {
    public static void main(String[] args) {
        System.out.print("Enter your Number(odd number only): "); 
        int n = Integer.parseInt(System.console().readLine());
        for(int i =1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(j==n/2+1 || i==n/2+1)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
