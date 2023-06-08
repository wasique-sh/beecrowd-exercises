import java.util.Scanner;

public class T1133
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int x=reader.nextInt();
    int y=reader.nextInt();
    String r="";
    
    if (x>y)
    {
      x+=y;
      y=x-y;
      x=x-y;
    }
    
    for (int c=x+1;c<y;c++)
    {
      if ((c%5==2)||(c%5==3))
        r+=c+"\n";
    }
    System.out.print(r);
  }
}