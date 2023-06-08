import java.util.Scanner;

public class T1049
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String n1=reader.nextLine();
    String n2=reader.nextLine();
    String n3=reader.nextLine();
    
    if (n1.equals("vertebrado"))
    {
      if (n2.equals("ave"))
      {
        if (n3.equals("carnivoro"))
          System.out.println ("aguia");
        else
          System.out.println ("pomba");
      }
      else
      {
        if (n3.equals("onivoro"))
          System.out.println ("homem");
        else
          System.out.println ("vaca");
      }
    }
    else
    {
     if (n2.equals("inseto"))
      {
        if (n3.equals("hematofago"))
          System.out.println ("pulga");
        else
          System.out.println ("lagarta");
      }
      else
      {
        if (n3.equals("hematofago"))
          System.out.println ("sanguessuga");
        else
          System.out.println ("minhoca");
      } 
    }
  }
}