import java.util.Scanner;
import java.util.Arrays;

public class T2534
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int gradeTotal=reader.nextInt();
      int querieTotal=reader.nextInt();
      
      int []grades=new int [gradeTotal];
      
      for (int grade=0;grade<gradeTotal;grade++)
        grades[grade]=reader.nextInt();
      
      Arrays.sort(grades);
      
      for (int querie=0;querie<querieTotal;querie++)
        System.out.println(grades[gradeTotal-reader.nextInt()]);
    }
  }
}