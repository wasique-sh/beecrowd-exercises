import java.util.Scanner;

public class T1534
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      String array="";
      
      int num=reader.nextInt();
      
      num++;
      
      int[][] Echo=new int[num][num];
      
      int row1=1,col1=Echo.length-1;
      
      for (int row=1;row<Echo.length;row++)
      {
        for (int col=1;col<Echo.length;col++)
        {
          if (row==col)
            Echo[row][col]=1;
          
          Echo[row1][col1]=2;
          
          if (Echo[row][col]==0)
            Echo[row][col]=3;
          
          array+=Echo[row][col];
        }
        array+="\n";
        row1++;
        col1--;
      }
      System.out.print(array);
    }
  }
}