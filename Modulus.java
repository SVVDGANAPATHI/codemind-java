import java.util.Scanner;
public class aot
{
    public static void main(String args[])
    { 
        Double a,b,c,s,e;
        Scanner sc =new Scanner(System.in);
         a=sc.nextDouble();
         b=sc.nextDouble();
         e=a%b;
         System.out.format("%.0f",Math.floor(e));
    }
}