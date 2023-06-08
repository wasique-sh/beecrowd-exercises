import java.util.Scanner;

public class T2632
{
    public static void main (String[]args)
    {
        Scanner reader=new Scanner (System.in);

        int runs=reader.nextInt();

        String output="";

        for (int run=1;run<=runs;run++) {
            int width = reader.nextInt();
            int height = reader.nextInt();

            int corX0 = reader.nextInt();
            int corY0 = reader.nextInt();

            int corX = corX0 + width;
            int corY = corY0 + height;

            String elemental = reader.next();
            int level = reader.nextInt();

            int damage;
            int damageRad;

            int radX = reader.nextInt();
            int radY = reader.nextInt();

            if (elemental.equals("fire"))
                damage = 200;
            else if (elemental.equals("water"))
                damage = 300;
            else if (elemental.equals("earth"))
                damage = 400;
            else
                damage = 100;

            if (damage == 200) {
                switch (level) {
                    case 1:
                        damageRad = 20;
                        break;
                    case 2:
                        damageRad = 30;
                        break;
                    default:
                        damageRad = 50;
                }
            } else if (damage == 300) {
                switch (level) {
                    case 1:
                        damageRad = 10;
                        break;
                    case 2:
                        damageRad = 25;
                        break;
                    default:
                        damageRad = 40;
                }
            } else if (damage == 400) {
                switch (level) {
                    case 1:
                        damageRad = 25;
                        break;
                    case 2:
                        damageRad = 55;
                        break;
                    default:
                        damageRad = 70;
                }
            } else {
                switch (level) {
                    case 1:
                        damageRad = 18;
                        break;
                    case 2:
                        damageRad = 38;
                        break;
                    default:
                        damageRad = 60;
                }
            }

            if (calDist(corX0,corY0,corX,corY,radX,radY,damageRad))
                output+=""+damage+"\n";
            else
            output+="0"+"\n";
        }
        System.out.print(output);
    }

    private static boolean calDist(int x1,int y1,int x2,int y2,int x3,int y3,int rad)
    {
        boolean dis=false;

        double radN=1000;
        double radW=radN;

        for (int row=x1;row<=x2;row++)
        {
            for (int col=y1;col<=y2;col++)
            {
                if (rad>=radN)
                {
                    dis=true;
                    break;
                }
                else
                {
                    radW=Math.sqrt(Math.pow(row-x3,2)+Math.pow(col-y3,2));
                    if (radN>=radW)
                        radN=radW;
                }

            }
            if (rad>=radN)
            {
                dis=true;
                break;
            }
        }
        return dis;
    }
}
