import java.util.Scanner;

public class T1929
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int[] Sticks=new int[4];
    int[] order=new int[3];
    
    for (int col=0;col<Sticks.length;col++)
    {
      Sticks[col]=reader.nextInt();
    }
    
    order[0]=Sticks[0];
    order[1]=Sticks[1];
    order[2]=Sticks[2];
    Max3(order[0],order[1],order[2],order);
    boolean A1=((order[0]<order[1]+order[2]));
    
    order[0]=Sticks[1];
    order[1]=Sticks[2];
    order[2]=Sticks[3];
    Max3(order[0],order[1],order[2],order);
    boolean B1=(order[0]<order[1]+order[2]);
    
    order[0]=Sticks[2];
    order[1]=Sticks[3];
    order[2]=Sticks[0];
    Max3(order[0],order[1],order[2],order);
    boolean C1=(order[0]<order[1]+order[2]);
    
    
    order[0]=Sticks[3];
    order[1]=Sticks[0];
    order[2]=Sticks[1];
    Max3(order[0],order[1],order[2],order);
    boolean D1=(order[0]<order[1]+order[2]);

    if (A1)
      System.out.println ("S");
    else if (B1)
      System.out.println ("S");
    else if (C1)
      System.out.println ("S");
    else if (D1)
      System.out.println ("S");
    else
      System.out.println ("N");
  }
  
  public static void Max3 (int a,int b, int c,int[] triangle)
  {
    if ((a>=b)&&(a>=c)&&(b>=c))
    {
      triangle[0]=a;
      triangle[1]=b;
      triangle[2]=c;
    }
    else if ((a>=b)&&(a>=c)&&(b<=c))
    {
      triangle[0]=a;
      triangle[1]=c;
      triangle[2]=b;
    }
    else if ((b>=a)&&(b>=c)&&(a>=c))
    {
      triangle[0]=b;
      triangle[1]=a;
      triangle[2]=c;
    }
    else if ((b>=a)&&(b>=c)&&(a<=c))
    {
      triangle[0]=b;
      triangle[1]=c;
      triangle[2]=a;
    }
    else if ((c>a)&&(c>=b)&&(a>=b))
    {
      triangle[0]=c;
      triangle[1]=a;
      triangle[2]=b;
    }
    else
    {
      triangle[0]=c;
      triangle[1]=a;
      triangle[2]=b;
    }
    
  }
}