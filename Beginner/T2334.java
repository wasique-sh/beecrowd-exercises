import java.util.Scanner;
import java.math.BigInteger;

public class T2334
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    BigInteger duckling=new BigInteger ("0");
    BigInteger com=new BigInteger ("0");
    
    while (reader.hasNext())
    {
      duckling=new BigInteger (reader.nextLine());
      
      int res=duckling.compareTo(com);
      
      if (res == 0)
        System.out.println ("0");
      else if (res == 1)
      {
        System.out.println ((duckling.add(new BigInteger ("-1"))));
      }
    }
  }
}