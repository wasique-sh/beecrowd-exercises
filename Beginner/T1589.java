import java.util.Scanner;

public class T1589
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int runlim=reader.nextInt();
    
    for (int run=1;run<=runlim;run++)
    {
      int rad1=reader.nextInt();
      int rad2=reader.nextInt();
      
      System.out.println(rad1+rad2);
    }
  }
}