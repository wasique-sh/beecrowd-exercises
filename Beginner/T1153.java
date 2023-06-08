import java.util.Scanner;

public class T1153
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int res=n;
    for (int i=1;i<n;i++)
      res*=i;
    System.out.println (res);
  }
}