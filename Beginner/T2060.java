import java.util.Scanner;

public class T2060
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcases=reader.nextInt();
    
    int[] Valhalla=new int[4];
    
    for (int run=1;run<=testcases;run++)
    {
      int num=reader.nextInt();
      
      if (num%2==0)
        Valhalla[0]++;
      
      if (num%3==0)
        Valhalla[1]++;
      
      if (num%4==0)
        Valhalla[2]++;
      
      if (num%5==0)
        Valhalla[3]++;
    }
    
    String Viking="";
    
    Viking+=Valhalla[0]+" Multiplo(s) de 2\n";
    Viking+=Valhalla[1]+" Multiplo(s) de 3\n";
    Viking+=Valhalla[2]+" Multiplo(s) de 4\n";
    Viking+=Valhalla[3]+" Multiplo(s) de 5\n";
    
    System.out.print (Viking);
  }
}