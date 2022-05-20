package org.example;

import org.junit.jupiter.api.Test;

public class MyMapTest {

    @Test
    public void something() {

        String[] myArray = {"hello", "world", "hello", "moon", "goodnight", "moon"};

        MyMap<String, Integer> wordCounter = new MyFirstMap<>();


        for (String word : myArray) {
            Integer wordCount = wordCounter.translate(word);
            if (wordCount == null) {
                wordCounter.define(word, 1);
            } else {
                wordCounter.define(word, wordCount + 1);
            }
        }

        for (KeyValue<String, Integer> kv : wordCounter.toList()){
            System.out.println(kv.key + " : " + kv.value);
        }



//        for (String key : wordCounter.keySet()){
//            System.out.println(key + " : " + wordCounter.translate(key));
//        }

    }

}
