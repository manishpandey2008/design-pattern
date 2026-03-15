package com.java17;

interface Shape{
}

class Circle implements Shape{}
class Rectangle implements Shape{}
interface Car {
    public  String name = "BMW";
    void setName(String name);
}

record EvCar() implements Car{
    @Override
    public void setName(String name) {
        name=name;
    }
}


public class Java17Test {

//    static String format(Shape shape) {
////        return switch (shape) {
////            case Circle c   -> "Circle";
////            case Rectangle r -> "Rectangle";
////        };
//    }

    public static void main(String[] args) {
        Object name="manish";
        if(name instanceof String s){
            System.out.println(s);
        }

        Car car=new EvCar();
        car.setName("HI");
        System.out.println(car);
    }
}
