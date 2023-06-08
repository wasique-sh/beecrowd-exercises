import java.util.Scanner;

public class T2165
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    String tweet=reader.nextLine();
    
    int length=tweet.length();
    
    if (length>140)
      System.out.println ("MUTE");
    else
      System.out.println ("TWEET");
  }
}