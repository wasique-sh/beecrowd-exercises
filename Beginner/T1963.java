import java.util.Scanner;

public class T1963
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    double Ticket1=reader.nextDouble();
    double Ticket2=reader.nextDouble();
    
    Ticket1*=100;
    Ticket2*=100;
    
    if (Ticket1<Ticket2)
    {
      double difference=Ticket2-Ticket1;
      difference*=100;
      
      System.out.println(String.format("%.2f",(difference/Ticket1))+"%");
    }
    else
      System.out.println("0.00%");
  }
}