import java.util.Scanner;

public class T2523
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      String letterAll=reader.next();
      char []letter=letterAll.toCharArray();
      
      int testcases=reader.nextInt();
      
      String message="";
      
      for (int cases=1;cases<=testcases;cases++)
        message+=""+letter[reader.nextInt() -1];
      
      System.out.println (message);
    }
  }
}