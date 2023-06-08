import java.util.Scanner;

public class T1828
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String Shelly, Raj;
    int win=1;
    int cases=reader.nextInt();
    
    for (int run=1; run<=cases; run++)
    {
      Shelly=reader.next();
      Raj=reader.next();
      
      if (Shelly.equals(Raj))
        win=2;
      else
      {
        if (Shelly.equals ("pedra"))
        {
          if (Raj.equals ("papel"))
            win=0;
          else if (Raj.equals ("tesoura"))
            win=1;
          else if (Raj.equals ("lagarto"))
            win=1;
          else
            win=0;
        }
        else if (Shelly.equals ("papel"))
        {
          if (Raj.equals ("pedra"))
            win=1;
          else if (Raj.equals ("tesoura"))
            win=0;
          else if (Raj.equals ("lagarto"))
            win=0; 
          else
            win=1;
        }
        else if (Shelly.equals ("tesoura"))
        {
          if (Raj.equals ("pedra"))
            win=0;
          else if (Raj.equals ("papel"))
            win=1;
          else if (Raj.equals ("lagarto"))
            win=1;
          else
            win=0;
        }
        else if (Shelly.equals ("lagarto"))
        {
          if (Raj.equals ("pedra"))
            win=0;
          else if (Raj.equals ("papel"))
            win=1;
          else if (Raj.equals ("tesoura"))
            win=0;
          else
            win=1;
        }
        else
        {
          if (Raj.equals ("pedra"))
            win=1;
          else if (Raj.equals ("papel"))
            win=0;
          else if (Raj.equals ("tesoura"))
            win=1;
          else
            win=0;
        }
      }
      
      switch (win)
      {
        case 0: System.out.println ("Caso #"+run+": Raj trapaceou!");
        break;
        case 1: System.out.println ("Caso #"+run+": Bazinga!");
        break;
        default : System.out.println ("Caso #"+run+": De novo!");
      }
    }
  }
}