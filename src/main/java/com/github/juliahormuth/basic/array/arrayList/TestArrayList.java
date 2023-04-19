package com.github.juliahormuth.basic.array.arrayList;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Daniel");
        arrayList.add("Felipe");

        System.out.println(arrayList);

        arrayList.add(0, "Julia");

        System.out.println(arrayList);

        Boolean exists = arrayList.contains("Alexander");

        Boolean exists2 = arrayList.contains("Julia");

        System.out.println(exists);
        System.out.println(exists2);

        // 0
        String name = "Julia";
        int position = arrayList.indexOf(name);
        System.out.println(position);

        // Julia
        String element = arrayList.get(0);
        System.out.println(element);

        // Remove Obj with contend or posititon
        arrayList.remove("Julia");
        System.out.println(arrayList);
        // arrayList.remove(position);
        // System.out.println(arrayList);

        // ArrayList length
        System.out.println(arrayList.size());
    }
}
