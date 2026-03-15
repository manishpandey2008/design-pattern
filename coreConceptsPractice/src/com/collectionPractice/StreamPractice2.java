package com.collectionPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice2 {
    public static void main(String[] args) {
        List<Emp> emps=List.of(
                new Emp("Pandey",700234.0,38,"HR"),
                new Emp("Manish",400234.0,26,"ENG"),
                new Emp("Pandey",500234.0,29,"OPR"),
                new Emp("Pandey",500234.0,29,"ENG"),
                new Emp("Balmukund",600234.0,32,"OPR")
        );

//        List<String> res=emps.stream().filter(e->e.getSalary()>50000 && e.getAge()<30).map(Emp::getName).distinct().toList();
        List<Integer> list=List.of(1,2,3,4,5);
        int val=list.stream().reduce(0,(a,b)->a+ (b*b));

        Double avgSalary=emps.stream().map(Emp::getSalary).reduce(0.0, Double::sum);
        System.out.println(avgSalary/emps.size());


        Map<String, Optional<Emp>> maxSalaryForDepartment= emps.stream()
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.maxBy(Comparator.comparing(Emp::getSalary))));
        System.out.println(maxSalaryForDepartment);


        List<List<Emp>> mapList=List.of(
                List.of(new Emp("Pandey",700234.0,38,"HR"),new Emp("Manish",400234.0,26,"ENG")),
                List.of(new Emp("Pandey",500234.0,29,"OPR"),
                        new Emp("Pandey",500234.0,29,"ENG"),
                        new Emp("Balmukund",600234.0,32,"OPR"))
        );

        emps= mapList.stream().flatMap(Collection::stream).toList();

        List<Emp> uniqueList= emps.stream().collect(Collectors.toMap(Emp::getName, Function.identity(),(e, r)->e))
                .values().stream().toList();
        System.out.println(uniqueList);

        int[] arr={1,1,1,2,2,3};
        List<Integer> finalList=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>=2).map(Map.Entry::getKey).toList();
        System.out.println(finalList);

        char[] chars={'a','b','b','d','e','c','d','a'};
        LinkedHashMap<Character,Integer> linkedHashMap=new LinkedHashMap<>();

        Optional<Character> c=new String(chars).chars().mapToObj(e->(char) e)
                .collect(
                        Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())
                )
                .entrySet()
                .stream().filter(e->e.getValue()==1)
                .map(e->e.getKey()).findFirst();

        c.ifPresent(System.out::println);

//        for(char c: chars){
//            if(linkedHashMap.containsKey(c)){
//                linkedHashMap.put(c,linkedHashMap.get(c)+1);
//            }else {
//                linkedHashMap.put(c,0);
//            }
//        }
//        var x=linkedHashMap.entrySet().stream().filter(e->e.getValue()==1).findFirst();
//        System.out.println(x);
        int[] testArr={2,1,5,4,5,3,7};

//                    {1,2,5,4,5,3,7}


        int sum=Arrays.stream(testArr).boxed().reduce(0,Integer::sum);
//        28
        System.out.println(sum);
    }
}
