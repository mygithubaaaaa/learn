package collection;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:ArrayListLearn
 * Author:  Liu pan 刘攀
 * Date:    2022/8/17 22:12
 */

public class ArrayListLearn {
    public static void main(String[] args) {
        /**
         * 默认初始化大小为10，增长时每次变为原来的1.5倍，增长时每次都会申请新的数组并复制
         * 在预知要保存的元素数量时，可以使用ArrayList(int capacity)构造方法，指定数组的容量
         */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

    @Test
    public void testGrow(){
        ArrayList<Integer> list = new ArrayList<>();
//        list.ensureCapacity(1000000);
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    @Test
    public void testGrow2(){

        ArrayList<Integer> list = new ArrayList<>(1000000);
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }


}
