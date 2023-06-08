import java.util.Scanner;

public class T2542
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int attribute=reader.nextInt();
      
      int cardsM=reader.nextInt();
      int cardsL=reader.nextInt();
      
      int [][]deckM=new int [cardsM][attribute];
      int [][]deckL=new int [cardsL][attribute];
      
      for (int card=0;card<cardsM;card++)
      {
        for (int att=0;att<attribute;att++)
          deckM[card][att]=reader.nextInt();
      }
      
      for (int card=0;card<cardsL;card++)
      {
        for (int att=0;att<attribute;att++)
          deckL[card][att]=reader.nextInt();
      }
      
      int pickM=reader.nextInt();
      int pickL=reader.nextInt();
      
      int chosenAtt=reader.nextInt();
      
      if (deckM[pickM-1][chosenAtt-1]>deckL[pickL-1][chosenAtt-1])
        System.out.println ("Marcos");
      else if (deckM[pickM-1][chosenAtt-1]<deckL[pickL-1][chosenAtt-1])
        System.out.println ("Leonardo");
      else
        System.out.println ("Empate");
    }
  }
}