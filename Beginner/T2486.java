import java.util.Scanner;

public class T2486
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int fruitTotal=reader.nextInt();
      
      if (fruitTotal==0)
        break;
      
      int vitC=0;
      
      for (int fruitTotal0=1;fruitTotal0<=fruitTotal;fruitTotal0++)
      {
        int fruitno=reader.nextInt();
        String fruitname=reader.nextLine();
        vitC+=fruit(fruitname)*fruitno;
      }
      
      if (vitC>130)
        System.out.println("Menos "+(vitC-130)+" mg");
      else if (vitC>=110)
        System.out.println(vitC+" mg");
      else
        System.out.println("Mais "+(110-vitC)+" mg");
    }
  }
  
  public static int fruit (String fruit)
  {
    fruit=fruit.substring(1);
    if (fruit.equals("suco de laranja"))
      return 120;
    else if (fruit.equals("morango fresco"))
      return 85;
    else if (fruit.equals("mamao"))
      return 85;
    else if (fruit.equals("goiaba vermelha"))
      return 70;
    else if (fruit.equals("manga"))
      return 56;
    else if (fruit.equals("laranja"))
      return 50;
    else
      return 34;
  }
}