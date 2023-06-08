import java.util.Scanner;
import java.text.DecimalFormat;

public class T1008
{
  public static DecimalFormat df=new DecimalFormat(".00");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int a=reader.nextInt();
    int b=reader.nextInt();
    double c=reader.nextDouble();

    double sal=b*c;
    
    System.out.println("NUMBER = "+a);
    System.out.println("SALARY = U$ "+df.format(sal));
  }
}