import java.util.Scanner;

public class T1101
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int m,n,sum=0,p=0;
    String r="";
    
    while (p==0)
    {
      m=reader.nextInt();
      n=reader.nextInt();
      
      if ((m<=0)||(n<=0))
        p++;
      else
      {
        if (n<m)
        {
          m=n+m;
          n=m-n;
          m=m-n;
        }
        
        for (int c=m;c<=n;c++)
        {
          r+=c+" ";
          sum+=c;
        }
        System.out.println(r+"Sum="+sum);
      }
      sum=0;
      r="";
    }
  }
}