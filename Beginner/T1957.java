import java.util.Scanner;

public class T1957
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int decimal=reader.nextInt();
    
    String []cha={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    
    String Hex="";
    
    boolean run=true;
    
    while (run)
    {
      Hex+=cha[decimal%16];
      decimal/=16;
      
      if (decimal==0)
        break;
    }
    
    Hex=new StringBuilder(Hex).reverse().toString();
    System.out.println (Hex);
  }
}