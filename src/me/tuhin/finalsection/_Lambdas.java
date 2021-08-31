package me.tuhin.finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCase = name -> {
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        System.out.println(upperCase.apply("Tada"));



        BiFunction<String, Integer,String> nameUpperAge = (name, age) -> {
            if (name.isBlank() && age < 10) {
                throw new IllegalArgumentException("Invalid");
            }
            return name.toUpperCase() + ":" + age;
        };

        System.out.println(nameUpperAge.apply("Tada", 1));
    }


}
