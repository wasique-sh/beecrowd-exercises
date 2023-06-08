import java.util.Scanner;

public class T1071
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int x=reader.nextInt();
    int y=reader.nextInt();
    int sum=0,a=0,b=0;
    
    if (x==y)
      System.out.println (0);
    else
    {
      if (x<y)
      {
        a=x+1;
        b=y;
      }
      else
      {
        a=y+1;
        b=x;
      }
      
      for (int c=a;c<b;c++)
      {
        if (c%2!=0)
          sum+=c;
      }
      System.out.println(sum);
    }
  }
}