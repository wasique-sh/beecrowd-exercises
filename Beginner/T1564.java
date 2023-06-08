import java.util.Scanner;

public class T1564
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num;
    String Valkyrie="";
    
    while (reader.hasNext())
    {
      num=reader.nextInt();
      
      if (num>0)
        Valkyrie+="vai ter duas!"+"\n";
      else
        Valkyrie+="vai ter copa!"+"\n";
    }
    System.out.print(Valkyrie);
  }
}