import java.util.Scanner;
import java.text.DecimalFormat;

public class T1017
{
  public static DecimalFormat df= new DecimalFormat (".000");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int t=reader.nextInt();
    int s=reader.nextInt();
    double f=(t*s)/12.0;
    
    System.out.println (df.format(f));
  }
}