import java.util.Scanner;

public class T1921
{
    public static void main (String[]args)
    {
        Scanner reader=new Scanner (System.in);
        
        long sides=reader.nextInt();
        
        long diagonals=(sides*(sides-3));
        
        System.out.println (diagonals/2);
    }
}
