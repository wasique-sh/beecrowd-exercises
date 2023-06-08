import java.util.Scanner;

public class T1164
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int t=reader.nextInt();
    
    for (int d=1;d<=t;d++)
    {
      int n=reader.nextInt();
      int sum=0;
        
        for (int c=1;c<n;c++)
      {
        if (n%c==0)
          sum+=c;
      }
      if (sum==n)
        System.out.println (n+" eh perfeito");
      else
        System.out.println (n+" nao eh perfeito");
      sum=0;
    }
  }
}