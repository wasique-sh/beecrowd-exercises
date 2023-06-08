public class T1096
{
  public static void main (String[]args)
  {
    String r="";
    
    for (int i=1;i<=9;i+=2)
    {
      r+="I="+i+" J=7"+"\n"+"I="+i+" J=6"+"\n"+"I="+i+" J=5"+"\n";
    }
    System.out.print (r);
  }
}