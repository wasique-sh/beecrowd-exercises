import java.util.Scanner;

public class T1144
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int y=1,z=1;
    
    for (int x=1;x<=n;x++)
    {
      String r="";
      
      y=x*x;
      z=y*x;
      
      r+=x+" "+y+" "+z+"\n";
      y+=1;
      z+=1;
      r+=x+" "+y+" "+z+"\n";
      System.out.print(r);
    }
  }
}