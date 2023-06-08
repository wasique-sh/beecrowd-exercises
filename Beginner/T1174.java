import java.util.Scanner;

public class T1174
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    double [] Echo=new double[100];
    
    String r="";
    
    for (int i=0;i<Echo.length;i++)
    {
      Echo[i]=reader.nextDouble();
      if (Echo[i]<=10)
        r+="A["+i+"] = "+Echo[i]+"\n";
    }
    System.out.print (r);
  }
}