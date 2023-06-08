import java.util.Scanner;

public class T2310
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int players=reader.nextInt();
    
    int totalServ=0,serv=0;
    int totalBloc=0,bloc=0;
    int totalAtta=0,atta=0;
    
    String playor="0";
    
    for (int player=1;player<=players;player++)
    {
      playor += reader.next();
      
      totalServ+=reader.nextInt();
      totalBloc+=reader.nextInt();
      totalAtta+=reader.nextInt();
      
      serv+=reader.nextInt();
      bloc+=reader.nextInt();
      atta+=reader.nextInt();
    }
    
    String Volley="Pontos de Saque: "+String.format("%.2f",(serv*100.0)/totalServ)+" %.\n"+
      "Pontos de Bloqueio: "+String.format("%.2f",(bloc*100.0)/totalBloc)+" %.\n"+
      "Pontos de Ataque: "+String.format("%.2f",(atta*100.0)/totalAtta)+" %.\n";
    
    System.out.print(Volley);
  }
}