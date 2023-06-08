import java.util.Scanner;

public class T1142
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int p=1,q=4;
    
    for (int c=1;c<=n;c++)
    {
      String r="";
      for (p=p;p<=q;++p)
      {
        if (p%4==0)
          r+="PUM"+"\n";
        else
          r+=p+" ";
      }
      System.out.print(r);
      q=p+3;
    }
  }
}