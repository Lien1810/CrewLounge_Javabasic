package javabasic.Collection;

import java.util.*;

public class LearnCollection {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("PHP"); //List cho lưu trùng
        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("PHP");
        linkedList.add("Python");
        linkedList.add("Java");
        linkedList.add("C++");
        System.out.println("Các phần tử của LinkedList");
        System.out.print("\t" + linkedList + "\n");

        Set<Integer> hashSet = new HashSet<>(); //HashSet không lưu theo thứ tự
        hashSet.add(3);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(1);
        System.out.println("Các phần tử của HashSet");
        System.out.println("\t" + hashSet +"\n");

        Set<Integer> treeSet = new TreeSet<>(); //TreeSet sắp xếp theo thứ tự tăng dần
        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(10);     //set ko luu giá trị trùng
        treeSet.stream().sorted();
        System.out.println("Các phần tử của TreeSet");
        System.out.println("\t" + treeSet +"\n");

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("project","Bank");
        stringMap.put("company","Viettel");
        System.out.println(stringMap);
        System.out.println(stringMap.get("company"));
    }
}
