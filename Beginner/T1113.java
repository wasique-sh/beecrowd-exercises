import java.util.Scanner;

public class T1113
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int x,y,p=0;
    
    while (p==0)
    {
      x=reader.nextInt();
      y=reader.nextInt();
      
      if (x==y)
        p++;
      else
      {
        if (x<y)
          System.out.println ("Crescente");
        else
          System.out.println ("Decrescente");
      }
    }
  }
}