import java.util.Scanner;

public class T1827
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num,end,in,in0;
    
    String Alpha="";
    
    while (reader.hasNext())
    {
      num=reader.nextInt();
      num++;
      int [][]Echo=new int [num][num];
      Alpha="";
      in=1;
      in0=1;
      
      for (int inner=7;inner<=num-1;inner++)
      {
        if ((inner%2!=0)&&(in0<=2))
        {
          in++;
          in0++;
        }
        else if ((inner%2!=0)&&(in0>2))
          in0=1;
      }
      
      for (int row=1;row<Echo.length;row++)
      {
        end=Echo.length-row;
        
        for (int col=1;col<Echo.length;col++)
        {
          if (row==col)
            Echo[row][col]=2;
          if (col==end)
            Echo[row][col]=3;
          
          if ((row>in)&&(row<Echo.length-in))
          {
            if ((col>in)&&(col<Echo.length-in))
              Echo[row][col]=1;
          }
          
          
          if ((row==end)&&(col==end))
            Echo[row][col]=4;
          Alpha+=Echo[row][col];
        }
        System.out.println(Alpha);
        Alpha="";
      }
      if (num!=1)
        System.out.println();
      
    }
  }
}