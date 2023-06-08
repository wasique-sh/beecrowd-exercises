import java.util.Scanner;
import java.text.DecimalFormat;

public class T1002
{
  private static DecimalFormat df = new DecimalFormat(".0000");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double r=reader.nextDouble();
    
    double area=r*r*3.14159;

    System.out.print ("A=");
    System.out.println (df.format(area));
  }
}