import java.util.Scanner;

public class T1180
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int t=reader.nextInt();
    
    int[] Echo=new int[t];
    Echo[0]=reader.nextInt();
    
    int m=Echo[0];
    int p=0;
    
    for (int c=1;c<Echo.length;c++)
    {
      Echo[c]=reader.nextInt();
      
      if (Echo[c]<m)
      {
        m=Echo[c];
        p=c;
      }
    }
    
    System.out.println ("Menor valor: "+m+"\n"+"Posicao: "+p);
  }
}