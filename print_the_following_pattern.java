import java.io.*;
import java.util.*;
public class pattern
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print("0");
                }
                else
                {
                   System.out.print("x"); 
                }
            }
           System.out.println(""); 
        }
    }
}