import java.util.Scanner;
import java.text.DecimalFormat;

public class T1010
{
  public static DecimalFormat df=new DecimalFormat (".00");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l1=reader.nextLine();
    String[] s=l1.split(" ");
    
    int c1=Integer.parseInt(s[0]);
    int n1=Integer.parseInt(s[1].trim());
    double p1=Double.parseDouble(s[2]);
    
    String l2=reader.nextLine();
    String[] r=l2.split(" ");
    
    int c2=Integer.parseInt(r[0]);
    int n2=Integer.parseInt(r[1].trim());
    double p2=Double.parseDouble(r[2]);
    
    double val=(n1*p1)+(n2*p2);
    
    System.out.println("VALOR A PAGAR: R$ "+df.format(val));
    }
}