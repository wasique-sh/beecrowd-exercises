import java.util.Scanner;

public class T1914
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcases=reader.nextInt();
    
    for (int run=1; run<=testcases; run++)
    {
      String Player1=reader.next();
      String choice1=reader.next();
      
      String Player2=reader.next();
      String choice2=reader.next();
      
      int num1=reader.nextInt();
      int num2=reader.nextInt();
      
      if ((num1+num2)%2==0)
      {
        if (choice1.equals("PAR"))
          System.out.println (Player1);
        else
          System.out.println (Player2);
      }
      else
      {
        if (choice1.equals("IMPAR"))
          System.out.println (Player1);
        else
          System.out.println (Player2);
      }
    }
  }
}
