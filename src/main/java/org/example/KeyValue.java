package org.example;
// good class practice
public class KeyValue<K, V> {
    // fields final
    final K key;
    final V value;

    // constructor
    private KeyValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // static factory
    public static <K, V> KeyValue<K, V> of(K key, V value){
        return new KeyValue<>(key, value);
    }
}
