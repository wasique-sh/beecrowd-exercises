import java.util.Scanner;

public class T1789
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int slug, speed, spec;
    
    while (reader.hasNext())
    {
      slug=reader.nextInt();
      spec=1;
      
      int [] Frost=new int [slug];
      
      for (int col=0; col<Frost.length; col++)
      {
        speed=reader.nextInt();
        
        if (speed>=20)
          spec=3;
        
        else if (speed>=10)
        {
          if (spec<3)
            spec=2;
        }
      }
      System.out.println (spec);
    }
  }
}