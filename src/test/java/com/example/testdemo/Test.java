package com.example.testdemo;


import java.util.*;

public class Test {

    @org.junit.jupiter.api.Test
    public void test01() {

        Set set = new LinkedHashSet();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);

    }

    @org.junit.jupiter.api.Test
    public void test02(){


        Map map = new HashMap();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key1", "newValue");
        System.out.println(map);

    }

    @org.junit.jupiter.api.Test
    public void test03(){

        Hashtable hashtable = new Hashtable();
        for (int i = 1; i <= 9; i++) {
            hashtable.put(i, i);
        }

    }

    @org.junit.jupiter.api.Test
    public void test04(){

        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo(((String)o2));
            }
        });


    }

    @org.junit.jupiter.api.Test
    public void test05(){
        System.out.println("test second git");
        System.out.println("test second git3");
        System.out.println("test second git4");
        System.out.println("master test");
        System.out.println("hot-fix test");

        System.out.println("push test");
        System.out.println("pull test");

    }



}
