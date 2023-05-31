import java.util.Scanner;
public class aot
{
    public static void main(String args[])
    { 
        Double a,b,c,s,e;
        Scanner sc =new Scanner(System.in);
         a=sc.nextDouble();
         b=sc.nextDouble();
         c=sc.nextDouble();
         s=(a+b+c)/2;
         e=Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.format("%.2f",e);
    }
}