import java.util.Scanner;

public class T1143
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int n1=1;
    String r="";
    for (int c=1;c<=n;c++)
    {
      r="";
      if (c==1)
      {
        r+="1 1 1"+"\n";
      }
      else
      {
        r+=n1+" "+(n1*n1)+" "+(n1*n1*n1)+"\n";
      }
      System.out.print (r);
      n1++;
    }
  }
}