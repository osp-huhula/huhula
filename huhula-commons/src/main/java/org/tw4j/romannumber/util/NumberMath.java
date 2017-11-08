package org.tw4j.romannumber.util;

import java.math.BigDecimal;

public final class NumberMath {

    private NumberMath() {
        super();
        throw new IllegalStateException();
    }

    public static Number multiply(
        final Number one,
        final Number two) {
        return toBG(one).multiply(toBG(two));
    }

    public static Number divide(
        final Number one,
        final Number two) {
        return toBG(one).divide(toBG(two));
    }

    private static BigDecimal toBG(
        final Number number) {
        return new BigDecimal(number.toString());
    }
}
