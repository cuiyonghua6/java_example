package core_java.oracle;

import java.io.DataInputStream;

public class StringTest {
    public static void main(String[] args){
        System.out.println("计算第一个字符串在第二个字符串中出现的次数。");
        DataInputStream din = new DataInputStream(System.in);
        try{
            System.out.println("请输入第一个字符串");
            String str1 = din.readLine();
            System.out.println("请输入第二个字符串");
            String str2 = din.readLine();
            String str3 = str2.replace(str1,"");
            int count = (str2.length() - str3.length())/str1.length();
            System.out.println(str1+"在"+str2+"中出现的次数为："+count);
        }catch(Exception e){
            System.out.println(e.toString());
        }

    }
}