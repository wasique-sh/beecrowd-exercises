import java.util.Scanner;

public class T2167
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcase=reader.nextInt();
    int event=0;
    
    int[] rpm=new int [testcase];
    
    for (int run=0;run<rpm.length;run++)
      rpm[run]=reader.nextInt();
    
    for (int run=1;run<rpm.length;run++)
    {
      if (rpm[run-1]>rpm[run])
      {
        event=run+1;
        break;
      }
    }
    
    System.out.println (event);
  }
}