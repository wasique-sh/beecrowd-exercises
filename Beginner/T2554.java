import java.util.Scanner;

public class T2554
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int peoples=reader.nextInt();
      int dates=reader.nextInt();
      
      boolean found=false;
      String output="";
      
      for (int date=1;date<=dates;date++)
      {
        String newDate=reader.next();
        
        int rem=peoples;
        
        for (int people=1;people<=peoples;people++)
          rem-=reader.nextInt();
        
        if (!found && rem==0)
        {
          output+=""+newDate;
          found=true;
        }
      }
      
      if (found)
        System.out.println (output);
      else
        System.out.println ("Pizza antes de FdI");
    }
  }
}