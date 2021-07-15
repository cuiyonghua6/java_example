package core_java.a3_various_centence;

public class OperaterTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        //int b = ++a; 拆分运算过程为: a=a+1=4; b=a=4, 最后结果为b=4,a=4
        //int d = --c; 拆分运算过程为: c=c-1=2; d=c=2, 最后结果为d=2,c=2
        int a1 = 3;//定义一个变量；
        int b1 = ++a1;//自增运算
        int c1 = 3;
        int d1 = --c1;//自减运算
        System.out.println("进行自增运算后的值等于"+b1);
        System.out.println("进行自减运算后的值等于"+d1);

        //前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
        //后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算 实例：
        int a2 = 5;//定义一个变量；
        int b2 = 5;
        int x2 = 2*++a2;
        int y2 = 2*b2++;
        System.out.println("自增运算符前缀运算后a="+a2+",x="+x2);
        System.out.println("自增运算符后缀运算后b="+b2+",y="+y2);

        //关系运算符
        int a3 = 10;
        int b3 = 20;
        System.out.println("a3 == b3 = " + (a3 == b3) );
        System.out.println("a3 != b3 = " + (a3 != b3) );
        System.out.println("a3 > b3 = " + (a3 > b3) );
        System.out.println("a3 < b3 = " + (a3 < b3) );
        System.out.println("b3 >= a3 = " + (b3 >= a3) );
        System.out.println("b3 <= a3 = " + (b3 <= a3) );

        //位运算符
        int a4 = 60; /* 60 = 0011 1100 */
        int b4 = 13; /* 13 = 0000 1101 */
        int c4 = 0;
        c4 = a4 & b4;       /* 12 = 0000 1100 */
        System.out.println("a4 & b4 = " + c4 );
        c4 = a4 | b4;       /* 61 = 0011 1101 */
        System.out.println("a4 | b4 = " + c4 );
        c4 = a4 ^ b4;       /* 49 = 0011 0001 */
        System.out.println("a4 ^ b4 = " + c4 );
        c4 = ~a4;          /*-61 = 1100 0011 */
        System.out.println("~a4 = " + c4 );
        c4 = a4 << 2;     /* 240 = 1111 0000 */
        System.out.println("a4 << 2 = " + c4 );
        c4 = a4 >> 2;     /* 15 = 1111 */
        System.out.println("a4 >> 2  = " + c4 );
        c4 = a4 >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a4 >>> 2 = " + c4 );

        //逻辑运算符
        boolean a5 = true;
        boolean b5 = false;
        System.out.println("a5 && b5 = " + (a5&&b5));
        System.out.println("a5 || b5 = " + (a5||b5) );
        System.out.println("!(a5 && b5) = " + !(a5 && b5));

        //条件运算符也被称为三元运算符
        int a6 , b6;
        a6 = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b6 = (a6 == 1) ? 20 : 30;
        System.out.println( "Value of b6 is : " +  b6 );
        // 如果 a6 等于 10 成立，则设置 b6 为 20，否则为 30
        b6 = (a6 == 10) ? 20 : 30;
        System.out.println( "Value of b6 is : " + b6 );

        //instanceof 运算符
        OperaterTest a7 = new OperaterTest();
        boolean result =  a7 instanceof OperaterTest;
        System.out.println( result);

    }
}
