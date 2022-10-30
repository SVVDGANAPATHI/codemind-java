import java.io.*;
import java.util.*;
class display
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if ((n>=3)&&(n<=100))
        {
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    else
    {
        System.out.println("The pattern is not possible");
    }
}}