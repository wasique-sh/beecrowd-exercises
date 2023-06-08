import java.util.Scanner;

public class T1847
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    int temp1=reader.nextInt();
    int temp2=reader.nextInt();
    int temp3=reader.nextInt();
     
    int sm=1;
    
    if (temp1>temp2)
    {
      if (temp3>=temp2)
        sm=1;
      else if ((temp2-temp3)<(temp1-temp2))
        sm=1;
      else
        sm=0;
    }
    else if (temp1<temp2)
    {
     if (temp3<=temp2)
        sm=0;
     else if ((temp3-temp2)<(temp2-temp1))
        sm=0;
      else
        sm=1;
    }
    else
    {
      if (temp3>temp2)
        sm=1;
      else
        sm=0;
    }
    
    if (sm==1)
      System.out.println (":)");
    else
      System.out.println (":(");
    
   }
}