import java.util.Scanner;

public class T2031
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner(System.in);
    
    int testcases=reader.nextInt();
    
    for (int run=1;run<=testcases;run++)
    {
      String Player1=reader.next();
      String Player2=reader.next();
      
      int res=0;
      
      if (Player1.equals("ataque"))
      {
        if (Player2.equals("ataque"))
          res=5;
        else
          res=1;
      }
      else if (Player1.equals("pedra"))
      {
        if (Player2.equals("ataque"))
          res=2;
        else if (Player2.equals("pedra"))
          res=4;
        else
          res=1;
      }
      else
      {
        if (Player2.equals("ataque"))
          res=2;
        else if (Player2.equals("pedra"))
          res=2;
        else
          res=3;
      }
      
      switch (res)
      {
        case 1: System.out.println("Jogador 1 venceu");
        break;
        case 2: System.out.println("Jogador 2 venceu");
        break;
        case 3: System.out.println("Ambos venceram");
        break;
        case 4: System.out.println("Sem ganhador");
        break;
        case 5: System.out.println("Aniquilacao mutua");
        break;
      }
    }
  }
}