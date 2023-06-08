import java.util.Scanner;
import java.text.DecimalFormat;

public class T1006
{
  private static DecimalFormat df=new DecimalFormat(".0");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double a=reader.nextDouble();
    double b=reader.nextDouble();
    double c=reader.nextDouble();
    double media=(a*2+b*3+c*5)/(2+3+5);
    
    System.out.println("MEDIA = "+df.format(media));
  }
}