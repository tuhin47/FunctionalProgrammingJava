package me.tuhin.optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {

        Object value = Optional.ofNullable(null)
//                .orElseGet(() -> "Default value");
                .or(()-> Optional.of("HoHO"));

        System.out.println(value);

    }
}
