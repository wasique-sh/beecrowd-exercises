import java.util.Scanner;

public class T1154
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    int p=1,t=0,sum=0;
    
    while (p==1)
    {
      int n=reader.nextInt();
      
      if (n<0)
        p=0;
      else
      {
        sum+=n;
        t++;
      }
    }
    System.out.printf("%.2f%n",(sum/(t*1.0)));
  }
}