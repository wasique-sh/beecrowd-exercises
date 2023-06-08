import java.util.Scanner;

public class T2139
{
  public static void main (String[] args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      int month =reader.nextInt();
      int day=reader.nextInt();
      int cmas=0;
        
        if ((month==12)&&(day==25))
        System.out.println ("E natal!");
      else if ((month==12)&&(day>25))
        System.out.println ("Ja passou!");
      else if ((month==12)&&(day==24))
        System.out.println ("E vespera de natal!");
      else
      {
        boolean watson=true;
        while(watson)
        {
          if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10))
          {
            day++;
            cmas++;
            
            if (day>31)
            {
              day=1;
              month++;
            }
          }
          else if (month==2)
          {
             day++;
            cmas++;
            
            if (day>29)
            {
              day=1;
              month++;
            }
          }
          else if (month==12)
          {
            day++;
            cmas++;
            
            if (day==25)
            {
              watson=false;
            }
          }
          else
          {
             day++;
            cmas++;
            
            if (day>30)
            {
              day=1;
              month++;
            }
          }
        }
        System.out.println ("Faltam "+cmas+" dias para o natal!");
      }
    }
  }
}