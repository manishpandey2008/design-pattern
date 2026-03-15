package com.collectionPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionPracticeV2 {
    public static void main(String[] args) {

        Map<String, Double> map= new java.util.HashMap<>(Map.of(
                "Manish", 20000.0,
                "Pandey", 50000.0,
                "Avinash", 60000.0,
                "Nandu", 700000.0,
                "Suprbha", 40000.0
        ));
//        map=map.entrySet().stream()
//                .sorted((a,b)->b.getValue()-a.getValue())
//                .limit(3)
//                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

//        map.replaceAll((k,v)->v>50000?v: (v*1.1));
//        System.out.println(map);

//        map=map.entrySet().stream().filter(e->e.getValue()>10000).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        List<String> stringList=List.of("Manish","Pandey","Avinash","Pandey");
        Map<String, Long> wordCount=stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(wordCount);

        List<Integer> list=List.of(2,4,5,6,2,3,4,1,23,2);
//        list= new HashSet<>(list).stream().toList();
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .keySet().stream().toList();
        System.out.println(list);


        List<Emp> emps=List.of(
                new Emp("Pandey",700234.0,38),
                new Emp("Manish",400234.0,26),
                new Emp("Pandey",500234.0,29),
                new Emp("Balmukund",600234.0,32)
        );
       emps.stream().sorted(Comparator.comparing(Emp::getName,String.CASE_INSENSITIVE_ORDER)).toList();
    }
}
