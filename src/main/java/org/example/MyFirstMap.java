package org.example;

import java.util.Iterator;

public class MyFirstMap<K, V> implements MyMap<K, V> {

    MyList<KeyValue<K, V>> keyValues = new MyList<>();


    @Override
    public V translate(K key) {
        for (KeyValue<K, V> kv : this.keyValues) {
            if (key.equals(kv.key)) {
                return kv.value;
            }
        }
        return null;
    }

    @Override
    public MyMap<K, V> define(K key, V value) {
        Iterator<KeyValue<K, V>> iterator = this.keyValues.iterator();

        while (iterator.hasNext()){
            KeyValue<K, V> ikv = iterator.next();
            if (ikv.key.equals(key)){
                iterator.remove();
                break;
            }
        }

        this.keyValues.append(KeyValue.of(key, value));

        return this;
    }

    @Override
    public MySet<K> keySet() {
        //TODO

        MySet<K> result = GenericHashSet.of(1);

        for(KeyValue<K, V> kv : this.keyValues){
            result.add(kv.key);
        }

        return result;
    }

    @Override
    public MyList<KeyValue<K, V>> toList() {
        return this.keyValues;
    }
}
