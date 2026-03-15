package com.pattern;

public class BuilderPattern {
    private String name;
    private int age;

    private BuilderPattern(StartBuilder startBuilder) {
        this.name = startBuilder.name;
        this.age = startBuilder.age;
    }

    public static class StartBuilder{
        private String name;
        private int age;

        StartBuilder(String name){
            this.name=name;
        }
        public StartBuilder age(int age) {
            this.age = age;
            return this;
        }

        public  BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }
}
