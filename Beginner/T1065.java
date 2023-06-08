import java.util.Scanner;

public class T1065
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int e=0,n;
    
    for (int c=0;c<5;c++)
    {
      n=reader.nextInt();
      
      if (n%2==0)
        e++;
    }
    
    System.out.println (e+" valores pares");
  }
}