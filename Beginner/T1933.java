import java.util.Scanner;

public class T1933
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int card1=reader.nextInt();
    int card2=reader.nextInt();
    
    if (card1==card2)
      System.out.println (card1);
    else if (card1>card2)
      System.out.println (card1);
    else
      System.out.println (card2);
  }
}