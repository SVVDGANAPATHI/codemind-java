import java.util.Scanner;
public class aot
{
    public static void main(String args[])
    { 
        int a,b,c,e;
        Scanner sc =new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         e=a*b*c*512*2;
         
         System.out.format("%.0f",Math.floor(e));
    }
}