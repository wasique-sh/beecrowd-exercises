import java.util.Scanner;

public class T2552
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int rowMax=reader.nextInt();
      int colMax=reader.nextInt();
      
      int [][]cheese=new int [rowMax][colMax];
      
      for (int row=0;row<rowMax;row++)
      {
        for (int col=0;col<colMax;col++)
          cheese[row][col]=reader.nextInt();
      }
      
      
      for (int row=0;row<rowMax;row++)
      {
        String output="";
        
        for (int col=0;col<colMax;col++)
        {
          if (cheese[row][col]==1)
            output+=""+9;
          else
            output+=""+cheeseNum(row,col,cheese);
        }
        System.out.println (output);
      }
    } 
  }
  
  public static int cheeseNum(int row,int col,int [][]cheese)
  {
    int num=0;
    int rowMax=cheese.length;
    int colMax=cheese[0].length;
    
    if (row-1>=0)
    {
      if (cheese[row-1][col]==1)
        num++;
    }
    
    if (row+1<=rowMax-1)
    {
      if (cheese[row+1][col]==1)
        num++;
    }
    
    if (col-1>=0)
    {
      if (cheese[row][col-1]==1)
        num++;
    }
    
    if (col+1<=colMax-1)
    {
      if (cheese[row][col+1]==1)
        num++;
    }
    
    return num;
  }
}