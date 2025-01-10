package practiceAssignments.forLoopAssignments_5;

public class ForLoopPrograms {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1;i<=3; i++){ //i=1-3
            for (int j = 1; j<=2; j++){ //j=1-2
                if ((i*j)%2 == 0) { //1%2,2%2; 2%2,4%2; 3%2, 6%2
                    result += "*";//('A'+1+1)***; ('A'+1+1)***('A'+3+1)*
                } else {
                    result += (char)('A'+i+j); //('A'+1+1);('A'+1+1)***('A'+3+1)
                }
            }
        }
        System.out.println(result);//C***E*

        String str = "Java";
        for (int i = 0;i<str.length();i++) { //i=0-3, len = 3
            for (int j = i; j<str.length();j++) { //j=0-3, 1-3, 2-3
                if ((i+j)%2==0) { //0%2,1%2,2%2,3%2; 2%2,3%2,4%2; 4%2,5%2; 6%2;
                    System.out.println(str.charAt(i));
                } else {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();//J,a,J,a,a,v,a,v,a,a
        }

        int x = 5;
        int y = 10;
        for (int i =1;i<=4;i++) {
            if((x+y)%i==0) {
                x += i*2;
            } else if (i%2==0) {
                y -= i*3;
            }else {
                x += y/i;
            }
        }
        System.out.println("x = "+x+" Y = "+y);

        int result1 = 0;
        for (int i =1; i<=5;i++) { // i=1-5
            if ((i*2+3)%4==0) { //5%4;7%4;9%4;11%4;13%4
                result1 += i*i;
            } else if (i%2 == 0) { //i=2,4
                result1 -= i; //res = 0;res = 2
            } else {
                result1 += i*2; //i=1,3,5; res=2,6,12
            }
        }
        System.out.println(result1);//12

        String result2 = "";
        for (int i=1;i<=3;i++) { //i=1-3
            result2 += (i*2); //res2=2,24,246
            if (result2.length()>2) { //246
                result2 = new StringBuilder(result2).reverse().toString();
            }
        }
        System.out.println(result2);//642

        String result3 = "";
        for (int i=1; i<=4; i++) { //i=1-4
            int value = (i*5+3)/2; //4, 6, 9, 11
            if (value%3 == 0) {
                result3 += "X"; //
            } else if (value%4 == 0) {
                result3 += "Y";
            } else {
                result3 +=value; //res=
            }
        }
        System.out.println(result3);//YXX11
    }
}
