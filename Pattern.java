import java.io.*;
import java.util.*;
class display
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
}