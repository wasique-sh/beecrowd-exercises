import java.util.Scanner;

public class T1078
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();

    String r="";
    
    for (int c=1;c<=10;c++)
    {
      r+=c+" x "+n+" = "+(n*c)+"\n";
    }
    
    System.out.print (r);
  }
}