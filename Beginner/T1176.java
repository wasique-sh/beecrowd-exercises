import java.util.Scanner;

public class T1176
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    long[] fib=new long[61];
    
    fib[0]=0;
    fib[1]=1;
    
    for (int f=2;f<fib.length;f++)
      fib[f]=fib[f-1]+fib[f-2];
    
    int t=reader.nextInt();
    
    String r="";
    
    for (int i=0;i<t;i++)
    {
      int n=reader.nextInt();
      r+="Fib("+n+") = "+fib[n]+"\n";
    }
    System.out.print(r);
  }
}