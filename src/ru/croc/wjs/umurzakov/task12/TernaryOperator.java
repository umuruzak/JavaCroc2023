package ru.croc.wjs.umurzakov.task12;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class TernaryOperator {
    public static <T> T ternaryOperator(Predicate<T> predicate, Supplier<T> trueSupplier, Supplier<T> falseSupplier) {
        return predicate.test(null) ? trueSupplier.get() : falseSupplier.get();
    }
}
