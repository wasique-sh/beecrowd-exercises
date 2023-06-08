import java.util.Scanner;

public class T2483
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int index=reader.nextInt();
    String happiness="Feliz nat";
    
    for (int index0=1;index0<=index;index0++)
     happiness+="a";
    
    System.out.println (happiness+"l!");
  }
}