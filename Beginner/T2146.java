import java.util.Scanner;

public class T2146
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int password=reader.nextInt();
      System.out.println(--password);
    }
  }
}