import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class T1051
{
  public static DecimalFormat df=new DecimalFormat("0.00");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double sali=reader.nextDouble();
    
    long salf=Math.round(sali*100);
    int sal8;
    int sal18;
    
    String salg;
    
    if (salf<=200000)
      System.out.println("Isento");
    else if (salf<=300000)
    {
      salf-=200000;
      salg=String.valueOf(salf);
      BigDecimal bd1=(new BigDecimal (salg)).multiply(new BigDecimal ("0.0008"));
      System.out.println ("R$ "+df.format(bd1));
    }
    else if (salf<=450000)
    {
      sal8=100000;
      salg=String.valueOf(sal8);
      BigDecimal bd1=(new BigDecimal (salg)).multiply(new BigDecimal ("0.0008"));
      
      salf-=300000;
      salg=String.valueOf(salf);
      BigDecimal bd2=(new BigDecimal (salg)).multiply(new BigDecimal ("0.0018"));
      BigDecimal bd3=bd1.add(bd2);
      
      System.out.println ("R$ "+df.format(bd3));
    }
    else
    {
      sal8=100000;
      salg=String.valueOf(sal8);
      BigDecimal bd1=(new BigDecimal (salg)).multiply(new BigDecimal ("0.0008"));;
      
      sal18=150000;
      salg=String.valueOf(sal18);
      BigDecimal bd2=(new BigDecimal (salg)).multiply(new BigDecimal ("0.0018"));
      
      salf-=450000;
      salg=String.valueOf(salf);
      BigDecimal bd3=(new BigDecimal (salg)).multiply(new BigDecimal ("0.0028"));
      BigDecimal bd4=(bd1.add(bd2)).add(bd3);
      
      System.out.println ("R$ "+df.format(bd4));
    }
  }
}