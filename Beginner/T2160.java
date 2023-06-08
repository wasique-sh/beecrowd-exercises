import java.util.Scanner;

public class T2160
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    String Zero=reader.nextLine();
    
    int length=Zero.length();
    
    if (length>80)
      System.out.println ("NO");
    else
      System.out.println ("YES");
  }
}