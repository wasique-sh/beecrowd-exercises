import java.util.Scanner;

public class T1541
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double side1,side2,rate,area;
    
    String Alpha="";
    
    while (reader.hasNext())
    {
      side1=reader.nextDouble();
      
      if (side1==0)
        break;
      
      side2=reader.nextDouble();
      rate=reader.nextDouble();
      
      area=side1*side2*10000;
      area/=rate;
      
      Alpha+=(int)(Math.sqrt(area)/10)+"\n";
    }
    System.out.print(Alpha);
  }
}