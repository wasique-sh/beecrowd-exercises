import java.util.Scanner;

public class T1115
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int x,y,p=0;
    
    while (p==0)
    {
      x=reader.nextInt();
      y=reader.nextInt();
      
      if ((x==0)||(y==0))
        p++;
      else
      {
        if (x>0)
        {
          if (y>0)
            System.out.println("primeiro");
          else
            System.out.println ("quarto");
        }
        else
        {
          if (y>0)
            System.out.println("segundo");
          else
            System.out.println ("terceiro");
        }
      }
    }
  }
}
