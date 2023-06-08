import java.util.Scanner;

public class T1165
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    int t=reader.nextInt();
    int n,p=0;
    
    for (int i=1;i<=t;i++)
    {
      n=reader.nextInt();
      
      for (int c=2;c<n;c++)
      {
        if (n%c==0)
          p++;
        if (p!=0)
          c=n;
      }
      if (p==0)
        System.out.println (n+" eh primo");
      else
        System.out.println (n+" nao eh primo");
      p=0;
    }
  }
}