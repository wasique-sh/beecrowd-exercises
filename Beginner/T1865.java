import java.util.Scanner;

public class T1865
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcases=reader.nextInt();
    
    for (int run=1; run<=testcases; run++)
    {
      String Heimdall=reader.next();
      
      int newton=reader.nextInt();
      
      if (Heimdall.equals("Thor"))
        System.out.println ("Y");
      else
        System.out.println ("N");
    }
  }
}