import java.util.Scanner;

public class T1173
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int n=reader.nextInt();
    int[] Echo=new int[10];
    int n1=n;
    String r="";
    
    for (int i=0;i<Echo.length;i++)
    {
      Echo[i]=n1;
      n1*=2;
      
      r+="N["+i+"] = "+Echo[i]+"\n";
    }
    System.out.print (r);
  }
}