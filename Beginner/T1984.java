import java.util.Scanner;

public class T1984
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    String Alpha=reader.next();
    
    String Beta=new StringBuilder(Alpha).reverse().toString();
    
    System.out.println (Beta);
  }
}