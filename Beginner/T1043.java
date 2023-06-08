import java.util.Scanner;
import java.text.DecimalFormat;

public class T1043
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
    else if ((c>=a)&&(c>=a)&&(a>=b))
    {
      mx=c;
      md=a;
      mn=b;
    }
     
     if(((md+mn)>mx)||(mx==0))
     {
       double peri=a+b+c;
       System.out.println("Perimetro = "+df.format(peri));
     }
     else
     {
       double area=((a+b)/2.0)*c;
       System.out.println("Area = "+df.format(area));
     }
  }
}