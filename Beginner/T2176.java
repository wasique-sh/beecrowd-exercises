import java.util.Scanner;

public class T2176
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner(System.in);
    
    String data=reader.next();
    
    int sum=0;
    
    for (int row=0;row<data.length();row++)
      sum+=Integer.parseInt(""+data.charAt(row));
    
    if (sum%2==0)
      System.out.println (data+"0");
    else
      System.out.println (data+"1");
  }
}