import java.io.*;
import java.util.*;
public class patter
{
    public static void main(String args[])
    {
        int n,i,j;char c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int p=64+n;
        int o=n;
        for(i=0;i<n;i++)
        {
            for(j=0;j<o;j++)
            {
              System.out.print((char)p+" ");
            }
            o--;
           System.out.println(""); 
           p--;
        }
    }
}