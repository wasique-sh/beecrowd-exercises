import java.util.Scanner;

public class T1930
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int StripA=reader.nextInt();
    int StripB=reader.nextInt();
    int StripC=reader.nextInt();
    int StripD=reader.nextInt();
    
    int devices= --StripA + --StripB + --StripC + --StripD +1;
    System.out.println (devices);
  }
}