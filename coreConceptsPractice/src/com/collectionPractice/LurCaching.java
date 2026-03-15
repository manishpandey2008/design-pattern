package com.collectionPractice;

import java.util.*;

class LurResource{
    private final Map<String, Object> map=new HashMap<>();
    private final LinkedList<String> keys=new LinkedList<>();
    private final int size=10;

    public void addCache(String key,Object val){
        map.put(key,val);
        keys.addFirst(key);
    }

    public void getCache(String key){
        map.get(key);
        keys.remove(key);
        keys.addFirst(key);
    }

    public List<String> getKeys(){
        return this.keys;
    }
}

class LurResource2<K,V>{
    private final int capacity;
    private final LinkedHashMap<K, V> map;

    LurResource2(int capacity) {
        this.capacity = capacity;
        this.map = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LurResource2.this.capacity; // remove LRU if capacity exceeded
            }
        };
    }

    public V get(K key){
        return map.get(key);
    }

    public void put(K key, V val){
        map.put(key,val);
    }

}
public class LurCaching {
    public static void main(String[] args) {
        LurResource lurResource=new LurResource();
        lurResource.addCache("key1","Value 1");
        lurResource.addCache("key2","Value 2");
        lurResource.addCache("key3","Value 3");

        lurResource.getCache("key1");
        lurResource.getKeys().forEach(System.out::println);

    }
}
