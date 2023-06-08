import java.util.Scanner;

public class T2235
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int credA=reader.nextInt();
    int credB=reader.nextInt();
    int credC=reader.nextInt();
    
    if ((credA+credB==credC)||(credB+credC==credA)||
        (credC+credA==credB)||(credA-credB==0)||
        (credB-credC==0)||(credC-credA==0))
      System.out.println ("S");
    else
      System.out.println ("N");
  }
}