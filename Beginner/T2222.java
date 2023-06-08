import java.util.Scanner;

public class T2222
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int setnum=reader.nextInt();
    
    for (int run0=1;run0<=setnum;run0++)
    {
      int setline=reader.nextInt();
      
      int [][]SET=new int [setline][];
      
      for (int setline0=0;setline0<setline;setline0++)
      {
        int elements=reader.nextInt();
        
        SET[setline0]=new int [elements+1];
        SET[setline0][0]=elements;
        
        for (int row=1;row<SET[setline0].length;row++)
          SET[setline0][row]=reader.nextInt();
      }
      
      int task=reader.nextInt();
      
      for (int task0=0;task0<task;task0++)
      {
        int type=reader.nextInt();
        int setX=reader.nextInt();
        int setY=reader.nextInt();
        
        if (type==1)
          System.out.println (HW1(setX,setY,SET));
        else
          System.out.println (HW2(setX,setY,SET));
      }
    }
  }
  
  
  public static int HW1(int setX,int setY,int[][] SAT)
  {
    int req=0;
    
    int [][]NewSET=SAT.clone();
    
    int Xel=NewSET[--setX][0]+1;
    int Yel=NewSET[--setY][0]+1;
    
    int [] com=new int [Xel-1];
    
    int pos=0;
    
    com[pos++]=NewSET[setX][1];
    
    for (int run1=1;run1<Xel;run1++)
    {
      boolean same=true;
      
      for (int pos0=0;pos0<pos;pos0++)
      {
        if (NewSET[setX][run1]==com[pos0])
          same=false;
      }
      
      if (same)
        com[pos++]=NewSET[setX][run1];
    }
    
    for (int run=0;run<com.length;run++)
    {
      boolean same=false;
      
      for (int run2=1;run2<Yel;run2++)
      {
        if (com[run]==NewSET[setY][run2])
          same=true;
      }
      
      if (!same)
      {
        com[run]=0;
      }
    }
    
    for (int run=0;run<com.length;run++)
    {
      if (com[run]!=0)
        req++;
    }
    return req;
  }
 
  
  public static int HW2(int setX,int setY,int[][] SAT) 
  {
    int req=0;
    
    int [][]NewSET=SAT.clone();
    
    int Xel=NewSET[--setX][0]+1;
    int Yel=NewSET[--setY][0]+1;
    
    int [] com=new int [Xel+Yel];
    
    int pos=0;
    
    com[pos++]=NewSET[setX][1];
    
    for (int run1=1;run1<Xel;run1++)
    {
      boolean same=true;
      
      for (int pos0=0;pos0<pos;pos0++)
      {
        if (NewSET[setX][run1]==com[pos0])
          same=false;
      }
      
      if (same)
        com[pos++]=NewSET[setX][run1];
    }
    
    for (int run1=1;run1<Yel;run1++)
    {
      
      boolean same=true;
      
      for (int pos0=0;pos0<=pos;pos0++)
      {
        if (NewSET[setY][run1]==com[pos0])
          same=false;
      }
      
      if (same)
        com[pos++]=NewSET[setY][run1];
    }
    
    for (int run=0;com[run]!=0;run++)
      req++;
    
    return req;
  }
}