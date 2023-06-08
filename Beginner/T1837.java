import java.util.Scanner;

public class T1837
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int numa=reader.nextInt();
    int numb=reader.nextInt();
    
    if ((numa>=0) || (numa%numb==0))
      System.out.println ((numa/numb)+" "+(numa%numb));
    else if (numb>0)
      System.out.println ((numa/numb -1)+" "+(numa%numb +numb));
    else
      System.out.println ((numa/numb +1)+" "+(numa%numb -numb));
  }
}