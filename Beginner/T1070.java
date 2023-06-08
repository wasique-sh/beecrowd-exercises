import java.util.Scanner;

public class T1070
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int o=6;
    
    for (int c=n;o>0;c++)
    {
      if (c%2!=0)
      {
        System.out.println (c);
        o--;
      }
    }
  }
}