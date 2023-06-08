import java.util.Scanner;

public class T1067
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
     int n=reader.nextInt();
     
     for (int c=1;c<=n;c++)
     {
       if (c%2!=0)
         System.out.println (c);
     }
  }
}