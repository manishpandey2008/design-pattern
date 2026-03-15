package com.pattern;

interface Car{
    double getPrice();
}

class BasePrice implements Car{
    @Override
    public double getPrice() {
        return 1000;
    }
}

class AddAc implements Car{
    private final Car car;
    AddAc(Car car){
        this.car = car;
    }

    @Override
    public double getPrice() {
        return this.car.getPrice()+200;
    }
}

class AddLight implements Car{
    private final Car car;

    AddLight(Car car) {
        this.car = car;
    }

    @Override
    public double getPrice() {
        return this.car.getPrice()+300;
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        Car car=new BasePrice();
        car = new AddAc(car);
        car= new AddLight(car);
        System.out.println(car.getPrice());
    }
}