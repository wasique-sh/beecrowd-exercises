import java.util.Scanner;

public class T2163
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int row0=reader.nextInt();
    int col0=reader.nextInt();
    
    int x=0,y=0;
    
    int[][] Force=new int[row0][col0];
    
    for (int row=0;row<row0;row++)
    {
      for (int col=0;col<col0;col++)
        Force[row][col]=reader.nextInt();
    }
    
    for (int row=1;(row<row0-1)&&(x==0&&y==0);row++)
    {
      for (int col=1;(col<col0-1)&&(x==0&&y==0);col++)
      {
        if (Force[row][col]==42)
        {
          if ((Force[row-1][col-1]==7)&&(Force[row-1][col]==7)&&
              (Force[row-1][col+1]==7)&&(Force[row][col-1]==7)&&
              (Force[row][col+1]==7)&&(Force[row+1][col-1]==7)&&
              (Force[row+1][col]==7)&&(Force[row+1][col+1]==7))
          {
            x=row+1;
            y=col+1;
          }
        }
      }
    }
    System.out.println(x+" "+y);
  }
}