import java.util.Scanner;
import java.text.DecimalFormat;

public class T1038
{
  public static DecimalFormat df=new DecimalFormat ("0.00");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.nextLine();
    String[] s=l.split(" ");
    
    int x=Integer.parseInt(s[0]);
    int y=Integer.parseInt(s[1]);
    
    switch (x)
    {
      case 1: System.out.println("Total: R$ "+df.format(4.00*y));
              break;
      case 2: System.out.println("Total: R$ "+df.format(4.50*y));
              break;
      case 3: System.out.println("Total: R$ "+df.format(5.00*y));
              break;
      case 4: System.out.println("Total: R$ "+df.format(2.00*y));
              break;
      case 5: System.out.println("Total: R$ "+df.format(1.50*y));
              break;
      default: System.out.println("Total: R$ "+df.format(0));
              break;
    }
  } 
}