import java.util.Scanner;

public class T1080
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
   
    int n=reader.nextInt();
    int h=n;
    int p=1;
    
    for (int c=2;c<=100;c++)
    {
      n=reader.nextInt();
      
      if (h<n)
      {
        h=n;
        p=c;
      }
    }
    
    System.out.println (h);
    System.out.println (p);
  }
}