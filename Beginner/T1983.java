import java.util.Scanner;

public class T1983
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int Students=reader.nextInt();
    
    int win=0;
    double winnote=8.0;
    boolean reached=false;
    
    for (int run=1;run<=Students;run++)
    {
      int ID=reader.nextInt();
      Double note=reader.nextDouble();
      
      if (note>=winnote)
      {
        winnote=note;
        win=ID;
        reached=true;
      }
    }
    
     if (reached)
       System.out.println(win);
     else
       System.out.println("Minimum note not reached");
  }
}