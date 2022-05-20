package org.example;

public interface MyMap<K, V> {

    // java calls this "get"
    V translate(K key);

    // java calls this "put"
    MyMap<K, V> define(K key, V value);

    MySet<K> keySet();

    MyList<KeyValue<K, V>> toList();
}
