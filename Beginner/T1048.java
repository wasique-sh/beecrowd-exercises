import java.util.Scanner;
import java.math.BigDecimal;

public class T1048
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.nextLine();
    BigDecimal bd1=(new BigDecimal(l));
    BigDecimal bd2=bd1.multiply(new BigDecimal("100"));
    
    int n=bd2.intValue();
   
    int r=0,m=0;
    
    if (n>=0)
    {
      if(n<=40000)
      {
        r=15;
        m=(n*r)/100;
      }
      else if (n<=80000)
      {
        r=12;
        m=(n*r)/100;
      }
      else if (n<=120000)
      {
        r=10;
        m=(n*r)/100;
      }
      else if (n<=200000)
      {
        r=7;
        m=(n*r)/100;
      }
      else if (n>80000)
      {
        r=4;
        m=(n*r)/100;
      }
    }
    String mm=String.valueOf(m);
    BigDecimal m1=(new BigDecimal(mm)).multiply(new BigDecimal("0.01"));
    BigDecimal n1=bd1.add(m1);
    
    System.out.println("Novo salario: "+n1);
    System.out.println("Reajuste ganho: "+m1);
    System.out.println("Em percentual: "+r+" %");
  }
}
