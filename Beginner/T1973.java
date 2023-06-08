import java.util.Scanner;

public class T1973
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int Stars=reader.nextInt();
    
    int []Farms=new int[Stars];
    
    long stolen=0;
    long sum=0;
    
    for (int run=0;run<Farms.length;run++)
    {
      Farms[run]=reader.nextInt();
      sum+=Farms[run];
    }
    for (int run=0;run<Farms.length;run++)
    {
      Farms[run]--;
      stolen++;
      sum--;
      
      if (Farms[run]%2!=0)
      {
        for (int run2=run-1;run2>=0;run2--)
        {
          if (Farms[run2]!=0)
            sum-=1;
        }
        break;
      }
    }
    System.out.println (stolen+" "+sum);
  }
}