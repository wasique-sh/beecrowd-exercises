import java.util.Scanner;

public class T2057
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    int home=reader.nextInt();
    int flight=reader.nextInt();
    int zone=reader.nextInt();
    
    int spent=home+flight+zone;
    
    if ((spent<24)&&(spent>0))
      System.out.println(spent);
    else if ((spent==24)||(spent==0))
      System.out.println("0");
    else if ((spent<0))
      System.out.println(24+spent);
    else
      System.out.println(spent-24);
  }
}