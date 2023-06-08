import java.util.Scanner;

public class T2159
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num=reader.nextInt();
    
    double prime=num/Math.log(num);
    double prime0=1.25506*prime;
    
    System.out.println (String.format("%.1f",prime)+" "+String.format("%.1f",prime0));
  }
}