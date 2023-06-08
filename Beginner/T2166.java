import java.util.Scanner;

public class T2166
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int rep=reader.nextInt();
    
    if (rep==0)
      System.out.println("1.0000000000");
    else
    {
      double frac=1.0/2;
      
      for (int run=1;run<rep;run++)
        frac=(1.0/(2+frac));
      
      System.out.println (String.format("%.10f",(1+frac)));
    }
  }
}