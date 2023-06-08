import java.util.Scanner;

public class T1020
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    
    int y=n/365;
    int m=n%365/30;
    int d=n%365%30;
    
    System.out.println (y+" ano(s)");
    System.out.println (m+" mes(es)");
    System.out.println (d+" dia(s)");
  }
}