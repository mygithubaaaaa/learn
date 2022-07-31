package stream;

import java.util.Arrays;
import java.util.List;


/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:test
 * Author:  Liu pan 刘攀
 * Date:    2022/7/31 19:06
 */
public class test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("111","123","214");
        list.stream().forEach(System.out::println);
    }

    public void testForEach() {
        List<String> list = Arrays.asList("111","123","214");
        list.stream().forEach(System.out::println);
    }

    public void testFilter(){
        List<String> list = Arrays.asList("1111","123","214");
        list.stream().filter(s -> s.length() > 3).forEach(System.out::println);
    }

    public void testDistinct(){
        List<String> list = Arrays.asList("1111","1111","214","123");
        list.stream().distinct().forEach(System.out::println);
    }
}
