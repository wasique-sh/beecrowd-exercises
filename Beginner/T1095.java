public class T1095
{
  public static void main (String[]args)
  {
    int i=1,j=60;
    String r="";
    
    while (j>=0)
    {
      r+="I="+i+" J="+j+"\n";
      i+=3;
      j-=5;
    }
    System.out.print(r);
  }
}