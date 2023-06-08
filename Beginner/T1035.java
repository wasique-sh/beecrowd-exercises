import java.util.Scanner;

public class T1035
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.nextLine();
    String[]s=l.split(" ");
    
    int a=Integer.parseInt(s[0]);
    int b=Integer.parseInt(s[1].trim());
    int c=Integer.parseInt(s[2].trim());
    int d=Integer.parseInt(s[3]);
    
    boolean n1=((b>c)&&(d>a)&&((c+d)>(a+b))&&(c>0)&&(d>0)&&(a%2==0));
    
    if (n1==true)
      System.out.println ("Valores aceitos");
    else
      System.out.println ("Valores nao aceitos");
  }
}