import java.util.Scanner;

public class T2006
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int Tea=reader.nextInt();
    int correct=0;
    
    for (int run=1;run<=5;run++)
    {
      int contestant=reader.nextInt();
      
      if (Tea==contestant)
        correct++;
    }
    
    System.out.println (correct);
  }
}