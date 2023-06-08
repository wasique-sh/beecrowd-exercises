import java.util.Scanner;

public class T2003
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      String time=reader.nextLine();
      
      String []sepr=time.split (":");
      
      int hour=Integer.parseInt(sepr[0]);
      int min=Integer.parseInt(sepr[1]);
      
      
      int totalmin=hour*60+min+60;
      
      if (totalmin>480)
        System.out.println ("Atraso maximo: "+(totalmin-480));
      else
        System.out.println ("Atraso maximo: 0");
    }
  }
}