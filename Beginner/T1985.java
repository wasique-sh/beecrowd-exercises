import java.util.Scanner;

public class T1985
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int products=reader.nextInt();
    double cost=0;
    
    for (int run=1;run<=products;run++)
    {
      int Id=reader.nextInt();
      int num=reader.nextInt();
      
      switch (Id)
      {
        case 1001: cost+=num*15;
        break;
        case 1002: cost+=num*25;
        break;
        case 1003: cost+=num*35;
        break;
        case 1004: cost+=num*45;
        break;
        default: cost+=num*55;
      }
    }
    System.out.println(String.format("%.2f",(cost/10.0)));
  }
}