import java.util.Scanner;

public class T1114
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    int n,p=0;
    
    while (p==0)
    {
      n=reader.nextInt();
      
      if (n==2002)
      {
        System.out.println ("Acesso Permitido");
        p++;
      }
      else
      System.out.println ("Senha Invalida");
    }
  }
}