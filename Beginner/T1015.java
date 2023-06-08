import java.util.Scanner;
import java.text.DecimalFormat;

public class T1015
{
  public static DecimalFormat df=new DecimalFormat (".0000");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.nextLine();
    String[]s=l.split(" ");
    
    double x1=Double.parseDouble(s[0]);
    double y1=Double.parseDouble(s[1]);
    
    String l1=reader.nextLine();
    String[]s1=l1.split(" ");
    
    double x2=Double.parseDouble(s1[0]);
    double y2=Double.parseDouble(s1[1]);
    
    double dis=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    
    System.out.println (df.format(dis));
    
  }
}