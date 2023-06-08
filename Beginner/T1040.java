import java.util.Scanner;
import java.text.DecimalFormat;

public class T1040
{
  private static DecimalFormat df=new DecimalFormat("0.0");
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.nextLine();
    String[] s=l.split(" ");
    double a=Double.parseDouble(s[0]);
    double b=Double.parseDouble(s[1].trim());
    double c=Double.parseDouble(s[2].trim());
    double d=Double.parseDouble(s[3]);
    double m=(a*2+b*3+c*4+d*1)/(2+3+4+1);
    
    System.out.println("Media: "+df.format(m));
    
    if (m>=7.0)
      System.out.println("Aluno aprovado.");
    
    if (m<5.0)
      System.out.println("Aluno reprovado.");
    
    if ((m<=6.9) && (m>=5.0))
    {
      System.out.println("Aluno em exame.");
      
      double e=reader.nextDouble();
      double m1=(m+e)/2.0;
      
      System.out.println("Nota do exame: "+df.format(e));
      
      if (m1>=5.0)
        System.out.println("Aluno aprovado.");
      if (m1<=4.9)
        System.out.println("Aluno reprovado."); 
      
      System.out.println("Media final: "+df.format(m1));
    }
  }
}