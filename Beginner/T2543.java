import java.util.Scanner;

public class T2543
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int videos=reader.nextInt();
      
      int MyID=reader.nextInt();
      int MyVid=0;
      
      for (int vid=1;vid<=videos;vid++)
      {
        int ID=reader.nextInt();
        int game=reader.nextInt();
        
        if (MyID==ID && game==0)
          MyVid+=1;
      }
      
      System.out.println (MyVid);
    }
  }
}