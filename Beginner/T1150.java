import java.util.Scanner;

public class T1150
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int x=reader.nextInt();
    int z=reader.nextInt();
    
    int p=1;
    
    while (z<=x)
      z=reader.nextInt();
    
    int sum=x;
    
    while (sum<=z)
    {
      sum+=++x;
      p++;
    }
    System.out.println(p);
  }
}