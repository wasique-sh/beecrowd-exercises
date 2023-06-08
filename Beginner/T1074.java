import java.util.Scanner;

public class T1074
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int m=reader.nextInt();
    int n;
    
    for (int c=1;c<=m;c++)
    {
      n=reader.nextInt();
      
      if (n==0)
        System.out.println ("NULL");
      else
      {
        if (n>0)
        {
          if (n%2==0)
            System.out.println ("EVEN POSITIVE");
          else
            System.out.println ("ODD POSITIVE");
        }
        else
        {
          if (n%2==0)
            System.out.println ("EVEN NEGATIVE");
          else
            System.out.println ("ODD NEGATIVE");
        }
      }
    }
  }
}