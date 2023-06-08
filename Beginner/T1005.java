import java.util.Scanner;
import java.text.DecimalFormat;

public class T1005
{
  private static DecimalFormat df=new DecimalFormat("0.00000");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double a=reader.nextDouble();
    double b=reader.nextDouble();
    double media=(a*3.5+b*7.5)/(3.5+7.5);
    
    System.out.println("MEDIA = "+df.format(media));
  }
}