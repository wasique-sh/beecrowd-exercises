import java.util.Scanner;

public class T1848
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num=0, sum=0;
    String crow="";
    String numS="";
    
    while (reader.hasNext())
    {
      crow=reader.nextLine();
      
      if (crow.equals("caw caw"))
      {
        System.out.println(sum);
        sum=0;
      }
      else
      {
        for (int pos=0; pos<3;pos++)
        {
          if (crow.charAt(pos)=='-')
            numS+="0";
          else
            numS+="1";
        }
        num=Integer.parseInt(numS,2);
        sum+=num;
        numS="";
         }
    }
  }
}