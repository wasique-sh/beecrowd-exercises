import java.util.Scanner;

public class T1181
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    double sum=0,count=0;
    
    double [][] Echo =new double [12][12];
    
    int line=reader.nextInt();
    String cha=reader.next();
    
    for (int row=0;row<Echo.length;row++)
    {
      for (int col=0;col<Echo.length;col++)
      {
        Echo[row][col]=reader.nextDouble();
        
        if (row==line)
        {
          sum+=Echo[row][col]*100;
          count++;
        }
      }
    }
    if (cha.equals("S"))
      System.out.printf("%.1f%n",sum/100);
    else
      System.out.printf("%.1f%n",sum/count/100);
  }
}