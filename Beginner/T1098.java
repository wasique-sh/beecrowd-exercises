public class T1098
{
  public static void main (String[]args)
  {
    int i=0,j=10;
    String r="";
    
    while (i<=20)
    {
      for (int c=0;c<30;c+=10)
      {
        if ((i==0)||(i==10)||(i==20))
          r+=("I="+Math.round(i/10)+" J="+Math.round(j/10)+"\n");
        else
          r+=("I="+(i/10.0)+" J="+(j/10.0)+"\n");
        
        j+=10;
      }
      j-=30;
      j+=02;
      i+=2;
    }
    System.out.print(r);
  }
}