import java.util.Scanner;

public class T2059
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int p1choice=reader.nextInt();
    
    int p1=reader.nextInt();
    int p2=reader.nextInt();
    
    int p1cheat=reader.nextInt();
    int p2accuse=reader.nextInt();
    
    int sum=p1+p2;
    boolean win=(((sum%2==0)&&(p1choice==1))||((sum%2!=0)&&(p1choice==0)));
    
    
    if ((p1cheat==0)&&(p2accuse==0))
    {
      if (win)
        System.out.println("Jogador 1 ganha!");
      else
        System.out.println("Jogador 2 ganha!");
    }
    else if ((p1cheat==1)&&(p2accuse==0))
      System.out.println("Jogador 1 ganha!");
    else if ((p1cheat==1)&&(p2accuse==1))
      System.out.println("Jogador 2 ganha!");
    else
      System.out.println("Jogador 1 ganha!");
    
  }
}