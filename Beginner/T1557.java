import java.util.Scanner;

public class T1557
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int num, space0, space1, sp;
    int n1, n2;
    int deci;
    String Zolt="";
    
    while (reader.hasNext())
    {
      num=reader.nextInt();
      n1=1;
      space1=1;
      sp=0;
      space0=0;
      deci=1;
      if (num!=0)
      {
        int [][] Echo=new int[num][num];
        
        for (int row=0; row<Echo.length; row++)
        {
          n2=n1;
          for (int col=0; col<Echo.length; col++)
          {
            Echo[row][col]=n2;
            n2*=2;
          }
          n1*=2;
        }
        deci=Echo[num-1][num-1];
        
        while (deci>9)
        {
          deci/=10;
          space1++;
          space0++;
        }
        
        for (int row=0; row<Echo.length; row++)
        {
          for (int col=0; col<Echo.length; col++)
          {
            if (col==0)
            {
              deci=Echo[row][col];
              while (deci>9)
              {
                deci/=10;
                space0--;
                sp++;
              }
              for(int quar=0; quar<space0;quar++)
                Zolt+=" ";
              
              space0+=sp;
              sp=0;
              
              Zolt+=""+Echo[row][col];
            }
            else
            {
              deci=Echo[row][col];
              while (deci>9)
              {
                deci/=10;
                space1--;
                sp++;
              }
              for(int quar=0; quar<space1;quar++)
                Zolt+=" ";
              
              space1+=sp;
              sp=0;
              
              Zolt+=""+Echo[row][col];
            }
          }
          System.out.println(Zolt);
          Zolt="";
        }
        System.out.println();
      }
    }
  }
}