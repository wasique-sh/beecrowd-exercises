import java.util.Scanner;

public class T1041
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    String l=reader.nextLine();
    String[] s=l.split(" ");
    
    double x=Double.parseDouble(s[0]);
    double y=Double.parseDouble(s[1]);
    
    if ((x==0.0)&&(y==0.0))
      System.out.println ("Origem");
    else if ((y==0.0))
      System.out.println ("Eixo X");
    else if ((x==0.0))
      System.out.println ("Eixo Y");
    else if ((x>0.0)&&(y>0.0))
      System.out.println ("Q1");
    else if ((x<0.0)&&(y>0.0))
      System.out.println ("Q2");
    else if ((x<0.0)&&(y<0.0))
      System.out.println ("Q3");
    else
      System.out.println ("Q4");    
  }
}