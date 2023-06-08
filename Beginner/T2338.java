import java.util.Scanner;

public class T2338
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testcases=reader.nextInt();
    
    for (int cases=1;cases<=testcases;cases++)
    {
      String line=reader.next();
      String line0="";
      String letter="";
      int pos0=0,pos1=0,pos2=3;
      int pos00=0,pos01=0,pos02=5;
      
      for (pos00=0,pos01=0,pos02=5;pos02<=line.length();pos01++,pos02++)
      {
        if (line.substring(pos01,pos02).equals("....."))
        {
          line0=line.substring(pos00,pos01);
          pos00=pos02-1;
          pos01+=5;
          pos02+=5;
          
          for (pos0=0,pos1=0,pos2=3;pos2<=line0.length();pos1++,pos2++)
          {
            if (line0.substring(pos1,pos2).equals("..."))
            {
              letter=line0.substring(pos0,pos1);
              pos0=pos2;
              System.out.print(morse(letter));
            }
          }
          letter=line0.substring(pos0,line0.length());
          System.out.print(morse(letter)+" ");
        }
      }
      line0=line.substring(pos00,line.length());
      
      for (pos0=0,pos1=0,pos2=3;pos2<=line0.length();pos1++,pos2++)
      {
        if (line0.substring(pos1,pos2).equals("..."))
        {
          letter=line0.substring(pos0,pos1);
          pos0=pos2;
          System.out.print(morse(letter));
        }
      }
      letter=line0.substring(pos0,line0.length());
      System.out.print(morse(letter));
      System.out.println();
    }
  }
  
  public static String morse (String chart)
  {
    if (chart.equals("=.==="))
      return "a";
    else if (chart.equals("===.=.=.="))
      return "b";
    else if (chart.equals("===.=.===.="))
      return "c";
    else if (chart.equals("===.=.="))
      return "d";
    else if (chart.equals("="))
      return "e";
    else if (chart.equals("=.=.===.="))
      return "f";
    else if (chart.equals("===.===.="))
      return "g";
    else if (chart.equals("=.=.=.="))
      return "h";
    else if (chart.equals("=.="))
      return "i";
    else if (chart.equals("=.===.===.==="))
      return "j";
    else if (chart.equals("===.=.==="))
      return "k";
    else if (chart.equals("=.===.=.="))
      return "l";
    else if (chart.equals("===.==="))
      return "m";
    else if (chart.equals("===.="))
      return "n";
    else if (chart.equals("===.===.==="))
      return "o";
    else if (chart.equals("=.===.===.="))
      return "p";
    else if (chart.equals("===.===.=.==="))
      return "q";
    else if (chart.equals("=.===.="))
      return "r";
    else if (chart.equals("=.=.="))
      return "s";
    else if (chart.equals("==="))
      return "t";
    else if (chart.equals("=.=.==="))
      return "u";
    else if (chart.equals("=.=.=.==="))
      return "v";
    else if (chart.equals("=.===.==="))
      return "w";
    else if (chart.equals("===.=.=.==="))
      return "x";
    else if (chart.equals("===.=.===.==="))
      return "y";
    else if (chart.equals("===.===.=.="))
      return "z";
    else
      return "";
  }
}