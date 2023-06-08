import java.util.Scanner;

public class T2533
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int subjectMax=reader.nextInt();
      
      int num=0,denom=0;
      
      for (int subject=1;subject<=subjectMax;subject++)
      {
        int grade=reader.nextInt();
        int work=reader.nextInt();
        
        num+=grade*work;
        denom+=work;
      }
      
      double api=(num+0.0)/(denom*100.0);
      System.out.printf ("%1.4f",api);
      System.out.println ();
    }
  }
}