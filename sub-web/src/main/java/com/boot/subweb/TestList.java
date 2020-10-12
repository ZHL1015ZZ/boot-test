package com.boot.subweb;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ZHL
 * @Date 2020/10/10 15:30
 * @Description:
 */
public class TestList {


    /*public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<>(16) ;
        Map<String,Object> map1 = new HashMap<>(16);
        map1.put("key1", "val1");
        Map<String,Object> map2 = new HashMap<>(16);
        map2.put("key1", "val1");
        list.add(map1);
        list.add(map2);
        //打印list里面的数据
        list.forEach(System.out::println);

        ArrayList<Map<String, Object>> data = list.stream().collect(
                Collectors.collectingAndThen(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(m -> m.get("key1").toString()))), ArrayList::new));
        System.out.println("=======去重前后分界线=======");
        //打印过滤后的数据
        data.forEach(System.out::println);
    }*/

    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<>(16) ;
        Map<String,Object> map1 = new HashMap<>(16);
        map1.put("key1", "val1");
        Map<String,Object> map2 = new HashMap<>(16);
        map2.put("key1", "val1");
        list.add(map1);
        list.add(map2);
        //打印list里面的数据
       // list.forEach(System.out::println);

        /*ArrayList<Map<String, Object>> data = list.stream().collect(
                Collectors.collectingAndThen(Collectors.toCollection(
                        () -> new TreeSet<>(Comparator.comparing(m -> m.get("key1").toString()))), ArrayList::new));
        System.out.println("=======去重前后分界线=======");
        //打印过滤后的数据
        data.forEach(System.out::println);*/
        int size = list.size()>2? 1:list.size();
        list.subList(0,size).forEach(System.out::println);


    }

}

