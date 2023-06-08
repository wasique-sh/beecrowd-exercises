import java.util.Scanner;
import java.text.DecimalFormat;

public class T1045
{
  public static DecimalFormat df=new DecimalFormat("0.0");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner(System.in);

    String l=reader.nextLine();
    String[] s=l.split(" ");
    
    double a=Double.parseDouble(s[0]);
    double b=Double.parseDouble(s[1].trim());
    double c=Double.parseDouble(s[2]);
        
    double mx=0;
    double md=0;
    double mn=0;
    
    if ((a>=b)&&(a>=c)&&(b>=c))
    {
      mx=a;
      md=b;
      mn=c;
    }
    else if ((a>=b)&&(a>=c)&&(b<=c))
    {
      mx=a;
      md=c;
      mn=b;
    }
    else if ((b>=a)&&(b>=c)&&(a>=c))
    {
      mx=b;
      md=a;
      mn=c;
    }
    else if ((b>=a)&&(b>=c)&&(a<=c))
    {
      mx=b;
      md=c;
      mn=a;
    }
    else if ((c>=a)&&(c>=b)&&(a>=b))
    {
      mx=c;
      md=a;
      mn=b;
    }
    else
    {
      mx=c;
      md=a;
      mn=b;
    }
     
     if(((md+mn)<=mx))
       System.out.println("NAO FORMA TRIANGULO");
     else
     {
       if(((md*md+mn*mn)==(mx*mx)))
         System.out.println("TRIANGULO RETANGULO");
       else if(((md*md+mn*mn)<(mx*mx)))
         System.out.println("TRIANGULO OBTUSANGULO");
       else
         System.out.println("TRIANGULO ACUTANGULO");
       
       if((a==b)&&(a==c))
         System.out.println("TRIANGULO EQUILATERO");
       
       if(((a==b)&&(a!=c))||((a==c)&&(a!=b))||((b==c)&&(a!=c)))
         System.out.println("TRIANGULO ISOSCELES");
     }
  }
}