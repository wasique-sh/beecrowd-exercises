import java.util.Scanner;

public class T2630
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int tasks=reader.nextInt();
    
    for (int task=1;task<=tasks;task++)
    {
      String type=reader.next();
      int red=reader.nextInt();
      int green=reader.nextInt();
      int blue=reader.nextInt();
      
      int gray=0;
      
      if (type.equals("min"))
        gray=Math.min(Math.min(red,green),blue);
      else if (type.equals("max"))
        gray=Math.max(Math.max(red,green),blue);
      else if (type.equals("mean"))
        gray=(red+green+blue)/3;
      else //if (type.equals("red"))
        gray=(int)(.3*red+.59*green+.11*blue);
      
      System.out.println ("Caso #"+task+": "+gray);
    }
  }
}