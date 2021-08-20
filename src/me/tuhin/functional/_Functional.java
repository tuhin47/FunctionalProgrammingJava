package me.tuhin.functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Functional {

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multipleByTen = integer -> integer * 10;

    static BiFunction<Integer, Integer, Integer> incrementOneAndMultiplyBiFunction
            = (numberToIncrement, numberToMultiplyBy) -> (numberToIncrement + 1) * numberToMultiplyBy;

    public static void main(String[] args) {

        System.out.println(incrementByOneFunction.apply(32));

        Function<Integer, Integer> addBy1AndMultipleBy10 = incrementByOneFunction.andThen(multipleByTen);

        System.out.println(addBy1AndMultipleBy10.apply(2));

//        BI FUnction

        System.out.println("BI Function: " + incrementOneAndMultiplyBiFunction.apply(2, 5));

    }
}
