package core_java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        // List内部的元素可以重复,还允许添加null
        List<String> list = new ArrayList<>();
        list.add("apple"); // size=1
        list.add("pear"); // size=2
        list.add(null);
        list.add("apple"); // 允许重复添加元素，size=3
        System.out.println(list.size());

        // 还可以通过List接口提供的of()方法，根据给定元素快速创建List
        // 但是List.of()方法不接受null值，如果传入null，会抛出NullPointerException异常
        // 如果我们调用List.of()，它返回的是一个只读List：
        // 通过Iterator遍历List永远是最高效的方式
        List<String> list1 = List.of("apple", "pear", "banana");
        for (Iterator<String> it = list1.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
        for (String s : list1) {
            System.out.println(s);
        }

    }
}
