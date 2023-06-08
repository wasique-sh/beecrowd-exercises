import java.util.Scanner;

public class T1042
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);
    
    String l=reader.nextLine();
    String[] s=l.split(" ");
    
    int a=Integer.parseInt(s[0]);
    int b=Integer.parseInt(s[1].trim());
    int c=Integer.parseInt(s[2]);
    
    int mx;
    int md;
    int mn;
    
    if ((a>b)&&(a>c)&&(b>c))
    {
      mx=a;
      md=b;
      mn=c;
    }
    else if ((a>b)&&(a>c)&&(b<c))
    {
      mx=a;
      md=c;
      mn=b;
    }
    else if ((b>a)&&(b>c)&&(a>c))
    {
      mx=b;
      md=a;
      mn=c;
    }
    else if ((b>a)&&(b>c)&&(a<c))
    {
      mx=b;
      md=c;
      mn=a;
    }
    else if ((c>a)&&(c>a)&&(a>b))
    {
      mx=c;
      md=a;
      mn=b;
    }
     else
    {
      mx=c;
      md=b;
      mn=a;
    }
    System.out.println(mn);
    System.out.println(md);
    System.out.println(mx);
    System.out.println();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}