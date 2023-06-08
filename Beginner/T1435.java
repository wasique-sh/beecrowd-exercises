import java.util.Scanner;

public class T1435
{
  public static void main (String[]args)
  {
    Scanner reader=new Scanner (System.in);
    String Alpha="";
    
    while (reader.hasNext())
    {
      Alpha="  ";
      int num=reader.nextInt();
      num++;
      
      
      String [][] Echo=new String [num][num];
      
      for (int row=1;row<Echo.length;row++)
      {
        for (int col=1;col<Echo.length;col++)
        {
          if ((col==1)||(col==Echo.length-1)||(row==1)||(row==Echo.length-1))
          {
            if (col!=1)
              Echo[row][col]="   1";
            else
              Echo[row][col]="1";
          }
          if((col>1)&&(col<Echo.length-1)&&((row>=2)||(row>=Echo.length-2)))
            Echo[row][col]="   "+2;
          if((col>2)&&(col<Echo.length-2)&&((row>=3)||(row>=Echo.length-3)))
            Echo[row][col]="   "+3;
          if((col>3)&&(col<Echo.length-3)&&((row>=4)||(row>=Echo.length-4)))
            Echo[row][col]="   "+4;
          if((col>4)&&(col<Echo.length-4)&&((row>=5)||(row>=Echo.length-5)))
            Echo[row][col]="   "+5;
          if((col>5)&&(col<Echo.length-5)&&((row>=6)||(row>=Echo.length-6)))
            Echo[row][col]="   "+6;
          if((col>6)&&(col<Echo.length-6)&&((row>=7)||(row>=Echo.length-7)))
            Echo[row][col]="   "+7;
          if((col>7)&&(col<Echo.length-7)&&((row>=8)||(row>=Echo.length-8)))
            Echo[row][col]="   "+8;
          if((col>8)&&(col<Echo.length-8)&&((row>=9)||(row>=Echo.length-9)))
            Echo[row][col]="   "+9;
          if((col>9)&&(col<Echo.length-9)&&((row>=10)||(row>=Echo.length-10)))
            Echo[row][col]="  "+10;
          if((col>10)&&(col<Echo.length-10)&&((row>=11)||(row>=Echo.length-11)))
            Echo[row][col]="  "+11;
          
          if((col>11)&&(col<Echo.length-11)&&((row>=12)||(row>=Echo.length-12)))
            Echo[row][col]="  "+12;
          if((col>12)&&(col<Echo.length-12)&&((row>=13)||(row>=Echo.length-13)))
            Echo[row][col]="  "+13;
          if((col>13)&&(col<Echo.length-13)&&((row>=14)||(row>=Echo.length-14)))
            Echo[row][col]="  "+14;
          if((col>14)&&(col<Echo.length-14)&&((row>=15)||(row>=Echo.length-15)))
            Echo[row][col]="  "+15;
          if((col>15)&&(col<Echo.length-15)&&((row>=16)||(row>=Echo.length-16)))
            Echo[row][col]="  "+16;
          if((col>16)&&(col<Echo.length-16)&&((row>=17)||(row>=Echo.length-17)))
            Echo[row][col]="  "+17;
          if((col>17)&&(col<Echo.length-17)&&((row>=18)||(row>=Echo.length-18)))
            Echo[row][col]="  "+18;
          if((col>18)&&(col<Echo.length-18)&&((row>=19)||(row>=Echo.length-19)))
            Echo[row][col]="  "+19;
          if((col>19)&&(col<Echo.length-19)&&((row>=20)||(row>=Echo.length-20)))
            Echo[row][col]="  "+20;
          if((col>20)&&(col<Echo.length-20)&&((row>=21)||(row>=Echo.length-21)))
            Echo[row][col]="  "+21;
          
          if((col>21)&&(col<Echo.length-21)&&((row>=22)||(row>=Echo.length-22)))
            Echo[row][col]="  "+22;
          if((col>22)&&(col<Echo.length-22)&&((row>=23)||(row>=Echo.length-23)))
            Echo[row][col]="  "+23;
          if((col>23)&&(col<Echo.length-23)&&((row>=24)||(row>=Echo.length-24)))
            Echo[row][col]="  "+24;
          if((col>24)&&(col<Echo.length-24)&&((row>=25)||(row>=Echo.length-25)))
            Echo[row][col]="  "+25;
          if((col>25)&&(col<Echo.length-25)&&((row>=26)||(row>=Echo.length-26)))
            Echo[row][col]="  "+26;
          if((col>26)&&(col<Echo.length-26)&&((row>=27)||(row>=Echo.length-27)))
            Echo[row][col]="  "+27;
          if((col>27)&&(col<Echo.length-27)&&((row>=28)||(row>=Echo.length-28)))
            Echo[row][col]="  "+28;
          if((col>28)&&(col<Echo.length-28)&&((row>=29)||(row>=Echo.length-29)))
            Echo[row][col]="  "+29;
          if((col>29)&&(col<Echo.length-29)&&((row>=30)||(row>=Echo.length-30)))
            Echo[row][col]="  "+30;
          if((col>30)&&(col<Echo.length-30)&&((row>=31)||(row>=Echo.length-31)))
            Echo[row][col]="  "+31;
          
          if((col>31)&&(col<Echo.length-31)&&((row>=32)||(row>=Echo.length-32)))
            Echo[row][col]="  "+32;
          if((col>32)&&(col<Echo.length-32)&&((row>=33)||(row>=Echo.length-33)))
            Echo[row][col]="  "+33;
          if((col>33)&&(col<Echo.length-33)&&((row>=34)||(row>=Echo.length-34)))
            Echo[row][col]="  "+34;
          if((col>34)&&(col<Echo.length-34)&&((row>=35)||(row>=Echo.length-35)))
            Echo[row][col]="  "+35;
          if((col>35)&&(col<Echo.length-35)&&((row>=36)||(row>=Echo.length-36)))
            Echo[row][col]="  "+36;
          if((col>36)&&(col<Echo.length-36)&&((row>=37)||(row>=Echo.length-37)))
            Echo[row][col]="  "+37;
          if((col>37)&&(col<Echo.length-37)&&((row>=38)||(row>=Echo.length-38)))
            Echo[row][col]="  "+38;
          if((col>38)&&(col<Echo.length-38)&&((row>=39)||(row>=Echo.length-39)))
            Echo[row][col]="  "+39;
          if((col>39)&&(col<Echo.length-39)&&((row>=40)||(row>=Echo.length-40)))
            Echo[row][col]="  "+40;
          if((col>40)&&(col<Echo.length-40)&&((row>=41)||(row>=Echo.length-41)))
            Echo[row][col]="  "+41;
          if((col>41)&&(col<Echo.length-41)&&((row>=42)||(row>=Echo.length-42)))
            Echo[row][col]="  "+42;
          if((col>42)&&(col<Echo.length-42)&&((row>=43)||(row>=Echo.length-43)))
            Echo[row][col]="  "+43;
          if((col>43)&&(col<Echo.length-43)&&((row>=44)||(row>=Echo.length-44)))
            Echo[row][col]="  "+44;
          if((col>44)&&(col<Echo.length-44)&&((row>=45)||(row>=Echo.length-45)))
            Echo[row][col]="  "+45;
          if((col>45)&&(col<Echo.length-45)&&((row>=46)||(row>=Echo.length-46)))
            Echo[row][col]="  "+46;
          if((col>46)&&(col<Echo.length-46)&&((row>=47)||(row>=Echo.length-47)))
            Echo[row][col]="  "+47;
          if((col>47)&&(col<Echo.length-47)&&((row>=48)||(row>=Echo.length-48)))
            Echo[row][col]="  "+48;
          if((col>48)&&(col<Echo.length-48)&&((row>=49)||(row>=Echo.length-49)))
            Echo[row][col]="  "+49;
          if((col>49)&&(col<Echo.length-49)&&((row>=50)||(row>=Echo.length-50)))
            Echo[row][col]="  "+50;
          
          
          
          if((col>50)&&(col<Echo.length-50)&&((row==51)||(row==Echo.length-51)))
            Echo[row][col]="  "+51;
          
          
          
          if((col>49)&&(col<Echo.length-49)&&((row>=50)&&(row>=Echo.length-50)))
            Echo[row][col]="  "+50;
          if((col>48)&&(col<Echo.length-48)&&((row>=49)&&(row>=Echo.length-49)))
            Echo[row][col]="  "+49;
          if((col>47)&&(col<Echo.length-47)&&((row>=48)&&(row>=Echo.length-48)))
            Echo[row][col]="  "+48;
          if((col>46)&&(col<Echo.length-46)&&((row>=47)&&(row>=Echo.length-47)))
            Echo[row][col]="  "+47;
          if((col>45)&&(col<Echo.length-45)&&((row>=46)&&(row>=Echo.length-46)))
            Echo[row][col]="  "+46;
          if((col>44)&&(col<Echo.length-44)&&((row>=45)&&(row>=Echo.length-45)))
            Echo[row][col]="  "+45;
          if((col>43)&&(col<Echo.length-43)&&((row>=44)&&(row>=Echo.length-44)))
            Echo[row][col]="  "+44;
          if((col>42)&&(col<Echo.length-42)&&((row>=43)&&(row>=Echo.length-43)))
            Echo[row][col]="  "+43;
          if((col>41)&&(col<Echo.length-41)&&((row>=42)&&(row>=Echo.length-42)))
            Echo[row][col]="  "+42;
          if((col>40)&&(col<Echo.length-40)&&((row>=41)&&(row>=Echo.length-41)))
            Echo[row][col]="  "+41;
          if((col>39)&&(col<Echo.length-39)&&((row>=40)&&(row>=Echo.length-40)))
            Echo[row][col]="  "+40;
          if((col>38)&&(col<Echo.length-38)&&((row>=39)&&(row>=Echo.length-39)))
            Echo[row][col]="  "+39;
          if((col>37)&&(col<Echo.length-37)&&((row>=38)&&(row>=Echo.length-38)))
            Echo[row][col]="  "+38;
          if((col>36)&&(col<Echo.length-36)&&((row>=37)&&(row>=Echo.length-37)))
            Echo[row][col]="  "+37;
          if((col>35)&&(col<Echo.length-35)&&((row>=36)&&(row>=Echo.length-36)))
            Echo[row][col]="  "+36;
          if((col>34)&&(col<Echo.length-34)&&((row>=35)&&(row>=Echo.length-35)))
            Echo[row][col]="  "+35;
          if((col>33)&&(col<Echo.length-33)&&((row>=34)&&(row>=Echo.length-34)))
            Echo[row][col]="  "+34;
          if((col>32)&&(col<Echo.length-32)&&((row>=33)&&(row>=Echo.length-33)))
            Echo[row][col]="  "+33;
          if((col>31)&&(col<Echo.length-31)&&((row>=32)&&(row>=Echo.length-32)))
            Echo[row][col]="  "+32;
          if((col>30)&&(col<Echo.length-30)&&((row>=31)&&(row>=Echo.length-31)))
            Echo[row][col]="  "+31; 
          if((col>29)&&(col<Echo.length-29)&&((row>=30)&&(row>=Echo.length-30)))
            Echo[row][col]="  "+30;
          if((col>28)&&(col<Echo.length-28)&&((row>=29)&&(row>=Echo.length-29)))
            Echo[row][col]="  "+29;
          if((col>27)&&(col<Echo.length-27)&&((row>=28)&&(row>=Echo.length-28)))
            Echo[row][col]="  "+28;
          if((col>26)&&(col<Echo.length-26)&&((row>=27)&&(row>=Echo.length-27)))
            Echo[row][col]="  "+27;
          if((col>25)&&(col<Echo.length-25)&&((row>=26)&&(row>=Echo.length-26)))
            Echo[row][col]="  "+26;
          if((col>24)&&(col<Echo.length-24)&&((row>=25)&&(row>=Echo.length-25)))
            Echo[row][col]="  "+25;
          if((col>23)&&(col<Echo.length-23)&&((row>=24)&&(row>=Echo.length-24)))
            Echo[row][col]="  "+24;
          if((col>22)&&(col<Echo.length-22)&&((row>=23)&&(row>=Echo.length-23)))
            Echo[row][col]="  "+23;
          if((col>21)&&(col<Echo.length-21)&&((row>=22)&&(row>=Echo.length-22)))
            Echo[row][col]="  "+22;
          if((col>20)&&(col<Echo.length-20)&&((row>=21)&&(row>=Echo.length-21)))
            Echo[row][col]="  "+21;
          if((col>19)&&(col<Echo.length-19)&&((row>=20)&&(row>=Echo.length-20)))
            Echo[row][col]="  "+20;
          if((col>18)&&(col<Echo.length-18)&&((row>=19)&&(row>=Echo.length-19)))
            Echo[row][col]="  "+19;
          if((col>17)&&(col<Echo.length-17)&&((row>=18)&&(row>=Echo.length-18)))
            Echo[row][col]="  "+18;
          if((col>16)&&(col<Echo.length-16)&&((row>=17)&&(row>=Echo.length-17)))
            Echo[row][col]="  "+17;
          if((col>15)&&(col<Echo.length-15)&&((row>=16)&&(row>=Echo.length-16)))
            Echo[row][col]="  "+16;
          if((col>14)&&(col<Echo.length-14)&&((row>=15)&&(row>=Echo.length-15)))
            Echo[row][col]="  "+15;
          if((col>13)&&(col<Echo.length-13)&&((row>=14)&&(row>=Echo.length-14)))
            Echo[row][col]="  "+14;
          if((col>12)&&(col<Echo.length-12)&&((row>=13)&&(row>=Echo.length-13)))
            Echo[row][col]="  "+13;
          if((col>11)&&(col<Echo.length-11)&&((row>=12)&&(row>=Echo.length-12)))
            Echo[row][col]="  "+12;
          if((col>10)&&(col<Echo.length-10)&&((row>=11)&&(row>=Echo.length-11)))
            Echo[row][col]="  "+11;
          if((col>9)&&(col<Echo.length-9)&&((row>=10)&&(row>=Echo.length-10)))
            Echo[row][col]="  "+10;
          if((col>8)&&(col<Echo.length-8)&&((row>=9)&&(row>=Echo.length-9)))
            Echo[row][col]="   "+9;
          if((col>7)&&(col<Echo.length-7)&&((row>=8)&&(row>=Echo.length-8)))
            Echo[row][col]="   "+8;
          if((col>6)&&(col<Echo.length-6)&&((row>=7)&&(row>=Echo.length-7)))
            Echo[row][col]="   "+7;
          if((col>5)&&(col<Echo.length-5)&&((row>=6)&&(row>=Echo.length-6)))
            Echo[row][col]="   "+6;
          if((col>4)&&(col<Echo.length-4)&&((row>=5)&&(row>=Echo.length-5)))
            Echo[row][col]="   "+5;
          if((col>3)&&(col<Echo.length-3)&&((row>=4)&&(row>=Echo.length-4)))
            Echo[row][col]="   "+4;
          if((col>2)&&(col<Echo.length-2)&&((row>=3)&&(row>=Echo.length-3)))
            Echo[row][col]="   "+3;
          if((col>1)&&(col<Echo.length-1)&&((row>=2)&&(row>=Echo.length-2)))
            Echo[row][col]="   "+2;
          if ((col==1)||(col==Echo.length-1)||(row==1)||(row==Echo.length-1))
          {
            if (col!=1)
              Echo[row][col]="   1";
            else
              Echo[row][col]="1";
          }
          
          Alpha+=Echo[row][col];
          
          if (col==Echo.length-1)
            Alpha+="\n";
        }
        System.out.print(Alpha);
        if (!(row==num-1))
          Alpha="  ";
      }
      if (num!=1)
      System.out.println();
    }
  }
}
