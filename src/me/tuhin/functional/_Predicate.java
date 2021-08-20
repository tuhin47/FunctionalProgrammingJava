package me.tuhin.functional;

import java.util.function.Predicate;

public class _Predicate {

    static Predicate<String> isValidPhoneNumber = phone -> phone.startsWith("0") && phone.length() == 5;

    static Predicate<String> containsNumber3 = phone -> phone.contains("3");

    public static void main(String[] args) {

        System.err.println(Predicate.class);
        System.out.println(isValidPhoneNumber.test("01234"));
        System.out.println(isValidPhoneNumber.test("31234"));

        System.out.println("01234 :" + isValidPhoneNumber.and(containsNumber3).test("01234"));
        System.out.println("01244 :" + isValidPhoneNumber.and(containsNumber3).test("01244"));

    }
}
