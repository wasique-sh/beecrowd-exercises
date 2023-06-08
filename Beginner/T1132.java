import java.util.Scanner;

public class T1132
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int x=reader.nextInt();
    int y=reader.nextInt();
    int sum=0;
    
    if (x>y)
    {
      x+=y;
      y=x-y;
      x=x-y;
    }
    
    for (int c=x;c<=y;c++)
    {
      if (c%13!=0)
        sum+=c;
    }
    System.out.println (sum);
  }
}