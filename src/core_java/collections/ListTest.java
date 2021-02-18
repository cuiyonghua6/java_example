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

/*
package com.company;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

```
List和Array的相互转换
```java
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // List转为Array有3种方法
        // 第一种是调用toArray()方法直接返回一个Object[]数组,这种方法会丢失类型信息，所以实际应用很少
        List<String> list = List.of("apple", "pear", "banana");
        Object[] array = list.toArray();
        for (Object s : array) {
            System.out.println(s);
        }

        // 第二种方式是给toArray(T[])传入一个类型相同的Array，List内部自动把元素复制到传入的Array中
        // 注意到这个toArray(T[])方法的泛型参数<T>并不是List接口定义的泛型参数<E>
        // 所以，我们实际上可以传入其他类型的数组，例如我们传入Number类型的数组，返回的仍然是Number类型：
        // 最常用的是传入一个“恰好”大小的数组：Integer[] array = list.toArray(new Integer[list.size()]);
        // 对只读List调用add()、remove()方法会抛出UnsupportedOperationException。
        List<Integer> list1 = List.of(12, 34, 56);
        Number[] array1 = list1.toArray(new Number[3]);
        for (Number n : array1) {
            System.out.println(n);
        }

        // 最后一种更简洁的写法是通过List接口定义的T[] toArray(IntFunction<T[]> generator)方法：
        // Integer[] array = list.toArray(Integer[]::new);

    }
}
 */