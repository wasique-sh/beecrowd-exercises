import java.util.Scanner;

public class T1131
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int gren=0,inter=0,grem=0,empat=0;
    int x,y,c=1;
    String r="";
    
    while (c==1)
    {
      x=reader.nextInt();
      y=reader.nextInt();
      gren++;
        
        if (x>y)
        inter++;
      else if (x<y)
        grem++;
      else
        empat++;
      
      System.out.println("Novo grenal (1-sim 2-nao)");
      c=reader.nextInt();
    }
    if (inter>grem)
      r=gren+" grenais"+"\n"+"Inter:"+inter+"\n"+"Gremio:"+grem+"\n"+"Empates:"+empat+"\n"+"Inter venceu mais";
    else if (inter<grem)
      r=gren+" grenais"+"\n"+"Inter:"+inter+"\n"+"Gremio:"+grem+"\n"+"Empates:"+empat+"\n"+"Gremio venceu mais";
    else
      r=gren+" grenais"+"\n"+"Inter:"+inter+"\n"+"Gremio:"+grem+"\n"+"Empates:"+empat+"\n"+"Nao houve vencedor";
    System.out.println(r);
  }
}