import java.util.Scanner;
import java.util.Arrays;

public class T2493
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int testcases=reader.nextInt();
      
      int [][]oper=new int [testcases][3];
      for (int cases=0;cases<testcases;cases++)
      {
        oper[cases][0]=reader.nextInt();
        
        String []part0=(reader.next()).split("=");
        oper[cases][1]=Integer.parseInt(part0[0].trim());
        oper[cases][2]=Integer.parseInt(part0[1].trim());
      }
      
      String []players=new String [testcases];
      for (int cases=0;cases<testcases;cases++)
      {
        players[cases]=reader.next();
        int num=reader.nextInt() -1;
        String logos=reader.next();
        
        checkOp(logos,oper,players,cases,num);
      }
      
      Arrays.sort(players);
      
      int trigger=0;
      
      for (int run=0;run<players.length;run++)
      {
        if (players[run].equals("0"))
          trigger++;
      }
      boolean output=true;
      if (trigger==players.length)
        System.out.println("You Shall All Pass!");
      else if (trigger==0)
        System.out.println("None Shall Pass!");
      else
      {
        for (int run=0;run<players.length;run++)
        {
          if (!(players[run].equals("0")))
          {
            if (output)
            {
              System.out.print(players[run]);
              output=false;
            }
            else
              System.out.print(" "+players[run]);
          }
        }
        System.out.println();
      }
    }
  }
  
  public static void checkOp(String logos,int [][]oper, String []players,int cases,int num)
  {
    if (logos.equals("+"))
    {
      if (oper[num][0]+oper[num][1]==oper[num][2])
        players[cases]="0";
    }
    else if (logos.equals("-"))
    {
      if (oper[num][0]-oper[num][1]==oper[num][2])
        players[cases]="0";
    }
    else if (logos.equals("*"))
    {
      if (oper[num][0]*oper[num][1]==oper[num][2])
        players[cases]="0";
    }
    else if (logos.equals("I"))
    {
      if (!((oper[num][0]+oper[num][1]==oper[num][2])||
            (oper[num][0]-oper[num][1]==oper[num][2])||
            (oper[num][0]*oper[num][1]==oper[num][2])))
        players[cases]="0";
    }
  }
}