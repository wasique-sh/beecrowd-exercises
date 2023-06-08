import java.util.Scanner;

public class T1959
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    long sides=reader.nextLong();
    long length=reader.nexLong();
    
    long perimeter=sides*length;
    System.out.println (perimeter);
  }
}