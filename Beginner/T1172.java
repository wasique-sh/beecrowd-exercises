import java.util.Scanner;

public class T1172
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int[]Echo=new int[10];
    String r="";
    
    for(int i=0;i<10;i++)
    {
      Echo[i]=reader.nextInt();
      
      if (Echo[i]<=0)
        Echo[i]=1;
      r+="X["+i+"] = "+Echo[i]+"\n";
    }
    System.out.print (r);
  }
}