import java.util.Scanner;

public class T1047
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    int hour1=reader.nextInt();
    int min1=reader.nextInt();
    int hour2=reader.nextInt();
    int min2=reader.nextInt();
    
    int Hour;
    int Min;
    
    if(hour1<hour2)
      Hour=hour2-hour1;
    
    else if (hour1==hour2)
      Hour=24;
    else
      Hour=24-hour1+hour2;
    
    if(min1>min2)
    {
      Min=60-min1+min2;
      Hour--;
    }
    else if (min1==min2)
      Min=0;
    else
    {
      Min=min2-min1;
      
      if (hour1==hour2)
        Hour=0;
    }
    
    System.out.println("O JOGO DUROU "+Hour+" HORA(S) E "+Min+" MINUTO(S)");
  }
}