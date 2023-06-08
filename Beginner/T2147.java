import java.util.Scanner;
import java.text.DecimalFormat;

public class T2147
{
  public static DecimalFormat df=new DecimalFormat ("00");
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcase=reader.nextInt();
    
    for (int run=1;run<=testcase;run++)
    {
      String Alpha=reader.next();
      
      int time=Alpha.length();
      int sec=time/100;
      int milSec=time%100;
      
      System.out.println (sec+"."+df.format(milSec));
    }
  }
}