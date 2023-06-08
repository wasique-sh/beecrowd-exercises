import java.util.Scanner;

public class T1175
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int[] Echo=new int[20];
    String r="";

    for (int i=Echo.length-1;i>=0;i--)
    {
      Echo[i]=reader.nextInt();
    }
    
    for (int i=0;i<Echo.length;i++)
    {
      r+="N["+i+"] = "+Echo[i]+"\n";
    }
    System.out.print (r);
  }
}