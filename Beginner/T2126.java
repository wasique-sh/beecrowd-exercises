import java.util.Scanner;

public class T2126
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    int cases=0;
    
    while (reader.hasNext())
    {
      String Alpha=reader.next();
      String Echo=reader.next();      
      
      int ALength=Alpha.length();
      
      int pos=0;
      int start=0;
      int end=ALength;
      int quan=0;
      boolean watson=true;
      
      while (watson)
      {
        String Tester=Echo.substring(start,end);
        
        if (Tester.equals(Alpha))
        {
          quan++;
          pos=start+1;
        }
        
        start+=1;
        end+=1;
        
        if (end>Echo.length())
          break;
      }
      
      cases++;
      
      if (quan==0)
        System.out.println ("Caso #"+cases+":\n"+
                            "Nao existe subsequencia\n");
      else
        System.out.println ("Caso #"+cases+":\n"
                              +"Qtd.Subsequencias: "+quan+"\n"
                              +"Pos: "+pos+"\n");
    }
  }
}