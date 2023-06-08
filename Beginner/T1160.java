import java.util.Scanner;

public class T1160
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int t=reader.nextInt();
    int pa,pb,yr=0;
    double g1,g2;
    
    for (int c1=1;c1<=t;c1++)
    {
      pa=reader.nextInt();
      pb=reader.nextInt();
      g1=reader.nextDouble();
      g2=reader.nextDouble();
      
      g1*=1000;
      g2*=1000;
      
      while (pa<=pb)
      {
        pa+=(int)(pa*g1/100000);
        pb+=(int)(pb*g2/100000);
        yr++;
        if (yr>100)
          pa=pb+1;
      }
      
      if (yr>100)
        System.out.println ("Mais de 1 seculo.");
      else
        System.out.println (yr+" anos.");
      yr=0;
    }
  }
}