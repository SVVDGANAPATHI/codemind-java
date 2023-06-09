import java.io.*;
import java.util.*;
public class pattern
{
    public static void main(String args[])
    {
        int n,i,j,p=65;
        char c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
              System.out.print((char)p+" ");
            }
           System.out.println(""); 
           p++;
        }
    }
}