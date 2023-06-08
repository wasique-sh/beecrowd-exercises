import java.util.Scanner;

public class T1961
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int height=reader.nextInt();
    int pipes=reader.nextInt();
    int []Echo=new int[pipes];
    
    boolean forun=true;
    
    Echo[0]=reader.nextInt();
    for (int run=1;run<pipes;run++)
    {
      Echo[run]=reader.nextInt();

      if (Math.abs(Echo[run]-Echo[run-1])>height)
        forun=false;

    }
    if (forun)
      System.out.println ("YOU WIN");
    else
      System.out.println ("GAME OVER");
  }
}