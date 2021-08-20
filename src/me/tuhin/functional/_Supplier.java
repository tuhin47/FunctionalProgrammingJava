package me.tuhin.functional;

import java.util.function.Supplier;

public class _Supplier {

    static Supplier<String> getDBSupplier = () -> "DB_SUPPLIER";

    public static void main(String[] args) {
        System.err.println(Supplier.class);
        System.out.println(getDBSupplier.get());
    }
}
