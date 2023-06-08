import java.util.Scanner;

public class T1021
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double q=reader.nextDouble();
    int s=(int)(q*100);
 
    int n=s;
    
    int a=n/10000;
    int b=n%10000/5000;
    int c=n%10000%5000/2000;
    int d=n%10000%5000%2000/1000;
    int e=n%10000%5000%2000%1000/500;
    int f=n%10000%5000%2000%1000%500/200;
    
    System.out.println ("NOTAS:");
    System.out.println (a+" nota(s) de R$ 100.00");
    System.out.println (b+" nota(s) de R$ 50.00");
    System.out.println (c+" nota(s) de R$ 20.00");
    System.out.println (d+" nota(s) de R$ 10.00");
    System.out.println (e+" nota(s) de R$ 5.00");
    System.out.println (f+" nota(s) de R$ 2.00");
    
    
    int g=n%10000%5000%2000%1000%500%200/100;;
    int h=n%10000%5000%2000%1000%500%200%100/50;
    int i=n%10000%5000%2000%1000%500%200%100%50/25;
    int j=n%10000%5000%2000%1000%500%200%100%50%25/10;
    int k=n%10000%5000%2000%1000%500%200%100%50%25%10/5;
    int l=n%10000%5000%2000%1000%500%200%100%50%25%10%5;
    
    System.out.println ("MOEDAS:");
    System.out.println (g+" moeda(s) de R$ 1.00");
    System.out.println (h+" moeda(s) de R$ 0.50");
    System.out.println (i+" moeda(s) de R$ 0.25");
    System.out.println (j+" moeda(s) de R$ 0.10");
    System.out.println (k+" moeda(s) de R$ 0.05");
    System.out.println (l+" moeda(s) de R$ 0.01");
  
  }
}