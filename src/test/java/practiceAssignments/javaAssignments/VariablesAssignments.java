package practiceAssignments.javaAssignments;

public class VariablesAssignments {
    public static void main(String[] args) {
        int a1 = 15, b1 = 6, c1 = 3, d1 = 10;
        System.out.println(((a1+b1)*(c1-d1))+(b1*c1)-(a1%d1)+(b1/c1)); //-132

        int a2 = 10, b2 = 5;
        System.out.println(a2+b2*2);//20

        int x1 = 8, y1 = 3;
        System.out.println((x1+y1)*2);//22

        int p = 12, q = 4;
        System.out.println(p-q+q*3);//20

        double m = 7.5, n =2.5;
        System.out.println(m/n+n);//5.5

        int a3 = 6, b3 = 3, c3 = 2;
        System.out.println(a3+b3*c3-a3/c3); //9

        int total = 100, discount = 20;
        System.out.println(total-discount/2); //90

        int x2 = 10, y2 = 5;
        System.out.println((x2-y2)*(x2+y2)); //75

        int a4 = 5, b4 = 2, c4 =3;
        System.out.println(a4 * b4 + c4 - a4/b4); //11

        int a5 = 15, b5 = 5;
        System.out.println(a5/b5*(b5+3));//24

        int a6 = 8, b6 = 4, c6 = 2;
        System.out.println(a6/b6+c6*(b6-c6)); //6

        int a7 = 20, b7=4;
        System.out.println(a7-b7*3+(b7*2)); //16

        int x3 = 4, y3 = 6, z3 = 2;
        System.out.println(x3 + y3*z3 - x3*z3);//8

        double a8 = 5.0, b8 = 2.0;
        System.out.println(a8 * b8 + (a8 - b8)/b8);//11.5

        int a9 = 3, b9 = 9;
        System.out.println(a9 * (b9/a9) + b9%a9); //9

        int m1 = 21, n1 = 9, o1 = 4, p1 = 6;
        System.out.println(((m1+n1) * (o1%p1))-(((n1*p1)/m1)+(o1+p1)));//108

        int x4 = 9, y4 = 2;
        System.out.println(x4*(y4+1)-y4);//25

        int a10 = 15, b10 = 3, c10 = 7, d10 = 4, e10 = 2;
        int res = a10 + (b10*c10) - (d10/e10) + (a10 % b10);
        System.out.print("The result of the BODMAS operation is: "+res);//34
    }
}
