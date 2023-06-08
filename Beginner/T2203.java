import java.util.Scanner;

public class T2203
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int Xf=reader.nextInt();
      int Yf=reader.nextInt();
      
      int Xi=reader.nextInt();
      int Yi=reader.nextInt();
      
      int vel=reader.nextInt();
      
      int R1=reader.nextInt();
      int R2=reader.nextInt();
      
      double dis=Math.sqrt(Math.pow(Xf-Xi,2)+Math.pow(Yf-Yi,2));
      dis+=vel*1.5;
      
      if (dis>(R1+R2))
        System.out.println ("N");
      else
        System.out.println ("Y");
    }
  }
}