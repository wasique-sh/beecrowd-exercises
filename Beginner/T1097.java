public class T1097
{
  public static void main (String[]args)
  {
    int i=1,j=7,c=j;
    String r="";
    
    while (i<=9)
    {
      while (j>=(c-2))
      {
        r+="I="+i+" J="+j+"\n";
        j--;
      }
      j+=5;
      c=j;
      i+=2;;
    }
    System.out.print (r);
  }
}