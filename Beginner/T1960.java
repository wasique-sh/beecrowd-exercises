import java.util.Scanner;

public class T1960
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num=reader.nextInt();
    int num1=num;
    String roman="";
    
    if (num>99)
    {
      num1/=100;
      String []Cdm={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};
      roman+=Cdm[num1];
      
      num1=num%100/10;
      String []Xlc={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
      roman+=Xlc[num1];
      
      num1=num%100%10;
      String []Ivx={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
      roman+=Ivx[num1];
    }
    else if (num>9)
    {
      num1=num/10;
      String []Xlc={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
      roman+=Xlc[num1];
      
      num1=num%10;
      String []Ivx={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
      roman+=Ivx[num1];
    }
    else
    {
      num1=num;
      String []Ivx={"","I","II","III","IV","V","VI","VII","VIII","IX"};
      roman+=Ivx[num1];
    }
    System.out.println (roman);

  }
}