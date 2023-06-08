import java.util.Scanner;
import java.text.DecimalFormat;

public class T1079
{
  public static DecimalFormat df=new DecimalFormat ("0.0");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int m=reader.nextInt();
    double n0,n1,n2;
    String r="";
    
    for (int c=1;c<=m;c++)
    {
      n0=reader.nextDouble();
      n1=reader.nextDouble();
      n2=reader.nextDouble();
      
      r+=df.format(((n0*10*2)+(n1*10*3)+(n2*10*5))/100)+"\n";
    }
    System.out.print (r);
  }
}