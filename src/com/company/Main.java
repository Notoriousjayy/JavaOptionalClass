package com.company;

import java.util.Optional;

/**
 * Demonstrates several Optional<T> methods
 * **/
public class Main {

    public static void main(String[] args) {

        Optional<String> noVal = Optional.empty();

        Optional<String> hasVal = Optional.of("ABCDEFGHIJ");

        /**.
         * boolean isPresent()
         * Returns true if the invoking object contains a value
         * Returns false if no value is present
         * **/

        if (noVal.isPresent()){
            System.out.println(("This won't be displayed"));
        }

        else{
            System.out.println("noVal has no value");
        }

        if(hasVal.isPresent()){
            System.out.println("The string in hasVal is: " +hasVal.get());
        }

        /**
         * Optional orElse(Type defaultType)
         * If the invoking object contains a value, the value is returned.
         * Otherwise, the value obtained from orElse(Type defaultValue)
         * is returned
         * **/

        String defStr = noVal.orElse("Default String");
        System.out.println(defStr);
    }
}
