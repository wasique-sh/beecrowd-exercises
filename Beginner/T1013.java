import java.util.Scanner;

public class T1013
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.nextLine();
    String[] s=l.split(" ");
    
    int a=Integer.parseInt(s[0]);
    int b=Integer.parseInt(s[1].trim());
    int c=Integer.parseInt(s[2]);
    
    int maj=(a+b+Math.abs(a-b))/2;
        maj=(maj+c+Math.abs(maj-c))/2;
    
        System.out.println(maj+" eh o maior");
  }
}