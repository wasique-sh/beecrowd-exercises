import java.util.Scanner;

public class T1866
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcases=reader.nextInt();
    
    for (int run=1; run<=testcases; run++)
    {
      int num=reader.nextInt();
      
      if (num%2==0)
        System.out.println (0);
      else
        System.out.println (1);
    }
  }
}