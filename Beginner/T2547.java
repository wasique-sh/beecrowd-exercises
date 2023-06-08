import java.util.Scanner;

public class T2547
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int guests=reader.nextInt();
      
      int lowerlimit=reader.nextInt();
      int higherlimit=reader.nextInt();
      
      int allowed=0;
      
      for (int guest0=1;guest0<=guests;guest0++)
      {
        int height=reader.nextInt();
        
        if (height>=lowerlimit && height<=higherlimit)
          allowed++;
      }
      
      System.out.println (allowed);
      
    }
  }
}