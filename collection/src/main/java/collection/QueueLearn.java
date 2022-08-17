package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Copyright(C),2021-2022,Liupan 刘攀
 * FileName:QueueLearn
 * Author:  Liu pan 刘攀
 * Date:    2022/8/18 1:06
 */
public class QueueLearn {

    @Test
    public void testDeque(){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.addFirst(2);
        deque.offer(3);
        deque.offerFirst(4);
        deque.stream().forEach(System.out::println);
    }
}
