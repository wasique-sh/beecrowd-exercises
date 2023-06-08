import java.util.Scanner;

public class T2221
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcase=reader.nextInt();
    
    for (int run=1;run<=testcase;run++)
    {
      int bonus=reader.nextInt();
      
      int A1=reader.nextInt();
      int D1=reader.nextInt();
      int L1=reader.nextInt();
      double value1=0;
      
      int A2=reader.nextInt();
      int D2=reader.nextInt();
      int L2=reader.nextInt();
      double value2=0;
      
      if (L1%2==0)
        value1=(A1+D1)/2.0 +bonus;
      else
        value1=(A1+D1)/2.0;
      
      if (L2%2==0)
        value2=(A2+D2)/2.0 +bonus;
      else
        value2=(A2+D2)/2.0;
      
      if (value1>value2)
        System.out.println ("Dabriel");
      else if (value1<value2)
        System.out.println ("Guarte");
      else
        System.out.println ("Empate");
    }
  }
}