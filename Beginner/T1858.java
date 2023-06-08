import java.util.Scanner;

public class T1858
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int term=reader.nextInt();
    
    int[] Echo=new int [term];
    
    Echo[0]=reader.nextInt();
    
    int small=Echo[0];
    int pos=1;
    
    for (int col=1;col<Echo.length;col++)
    {
      Echo[col]=reader.nextInt();
      
      if (Echo[col]<small)
      {
        small=Echo[col];
        pos=col+1;
      }
    }
    System.out.println (pos);
  }
}