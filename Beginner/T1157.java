import java.util.Scanner;

public class T1157
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    String r="";
    for (int i=1;i<=n;i++)
    {
      if (n%i==0)
        r+=i+"\n";
    }
    System.out.print(r);
  }
}