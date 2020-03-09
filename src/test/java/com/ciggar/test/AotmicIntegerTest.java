package com.ciggar.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: jia.xue
 * @create: 2020-02-28 20:59
 * @Description
 **/
public class AotmicIntegerTest {

    private volatile AtomicInteger atomicInteger = new AtomicInteger(0);
    @Test
    public void test01(){

        atomicInteger.incrementAndGet();
        int count = atomicInteger.get();
        System.out.println(count);

        ArrayList<Object> list = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        try {

        }finally {
        }

        countDownLatch.countDown();

    }
}