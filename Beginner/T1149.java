import java.util.Scanner;

public class T1149
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int x=reader.nextInt();
    int y=reader.nextInt();
    int sum=0;
    
    while(y<=0)
      y=reader.nextInt();
    
    for (int c=1;c<=y;c++)
    {
      sum+=x++;
    }
    System.out.println(sum);
  }
}