import java.util.Scanner;

public class T1046
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    String l=reader.nextLine();
    String[] s=l.split(" ");
    
    int n1=Integer.parseInt(s[0]);
    int n2=Integer.parseInt(s[1]);
    
    int t;
    
    if(n1<n2)
    {
      t=n2-n1;
    }
    else
    {
      t=24-n1+n2;
    }
    System.out.println("O JOGO DUROU "+t+" HORA(S)");
  }
}