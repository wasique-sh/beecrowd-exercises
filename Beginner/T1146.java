import java.util.Scanner;

public class T1146
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int p=1,x;
    
    while (p!=0)
    {
      String r="";
      
      x=reader.nextInt();
      
        if (x==0)
          p=0;
        else
        {
          for (int i=1;i<=x;i++)
          {
            if (i==x)
              r+=i;
            else
              r+=i+" ";
          }
          System.out.println(r);
        }
    }
  }
}