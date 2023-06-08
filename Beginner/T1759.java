import java.util.Scanner;

public class T1759
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int runlim=reader.nextInt();
    
    int runlim1=(runlim-1)/1000;
    int runlim2=runlim-(runlim1*1000);
    
    String cobalt="";
    
    while (runlim1>0)
    {
      for (int run=1;run<=50;run++)
      {
        cobalt+="Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho Ho ";
      }
      for (int run=1;run<=runlim1;run++)
      {
        System.out.print (cobalt);
        
        if (run==runlim1)
          runlim1=0;
      }
    }
    cobalt="";
    for (int run=1;run<runlim2;run++)
    {
      cobalt+="Ho ";
    }
    System.out.println (cobalt+"Ho!");
  }
}