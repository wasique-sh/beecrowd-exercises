import java.util.Scanner;

public class T2313
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    long sideA=reader.nextInt();
    long sideB=reader.nextInt();
    long sideC=reader.nextInt();
    
    long max=Math.max(Math.max(sideA,sideB),sideC);
    long sum=sideA+sideB+sideC-max;
    
    if(sum>max)
    {
      if ((sideA==sideB)&&(sideB==sideC))
        System.out.println ("Valido-Equilatero");
      else if (((sideA==sideB)&&(sideA!=sideC))||
               ((sideB==sideC)&&(sideB!=sideA))||
               ((sideC==sideA)&&(sideC!=sideB)))
        System.out.println ("Valido-Isoceles");
      else if ((sideA!=sideB)&&(sideB!=sideC)&&(sideC!=sideA))
        System.out.println ("Valido-Escaleno");
      
      if ((((sideA*sideA)+(sideB*sideB))==(sideC*sideC)) ||
          (((sideB*sideB)+(sideC*sideC))==(sideA*sideA)) ||
          (((sideC*sideC)+(sideA*sideA))==(sideB*sideB)))
        System.out.println ("Retangulo: S");
      else
        System.out.println ("Retangulo: N");
      
    }
    else
      System.out.println ("Invalido");
  }
}