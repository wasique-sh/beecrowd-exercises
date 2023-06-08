import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class T1064
{
  public static DecimalFormat df=new DecimalFormat("0.0");
  
  public static void main(String[]args)
  {
    Scanner reader=new Scanner (System.in);
    double n=0;
    int p=0;
    int sum=0;
    
    for (int c=0;c<6;c++)
    {
      n=reader.nextDouble();
      n*=10;
      if (n>0)
      {
        sum+=n;
        p++;
      }
    }
    BigDecimal bd1=((new BigDecimal (String.valueOf(sum))).multiply(new BigDecimal ("0.1"))).divide(new BigDecimal (String.valueOf(p)));
    
    System.out.println (p+" valores positivos");
    System.out.println (df.format(bd1));
  }
}