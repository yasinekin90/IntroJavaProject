package day04;

public class Precedence {

    public static void main(String[] args) {
        //Operatör öncelikleri
//        int result=(5+3)*(8-7);
//        System.out.println(result);


        //Assignment Operators: +=, -=, *=, /=, %=
        int x=5;
        x +=1;//        x=x+1;
        System.out.println(x);

        x -=7; //        x=x-7;
        System.out.println(x);

        x *=-5;//        x=x*-5;
        System.out.println(x);

        x /=5;//        x=x/5;
        System.out.println(x);

        int m=7;
        m %=5;//        m=m%5;
        System.out.println(m);
    }

}
