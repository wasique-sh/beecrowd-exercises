import java.util.Scanner;

public class T1478
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    String Alpha;
    int num,azr;
    
    while (reader.hasNext())
    {
      num=reader.nextInt();
      num++;
      Alpha="  ";
      String [][] Echo=new String[num][num];
      
      for (int row=1;row<Echo.length;row++)
      {
        azr=row;
        azr++;
        for (int col=1;col<Echo.length;col++)
        {
          if (row==col)
          {
            if (col!=1)
            {
              Echo[row][col]="   1";
              azr=1;
            }
            else
            {
              Echo[row][col]="1";
              azr=1;
            }
          }
          
          if(col>row)
          {
            if (col!=1)
            {
              if (azr+1>99)
                Echo[row][col]=" ";
              else if(azr+1>9)
                Echo[row][col]="  ";
              else
                Echo[row][col]="   ";
              
              Echo[row][col]+=""+ ++azr;
            }
            else
              Echo[row][col]=""+ ++azr; 
          }
          if(col<row)
          {
            if (col!=1)
            {
              if (azr-1>99)
                Echo[row][col]=" ";
              else if(azr-1>9)
                Echo[row][col]="  ";
              else
                Echo[row][col]="   ";
              
              Echo[row][col]+=""+--azr;
            }
            else
              Echo[row][col]=""+ --azr;
          }
          
          Alpha+=Echo[row][col];
          
          
        }
        System.out.println (Alpha);
        
        if (row>98)
          Alpha="";
        else if (row>=9)
          Alpha=" ";
        else
          Alpha="  ";
      }
      if (num!=1)
        System.out.println();
    }
  }
}