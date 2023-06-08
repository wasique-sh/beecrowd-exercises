import java.util.Scanner;

public class T1179
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n,o=0,e=0;
    
    int[] Odd=new int[5];
    int[] Even=new int[5];
    
    String r1="";
    String r2="";
    
    for (int i=1;i<=15;i++)
    {
      n=reader.nextInt();
      
      if (n%2!=0)
      {
        Odd[o]=n;
        r1+="impar["+o+"] = "+Odd[o]+"\n";
        o++;
        if (o==5)
        {
          System.out.print(r1);
          r1="";
          o=0;
        }
      }
      else
      {
        Even[e]=n;
        r2+="par["+e+"] = "+Even[e]+"\n";
        e++;
        if (e==5)
        {
          System.out.print(r2);
          r2="";
          e=0;
        }
      }
    }
    System.out.print(r1+r2);
  }
}