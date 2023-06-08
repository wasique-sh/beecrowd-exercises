import java.util.Scanner;

public class T1158
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int x,y,r,sum=0;
    
    for (int c=1;c<=n;c++)
    {
      x=reader.nextInt();
      y=reader.nextInt();
      
      if (x%2!=0)
        r=x;
      else
        r=x+1;
      
      for (int z=1;z<=y;z++)
      {
        if(r%2!=0)
          sum+=r;
        else
          z--;
        r++;
      }
      System.out.println (sum);
      sum=0;
    }
  }
}