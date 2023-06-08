import java.util.Scanner;

public class T2234
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int hotdogs=reader.nextInt();
    int people=reader.nextInt();
    
    double average=hotdogs/(people*1.0);
    
    System.out.println (String.format("%.2f",average));
  }
}