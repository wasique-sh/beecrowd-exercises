import java.util.Scanner;

public class T1145
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int x=reader.nextInt();
    int y=reader.nextInt();
    
    int p=1;
    String r="";
    
    for (int c=1;c<=(y/x);c++)
    {
      r="";
      
      for (int i=1;i<=x;i++)
      {
        if (i==x)
          r+=p;
        else
          r+=p+" ";
        p++;
      }
      System.out.println(r);
    }
    
    if(y%x!=0)
    {
       r="";
       
      for (int i=1;i<=y%x;i++)
      {
        if (i==y%x)
          r+=p;
        else
          r+=p+" ";
        p++;
      }
      System.out.println(r);
    }
  }
}