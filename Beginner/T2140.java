import java.util.Scanner;

public class T2140
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int bill=reader.nextInt();
      int given=reader.nextInt();
      
      if ((bill==0)&&(given==0))
        break;
      
      int change=given-bill;

      int remaining=change%100%50%20%10%5%2;
      
      int noteA=change/100;
      int noteB=change%100/50;
      int noteC=change%100%50/20;
      int noteD=change%100%50%20/10;
      int noteE=change%100%50%20%10/5;
      int noteF=change%100%50%20%10%5/2;
      
      int notes=noteA+noteB+noteC+noteD+noteE+noteF;
      
      if ((notes==2)&&(remaining==0))
        System.out.println ("possible");
      else
        System.out.println ("impossible");
    }
  }
}