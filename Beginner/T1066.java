import java.util.Scanner;

public class T1066
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num,e=0,o=0,p=0,n=0;
    
    for (int c=0;c<5;c++)
    {
      num=reader.nextInt();
      
      if (num%2==0)
        e++;
      else
        o++;
      
      if (num>0)
        p++;
      if(num<0)
        n++;
    }
    
    System.out.println(e+" valor(es) par(es)");
    System.out.println(o+" valor(es) impar(es)");
    System.out.println(p+" valor(es) positivo(s)");
    System.out.println(n+" valor(es) negativo(s)");
  }
}