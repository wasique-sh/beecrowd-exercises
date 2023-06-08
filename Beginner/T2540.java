import java.util.Scanner;

public class T2540
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int team=reader.nextInt();
      int yes=0,no=0;
      
      for (int member=1;member<=team;member++)
      {
        if (reader.nextInt()==1)
          yes++;
        else
          no++;
      }
      
      double ratio=(yes+0.0)/team;
      double threshold=2.0/3.0;
      
      if (ratio>=threshold)
        System.out.println ("impeachment");
      else
        System.out.println ("acusacao arquivada");
    }
  }
}