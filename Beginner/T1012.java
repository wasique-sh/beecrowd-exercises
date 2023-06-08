import java.util.Scanner;
import java.text.DecimalFormat;

public class T1012
{
  public static DecimalFormat df=new DecimalFormat("0.000");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.nextLine();
    String[]s=l.split(" ");
    
    double a=Double.parseDouble(s[0]);
    double b=Double.parseDouble(s[1].trim());
    double c=Double.parseDouble(s[2]);
    
    System.out.println("TRIANGULO: "+df.format(.5*a*c));
    System.out.println("CIRCULO: "+df.format(3.14159*c*c));
    System.out.println("TRAPEZIO: "+df.format((a+b)/2*c));
    System.out.println("QUADRADO: "+df.format(b*b));
    System.out.println("RETANGULO: "+df.format(a*b));
  }
}