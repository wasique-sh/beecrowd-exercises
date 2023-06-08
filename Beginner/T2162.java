import java.util.Scanner;

public class T2162
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcase=reader.nextInt();
    
    int []Nland=new int [testcase];
    
    boolean yes=true;
    
    for (int run=0;run<Nland.length;run++)
      Nland[run]=reader.nextInt();
    
    if (Nland[0]<Nland[1])
    {
      for (int run=2;run<Nland.length;run++)
      {
        if ((run%2==0)&&yes)
          yes=Nland[run-1]>Nland[run];
        else if ((run%2!=0)&&yes)
          yes=Nland[run-1]<Nland[run];
        else
          break;
      }
      if (yes)
        System.out.println("1");
      else
        System.out.println("0");
    }
    else if (Nland[0]>Nland[1])
    {
      for (int run=2;run<Nland.length;run++)
      {
        if ((run%2==0)&&yes)
          yes=Nland[run-1]<Nland[run];
        else if ((run%2!=0)&&yes)
          yes=Nland[run-1]>Nland[run];
        else
          break;
      }
      if (yes)
        System.out.println("1");
      else
        System.out.println("0");
    }
    else
      System.out.println("0");
  }
}