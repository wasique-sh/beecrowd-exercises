import java.util.Scanner;

public class T2544
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int ninjas=reader.nextInt();
      
      int jutsu=0;
      
      while (ninjas!=1)
      {
        ninjas=ninjas/2;
        jutsu++;
      }
      
      System.out.println (jutsu);
    }
  }
}