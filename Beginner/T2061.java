import java.util.Scanner;

public class T2061
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int tabs=reader.nextInt();
    int actions=reader.nextInt();
    
    for (int run=1;run<=actions;run++)
    {
      String click=reader.next();
      
      if (click.equals("fechou"))
        tabs++;
      else
        tabs--;
    }
    
    System.out.println(tabs);
  }
}