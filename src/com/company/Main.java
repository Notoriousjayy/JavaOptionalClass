package com.company;

import java.util.Optional;

/**
 * Demonstrates several Optional<T> methods
 * **/
public class Main {

    public static void main(String[] args) {

        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFGHIJ");

        if (noVal.isPresent()){
            System.out.println(("This won't be displayed"));
        }
        else{
            System.out.println("noVal has no value");
        }

        if(hasVal.isPresent()){
            System.out.println("The string in hasVal is: " +hasVal.get());
        }

        String defStr = noVal.orElse("Defauly String");
        System.out.println(defStr);
    }
}
