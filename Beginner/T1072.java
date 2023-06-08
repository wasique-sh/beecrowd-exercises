import java.util.Scanner;

public class T1072
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int i=0,o=0,q;
    
    for (int c=1;c<=n;c++)
    {
      q=reader.nextInt();
      
      if ((q>=10)&&(q<=20))
        i++;
      else
        o++;
    }
    
    System.out.println (i+" in");
    System.out.println (o+" out");
  }
}