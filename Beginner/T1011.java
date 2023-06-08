import java.util.Scanner;
import java.text.DecimalFormat;

public class T1011
{
  public static DecimalFormat df=new DecimalFormat(".000");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double r=reader.nextDouble();
    double vol=(4.0/3)*3.14159*r*r*r;
    
    System.out.println ("VOLUME = "+df.format(vol));
  }
}