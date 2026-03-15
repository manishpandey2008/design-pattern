package com;

import java.util.Date;
import java.util.Objects;

class Car implements Cloneable{
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj==null || getClass() != obj.getClass())return false;

        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car=new Car("BMW");
        Car car1= (Car) car.clone();
    }
}
