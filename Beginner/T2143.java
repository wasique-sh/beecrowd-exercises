import java.util.Scanner;

public class T2143
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int TestCase=1;
    
    while (TestCase!=0)
    {
      TestCase=reader.nextInt();
      
      for (int run=0;run<TestCase;run++)
      {
        int people=reader.nextInt();
        
        if (people%2!=0)
          System.out.println((--people*2+1));
        else
          System.out.println((people-2)*2+2);
      }
    }
  }
}