import java.util.Scanner;

public class T1099
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num=reader.nextInt();
    int x,y,p=0,sum=0;
    
    for (int c=0;c<num;c++)
    {
      x=reader.nextInt();
      y=reader.nextInt();
      
      if (y<x)
      {
        x+=y;
        y=x-y;
        x=x-y;
      }
      
      for (int d=x+1;d<y;d++)
      {
        if (d%2!=0)
          sum+=d;
      }
      System.out.println (sum);
      sum=0;
    }
  }
}