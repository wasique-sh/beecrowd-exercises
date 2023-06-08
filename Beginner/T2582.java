import java.util.Scanner;

public class T2582
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int testCases=reader.nextInt();
    
    String []songs={"PROXYCITY","P.Y.N.G.","DNSUEY!","SERVERS",
      "HOST!","CRIPTONIZE","OFFLINE DAY","SALT","ANSWER!","RAR?",
      "WIFI ANTENNAS"};
    
    for (int testCase=1;testCase<=testCases;testCase++)
      System.out.println (songs[reader.nextInt()+reader.nextInt()]);
  }
}