package com;

interface Interface1{
    default void fun1(){
        System.out.println("Pandey");
    }
}

interface Interface2{
    void fun1();
}



public class InterfaceTest implements Interface1, Interface2{
    public static void main(String[] args) {
        InterfaceTest interfaceTest=new InterfaceTest();
        interfaceTest.fun1();
    }

    @Override
    public void fun1() {
        System.out.println("Manish");
    }
}
