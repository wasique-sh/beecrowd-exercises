import java.util.Scanner;
import java.text.DecimalFormat;

public class T1014
{
  public static DecimalFormat df=new DecimalFormat(".000");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    int x=reader.nextInt();
    double y=reader.nextDouble();
    
    System.out.println (df.format(x/y)+" km/l");
  }
}

