import java.util.Scanner;
import java.text.DecimalFormat;

public class T1117
{
  public static DecimalFormat df=new DecimalFormat("0.00");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double x,y;
    
    x=reader.nextDouble();
    while (!((x<=10)&&(x>=0)))
    {
      System.out.println("nota invalida");
      x=reader.nextDouble();
    }
    
    y=reader.nextDouble();
    while (!((y<=10)&&(y>=0)))
    {
      System.out.println("nota invalida");
      y=reader.nextDouble();
    }
    
    System.out.println ("media = "+df.format((x*10+y*10)/20));
  }
}