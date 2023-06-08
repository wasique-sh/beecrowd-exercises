import java.util.Scanner;

public class T2161
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int rep=reader.nextInt();
    
    if (rep==0)
      System.out.println("3.0000000000");
    else
    {
      double frac=1.0/6;
      
      for (int run=1;run<rep;run++)
        frac=(1.0/(6+frac));
      
      System.out.println (String.format("%.10f",(3+frac)));
    }
  }
}