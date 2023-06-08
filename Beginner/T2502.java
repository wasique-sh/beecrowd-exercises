import java.util.Scanner;

public class T2502
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    
    while (reader.hasNext())
    {
      String stLine=reader.nextLine();
      String []sLine=stLine.split(" ");
      
      int linenum=Integer.parseInt(sLine[1].trim());
      
      String setA=reader.nextLine();
      String setB=reader.nextLine();
      
      String seta=setA.toLowerCase();
      String setb=setB.toLowerCase();
      
      char []cipherA=setA.toCharArray();
      char []cipherB=setB.toCharArray();
      
      char []ciphera=seta.toCharArray();
      char []cipherb=setb.toCharArray();

      for (int line=1;line<=linenum;line++)
      {
        String code=reader.nextLine();
        System.out.println(Decipher(code,cipherA,cipherB,ciphera,cipherb));
      }
      System.out.println();
    }
  }
  public static String Decipher (String code,char []cipherA,char []cipherB,char []ciphera,char []cipherb)
  {
    String deciphered="";
    
    for (int letter0=0;letter0<code.length();letter0++)
    {
      boolean change=false;
      
      for (int letter1=0;letter1<cipherA.length;letter1++)
      {
        if (code.charAt(letter0)==ciphera[letter1])
        {
          deciphered+=""+cipherb[letter1];
          change=true;
        }
        else if (code.charAt(letter0)==cipherb[letter1])
        {
          deciphered+=""+ciphera[letter1];
          change=true;
        }
        else if (code.charAt(letter0)==cipherA[letter1])
        {
          deciphered+=""+cipherB[letter1];
          change=true;
        }
        else if (code.charAt(letter0)==cipherB[letter1])
        {
          deciphered+=""+cipherA[letter1];
          change=true;
        }
      }
      if (!change)
        deciphered+=""+code.charAt(letter0);
    }
    return deciphered;
  }
}