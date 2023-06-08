import java.util.Scanner;

public class T2311
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int divers=reader.nextInt();
    
    for (int diver=1;diver<=divers;diver++)
    {
      String name=reader.next();
      
      double difficulty=reader.nextDouble();
      
      double sum=0.0;
      double max=0.0;
      double min=0.0;
      
      double []judges=new double [7];
      
      sum+=(judges[0]=reader.nextDouble());
      max=judges[0];
      min=judges[0];
      
      for (int judge=1;judge<judges.length;judge++)
      {
        sum+=(judges[judge]=reader.nextDouble());
        
        if (judges[judge]>max)
          max=judges[judge];
        else if (judges[judge]<min)
          min=judges[judge];
      }
      sum-=(max+min);
      
      System.out.println(name+" "+String.format("%.2f",(sum*difficulty)));
    }
  }
}