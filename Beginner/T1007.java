import java.util.Scanner;

public class T1007
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int a=reader.nextInt();
    int b=reader.nextInt();
    int c=reader.nextInt();
    int d=reader.nextInt();
    
    int diff=(a*b)-(c*d);
    
    System.out.println ("DIFERENCA = "+diff);
  }
}