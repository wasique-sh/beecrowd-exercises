import java.util.Scanner;

public class T1177
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int[] Echo=new int[1000];
    
    int n=reader.nextInt();
    
    int n1=0;
    
    String r="";
    
    for (int i=0;i<Echo.length;i++)
    {
      Echo[i]=n1++;
      r+="N["+i+"] = "+Echo[i]+"\n";
      if (n1==n)
        n1=0;
    }
    System.out.print (r);
  }
}