import java.util.Scanner;

public class T1151
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    int n=reader.nextInt();
    int a=0,b=1,c=1;
    String r="";
    
    switch (n)
    {
      case 1: System.out.println(0); break;
      case 2: System.out.println(0+" "+1); break;
      default:{ r+=0+" ";
        for (int i=2;i<=n;i++)
        {
          if (i==n)
            r+=c;
          else
            r+=c+" ";
          c=a+b;
          a=b;
          b=c;
        }
        System.out.println(r);
      }
    }
  }
}