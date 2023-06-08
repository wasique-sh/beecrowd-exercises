import java.util.Scanner;
import java.text.DecimalFormat;

public class T2029
{
  public static DecimalFormat df=new DecimalFormat ("0.00");
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    while (reader.hasNext())
    {
      double vol=reader.nextDouble();
      double dia=reader.nextDouble();
      
      vol*=100;
      dia*=100;
      
      double heigth=(vol*100*100)/(314*(dia/2)*(dia/2));
      double area=(314*(dia/2)*(dia/2));
      System.out.println ("ALTURA = "+String.format("%.2f",heigth));
      System.out.println ("AREA = "+df.format(area/1000000));
    }
  }
}