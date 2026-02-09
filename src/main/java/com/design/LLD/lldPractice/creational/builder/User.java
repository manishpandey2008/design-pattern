package com.design.LLD.lldPractice.creational.builder;

// Lots of optional fields — constructor would be a mess. Builder keeps it readable.
public class User {
    private final String name;
    private final String email;
    private final int age;
    private final boolean active;

    private User(Builder b) {
        this.name = b.name;
        this.email = b.email;
        this.age = b.age;
        this.active = b.active;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String email;
        private int age;
        private boolean active = true;

        public Builder name(String name) { this.name = name; return this; }
        public Builder email(String email) { this.email = email; return this; }
        public Builder age(int age) { this.age = age; return this; }
        public Builder active(boolean active) { this.active = active; return this; }

        public User build() {
            if (name == null) throw new IllegalStateException("name required");
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return name + " (" + email + ") age=" + age + " active=" + active;
    }
}
