import java.util.Scanner;

public class T1134
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int c=1,x=0,al=0,gas=0,die=0,p=0;
    
    while (c!=4)
    {
      if (p==0)
      {
        x=reader.nextInt();
      }
      switch (x)
      {
        case 1: al++; p=0; break;
        case 2: gas++; p=0; break;
        case 3: die++; p=0; break;
        case 4: c=4; p=0; break;
        default: x=reader.nextInt();
                 p=1;
      }
    }
    System.out.println("MUITO OBRIGADO"+"\n"+
                       "Alcool: "+al+"\n"+
                       "Gasolina: "+gas+"\n"+
                       "Diesel: "+die);
  }
}