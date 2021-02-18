package core_java.collections;

import java.util.List;

public class ListToArray {
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
//        Integer[] array2 = list.toArray(Integer[]::new);

    }
}
