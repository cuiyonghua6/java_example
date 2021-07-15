package core_java.a1_basic_test;

public class Test_String {
    public static void main(String[] args) {
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println( helloString );

        //字符串长度
        String site = "www.runoob.com";
        int len = site.length();
        System.out.println( "菜鸟教程网址长度 : " + len );

        //连接字符串
        String string1 = "菜鸟教程网址：";
        System.out.println("1、" + string1 + "www.runoob.com");

        //格式化字符串
//        String fs;
//        fs = String.format("浮点型变量的值为 " +
//                "%f, 整型变量的值为 " +
//                " %d, 字符串变量的值为 " +
//                " %s", floatVar, intVar, stringVar);
    }
}
