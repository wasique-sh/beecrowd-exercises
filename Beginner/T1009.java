import java.util.Scanner;
import java.text.DecimalFormat;

public class T1009
{
  public static DecimalFormat df=new DecimalFormat(".00");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String a=reader.next();
    double b=reader.nextDouble();
    double c=reader.nextDouble();

    double sal=b+(c*15/100);
    
    System.out.println("TOTAL = R$ "+df.format(sal));
  }
}