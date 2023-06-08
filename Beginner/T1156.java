public class T1156
{
  public static void main (String[]args)
  {
    double s=1.0;
      int d=2;
    
    for (int i=3;i<=39;i+=2)
    {
      s+=(i*1.0)/d;
      d*=2;
    }
    System.out.printf ("%.2f%n",s);
  }
}