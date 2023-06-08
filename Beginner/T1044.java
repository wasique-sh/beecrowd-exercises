import java.util.Scanner;

public class T1044
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    String l=reader.nextLine();
    String[] s=l.split(" ");
    
    int a=Integer.parseInt(s[0]);
    int b=Integer.parseInt(s[1]);
    
    if (a>b)
    {if (a%b==0)
      System.out.println("Sao Multiplos");
    else
      System.out.println("Nao sao Multiplos");
    }
    else
    {if (b%a==0)
      System.out.println("Sao Multiplos");
    else
      System.out.println("Nao sao Multiplos");
    }
  }
}