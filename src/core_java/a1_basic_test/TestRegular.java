package core_java.a1_basic_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegular {
    public static void main(String[] args) {
        String content = "I am noob " + "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);


        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern1 = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern1);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }

    }
}
