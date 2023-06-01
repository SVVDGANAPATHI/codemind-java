import java.util.Scanner;
public class aot
{
    public static void main(String args[])
    { 
        int a,e;
        Scanner sc =new Scanner(System.in);
         a=sc.nextInt();
         e=a*(a-1)/2;
         System.out.format("%.0f",Math.floor(e));
    }
}