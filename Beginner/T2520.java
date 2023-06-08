import java.util.Scanner;

public class T2520
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int rowMax=reader.nextInt();
      int colMax=reader.nextInt();
      
      int posx=0,posy=0,pos=0;
      
      int [][]city=new int [rowMax][colMax];
      
      for (int row=0;row<rowMax;row++)
      {
        for (int col=0;col<colMax;col++)
        {
          city[row][col]=reader.nextInt();
          
          if (city[row][col]==1)
          {
            posx+=col;
            posy+=row;
          }
          else if (city[row][col]==2)
          {
            posx-=col;
            posy-=row;
          }
        }
      }
      pos=Math.abs(posx)+Math.abs(posy);
      System.out.println (pos);
    }
  }
}