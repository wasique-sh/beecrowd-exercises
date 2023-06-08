import java.util.Scanner;

public class T2172
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int level=reader.nextInt();
      int xp=reader.nextInt();
      
      if (level!=0&&xp!=0)
      {
        System.out.println (level*xp);
      }
    }
  }
}