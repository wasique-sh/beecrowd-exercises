import java.util.Scanner;

public class T1061
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    String dummy="";
    
    dummy=reader.next();
    int day1=reader.nextInt();
    int hour1=reader.nextInt();
    dummy=reader.next();
    int min1=reader.nextInt();
    dummy=reader.next();
    int sec1=reader.nextInt();
    
    dummy=reader.next();
    int day2=reader.nextInt();
    int hour2=reader.nextInt();
    dummy=reader.next();
    int min2=reader.nextInt();
    dummy=reader.next();
    int sec2=reader.nextInt();
    
    int sec=0;
    int min=0;
    int hour=0;
    int day=0;
    
    if (day1==day2)
    {
      day=0;
    }
    else
    {
      day=day2-day1;
    }
    
    if (hour1==hour2)
    {
      hour=0;
    }
    else if (hour1>hour2)
    {
      hour=24-hour1+hour2;
      day--;
    }
    else
    {
      hour=hour2-hour1;
    }
    
    if (min1==min2)
    {
      min=0;
    }
    else if (min1>min2)
    {
      min=60-min1+min2;
      hour--;
    }
    else
    {
      min=min2-min1;
    }
    
    if (sec1==sec2)
    {
      sec=0;
    }
    else if (sec1>sec2)
    {
      sec=60-sec1+sec2;
      min--;  
    }
    else
    {
      sec=sec2-sec1;
    }
    
    if (min<0)
    {
      min=60+min;
      hour--;
    }
    
    System.out.println(day+" dia(s)");
    System.out.println(hour+" hora(s)");
    System.out.println(min+" minuto(s)");
    System.out.println(sec+" segundo(s)");
  }
}