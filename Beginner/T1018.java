import java.util.Scanner;

public class T1018
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    
    int a=n/100;
    int b=n%100/50;
    int c=n%100%50/20;
    int d=n%100%50%20/10;
    int e=n%100%50%20%10/5;
    int f=n%100%50%20%10%5/2;
    int g=n%100%50%20%10%5%2;
    
    System.out.println (n);
    System.out.println (a+" nota(s) de R$ 100,00");
    System.out.println (b+" nota(s) de R$ 50,00");
    System.out.println (c+" nota(s) de R$ 20,00");
    System.out.println (d+" nota(s) de R$ 10,00");
    System.out.println (e+" nota(s) de R$ 5,00");
    System.out.println (f+" nota(s) de R$ 2,00");
    System.out.println (g+" nota(s) de R$ 1,00");
  }
}