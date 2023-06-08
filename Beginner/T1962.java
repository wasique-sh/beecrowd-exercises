import java.util.Scanner;

public class T1962
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcase=reader.nextInt();
    
    for (int run=1;run<=testcase;run++)
    {
      int year=reader.nextInt();
      
      if (year<=2014)
        System.out.println ((2015-year)+" D.C.");
        else
        System.out.println ((year-2014)+" A.C.");
    }
  }
}