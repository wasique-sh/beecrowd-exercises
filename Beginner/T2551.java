import java.util.Scanner;

public class T2551
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int trainDays=reader.nextInt();
      
      int time=reader.nextInt();
      int distance=reader.nextInt();
      
      double speed0=(distance+0.0)/time;
      
      System.out.println ("1");
      
      for (int day=2;day<=trainDays;day++)
      {
        time=reader.nextInt();
        distance=reader.nextInt();
        
        double speed=(distance+0.0)/time;
        
        if (speed>speed0)
        {
          speed0=speed;
          System.out.println (day);
        }
      }
      
    }
  }
}