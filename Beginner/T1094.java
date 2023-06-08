import java.util.Scanner;
import java.text.DecimalFormat;

public class T1094
{
  public static DecimalFormat df=new DecimalFormat("0.00");
  
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int m=reader.nextInt();
    int n,coel=0,rato=0,sapo=0;
    String r="",s;
    
    for (int c=1;c<=m;c++)
    {
      n=reader.nextInt();
      s=reader.next();
      
      if (s.equals("C"))
        coel+=n;
      else if (s.equals("R"))
        rato+=n;
      else
        sapo+=n;
    }
    
    r+="Total: "+(coel+rato+sapo)+" cobaias"+"\n";
    r+="Total de coelhos: "+coel+"\n";
    r+="Total de ratos: "+rato+"\n";
    r+="Total de sapos: "+sapo+"\n";
    r+="Percentual de coelhos: "+df.format(((coel)*100.0)/(coel+rato+sapo))+" %"+"\n";
    r+="Percentual de ratos: "+df.format(((rato)*100.0)/(coel+rato+sapo))+" %"+"\n";
    r+="Percentual de sapos: "+df.format(((sapo)*100.0)/(coel+rato+sapo))+" %"+"\n";
    
    System.out.print (r);
  }
}