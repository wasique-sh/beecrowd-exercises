import java.util.Scanner;

public class T1019
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    
    int h=n/3600;
    int m=n%3600/60;
    int s=n%3600%60;
    
    System.out.println (h+":"+m+":"+s);
  }
}