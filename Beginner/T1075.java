import java.util.Scanner;

public class T1075
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    String r="";
    
    for (int c=2;c<10000;c++)
    {
      if (c%n==2)
        r+=c+"\n";
    }
    System.out.print(r);
  }
}