import java.util.Scanner;
import java.text.DecimalFormat;

public class T1116
{
  public static DecimalFormat df=new DecimalFormat("0.0");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int x,y;
    
    for (int c=0;c<n;c++)
    {
      x=reader.nextInt();
      y=reader.nextInt();
      
      if (y==0)
        System.out.println ("divisao impossivel");
      else
      {
        System.out.println (df.format(((x*10.0)/y)/10));
      }
    }
  }
}