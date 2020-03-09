package com.ciggar.test;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: jia.xue
 * @create: 2020-02-24 19:34
 * @Description
 **/
public class Test01 {

    @Test
    public void test01(){

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();

//        Set<Map.Entry<String, Integer>> entries = linkedHashMap.entrySet();
        Set<String> keySet = linkedHashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            Integer nextVal = linkedHashMap.get(next);
            System.out.println(nextVal);
        }

        Map map = new HashMap(11,0.75f);
        Map hashMap = Collections.synchronizedMap(map);


    }

    @Test
    public void test02(){

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future future = executorService.submit(() -> {

        });
    }
}