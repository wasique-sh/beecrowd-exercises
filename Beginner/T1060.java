import java.util.Scanner;

public class T1060
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int c,sum=0;
    
    for(c=0;c<6;c++)
    {
      double n=reader.nextDouble();
      
      if (n>0)
        sum++;
    }
    System.out.println (sum+" valores positivos");
  }
}