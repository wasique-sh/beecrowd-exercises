import java.util.Scanner;

public class T2028
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    int test=1;
    
    while (reader.hasNext())
    {
      int cases=reader.nextInt();
      int num=1;
      
      String Alpha="0";
      
      for (int run=1;run<=cases;run++)
      {
        for (int run1=1;run1<=run;run1++)
          num++;
      }
      
      if (num==1)
      System.out.print("Caso "+test+": "+num+" numero"+"\n"+"0");
      else
      System.out.print("Caso "+test+": "+num+" numeros"+"\n"+"0");
      
      for (int run=1;run<=cases;run++)
      {
        Alpha="";
        
        for (int run1=1;run1<=run;run1++)
        {
          Alpha+=(" "+run);
        }
        
        System.out.print(Alpha);
      }
      System.out.println("\n");
      test++;
    }
  }
}