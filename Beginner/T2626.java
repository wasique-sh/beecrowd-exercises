import java.util.Scanner;

public class T2626
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int dodo=classify(reader.next());
      int leo=classify(reader.next());
      int pepper=classify(reader.next());
      
      if ((dodo==leo && leo==pepper)||(dodo!=leo && leo!=pepper&& dodo!=pepper))
        System.out.println ("Putz vei, o Leo ta demorando muito pra jogar...");
      else
      {
        int wonNum=0;
        int whoWon=0;
        
        if (dodo!=leo && leo==pepper)
        {
          if (won (dodo,leo))
          {
            wonNum++;
            whoWon=1;
          }
        }
        
        if (leo!=dodo && dodo==pepper)
        {
          if (won (leo,dodo))
          {
            wonNum++;
            whoWon=2;
          }
        }
        
        if (pepper!=dodo && dodo==leo)
        {
          if (won (pepper,dodo))
          {
            wonNum++;
            whoWon=3;
          }
        }
        
        if (wonNum==1 && whoWon==1)
          System.out.println ("Os atributos dos monstros vao ser inteligencia, sabedoria...");
        else if (wonNum==1 && whoWon==2)
          System.out.println ("Iron Maiden's gonna get you, no matter how far!");
        else if (wonNum==1 && whoWon==3)
          System.out.println ("Urano perdeu algo muito precioso...");
        else
          System.out.println ("Putz vei, o Leo ta demorando muito pra jogar...");
      }
    }
  }
  
  public static int classify(String rps)
  {
    if (rps.equals("pedra"))      //pedra   - Rock     = 1
      return 1;
    else if (rps.equals("papel")) //papel   - Paper    = 2
      return 2;
    else                          //tesoura - Scissors = 3
      return 3;
  }
  
  public static boolean won (int first,int second)
  {
    if (first==1)
    {
      if (second==2)
        return false;
      else //if (second==3)
        return true;
    }
    else if (first ==2)
    {
      if (second==1)
        return true;
      else //if (second==3)
        return false;
    }
    else // if (first ==3)
    {
      if (second==1)
        return false;
      else //if (second==2)
        return true;
    }
  }
}