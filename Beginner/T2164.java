import java.util.Scanner;

public class T2164
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num=reader.nextInt();
    
    double Alpha=((1+Math.sqrt(5))/2.0);
    double Bravo=((1-Math.sqrt(5))/2.0);
    
    double Fibo=((Math.pow(Alpha,num)-Math.pow(Bravo,num))/Math.sqrt(5));
    
    System.out.println (String.format("%.1f",Fibo));
  }
}