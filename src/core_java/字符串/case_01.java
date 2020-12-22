package core_java.字符串;

public class case_01 {
    public static void main(String[] args) {

        // 定义
        String s = "Hello!";
        String sa = new String(new char[] {'H', 'e', 'l', 'l', 'o', '!'});

        // 两个字符串比较，必须总是使用equals()方法。
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        // 是否包含子串:
        System.out.println("是否包含子串：" + s1.contains("ll")); // true
        // 搜索子串
        System.out.println(s1.indexOf('l')); // 2
        System.out.println(s1.lastIndexOf('l')); // 3
        System.out.println(s1.startsWith("he")); // true
        System.out.println(s1.endsWith("lo")); // true

        // 提取子串的例子：
        System.out.println("Hello".substring(2)); // "llo"
        System.out.println("Hello".substring(2, 4)); //"ll"

        // 去除首尾空白字符
        System.out.println("  \tHello\r\n ".trim()); // "Hello"
        System.out.println("".isEmpty());

        // 替换子串
        String replaceSub = "hello";
        String rep = replaceSub.replace('l', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        System.out.println(rep);
        replaceSub.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
        // 另一种是通过正则表达式替
        String s3 = "A,,B;C ,D";
        s3.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"

        // 分割字符串
        String s4 = "A,B,C,D";
        String[] ss = s4.split("\\,"); // {"A", "B", "C", "D"}
        System.out.println(ss[1]);

        // 拼接字符串
        String[] arr = {"A", "B", "C"};
        String s5 = String.join("***", arr); // "A***B***C"
        System.out.println(s5);


        //类型转换
        // 把任意基本类型或引用类型转换为字符串
        String.valueOf(123); // "123"
        // 把字符串转换为其他类型，就需要根据情况
        int n1 = Integer.parseInt("123"); // 123
        boolean b1 = Boolean.parseBoolean("true"); // true

        // String和char[]类型可以互相转换
        char[] cs = "Hello".toCharArray(); // String -> char[]
        String s6 = new String(cs); // char[] -> String

    }
}
