import java.util.Scanner;
import java.text.DecimalFormat;

public class T1036
{
  public static DecimalFormat df=new DecimalFormat ("0.00000");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.nextLine();
    String[]s=l.split(" ");
    
    double a=Double.parseDouble(s[0]);
    double b=Double.parseDouble(s[1].trim());
    double c=Double.parseDouble(s[2]);
    
    boolean k=((a==0)||((b*b-4*a*c)<0));
    
    if (k==true)
    {
      System.out.println ("Impossivel calcular");
    }
    else
    {
      double r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
      double r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        
      System.out.println("R1 = "+df.format(r1));
      System.out.println("R2 = "+df.format(r2));
    }
  }
}