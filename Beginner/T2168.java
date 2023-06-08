import java.util.Scanner;

public class T2168
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int block=reader.nextInt();
    
    int[][] Total=new int [block+1][block+1];
    
    for (int row=0;row<Total.length;row++)
    {
      for (int col=0;col<Total.length;col++)
        Total[row][col]=reader.nextInt();
    }
    
    String out="";
    
    for (int row=0;row<block;row++)
    {
      for (int col=0;col<block;col++)
        out+=check(row,col,Total);
      out+="\n";
    }
    System.out.print (out);
  }
  
  public static String check(int pos1,int pos2,int[][] Array)
  {
    int sum=Array[pos1][pos2]+Array[pos1+1][pos2]+Array[pos1][pos2+1]+Array[pos1+1][pos2+1];
    
    if (sum>1)
      return "S";
    else
      return "U";
  }
}