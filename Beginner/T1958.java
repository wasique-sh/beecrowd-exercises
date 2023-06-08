import java.util.Scanner;

public class T1958
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    double Alpha=reader.nextDouble();
    
    String Bravo=String.format("%.4E",Alpha);
    
    if (Bravo.charAt(0)!='-')
      System.out.println ("+"+Bravo);
    else
      System.out.println (Bravo);
  }
}