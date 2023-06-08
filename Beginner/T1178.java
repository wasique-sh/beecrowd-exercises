import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;

public class T1178
{
  public static DecimalFormat df=new DecimalFormat("0.0000");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String l=reader.next();
    BigDecimal x=new BigDecimal(l);
    
    BigDecimal[] Echo=new BigDecimal[100];
    
    Echo[0]=x;
    BigDecimal w=new BigDecimal ("2");
    
    String r="N[0] = "+df.format(Echo[0])+"\n";
    
    for (int i=1;i<Echo.length;i++)
    {
      Echo[i]=Echo[i-1].divide(w);
      r+="N["+i+"] = "+df.format(Echo[i])+"\n";
    }
    System.out.print(r);
  }
}