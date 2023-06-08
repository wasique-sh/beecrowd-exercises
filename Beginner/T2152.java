import java.util.Scanner;
import java.text.DecimalFormat;

public class T2152
{
  public static DecimalFormat df=new DecimalFormat ("00");
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcase=reader.nextInt();
    
    for (int run=1;run<=testcase;run++)
    {
      int hour=reader.nextInt();
      int min=reader.nextInt();
      int candle=reader.nextInt();
      
      if (candle==0)
        System.out.println (df.format(hour)+":"+df.format(min)+" - A porta fechou!");
      else
        System.out.println (df.format(hour)+":"+df.format(min)+" - A porta abriu!");
    }
  }
}
