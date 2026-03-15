package com.collectionPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class CollectionTesting3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Emp> emps=List.of(
                new Emp("Pandey",700234.0,38, "IT","M"),
                new Emp("Manish",400234.0,26,"IT","M"),
                new Emp("Balmukund",2988765.0,32,"PRODUCT","M"),
                new Emp("Suprbha",5627365.0,32,"QA","F"),
                new Emp("Nihal",600234.0,32,"PRODUCT","M"),
                new Emp("Shilpi",67355.0,32,"PM","F"),
                new Emp("Sunita",78765.0,32,"QA","F")
        );

        ExecutorService executorService= Executors.newFixedThreadPool(2);
//        executorService.execute(()->{
//            System.out.println("Hi");
//        });

        CompletableFuture.supplyAsync(()->{
            return "Hello";
        }).thenApply((a)->{
            return a+" MANISH";
        }).whenComplete((a,b)-> System.out.println(a));


        ExecutorService executor = Executors.newFixedThreadPool(2);

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 10, executor)
                .thenApplyAsync(n -> {
                    System.out.println("Multiply thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    }catch (Exception ex){}
                    return n * 2;
                }, executor)
                .thenApplyAsync(n -> {
                    System.out.println("Add thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    }catch (Exception ex){}
                    return n + 5;

                }, executor);

        System.out.println(future.get()); // Output: 25
        executor.shutdown();




//        Optional<Emp> emp= emps.stream().filter(e->e.getGender().equals("F"))
//                .sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
//                .skip(1)
//                .findFirst();
//        System.out.println(emp.get().getName());
//       List<Optional<Emp>> list=emps.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary))))
//               .values().stream().toList();
//       for (Optional<Emp> e: list){
//           System.out.println(e.get());
//       }
//        Map<String,Double> sum=emps.stream().collect(Collectors.groupingBy(Emp::getGender,Collectors.averagingDouble(Emp::getSalary)));
//        System.out.println(sum);


    }
}
