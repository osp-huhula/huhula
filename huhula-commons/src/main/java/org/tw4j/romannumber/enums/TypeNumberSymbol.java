package org.tw4j.romannumber.enums;

import org.tw4j.romannumber.beans.SymbolConvertable;

public enum TypeNumberSymbol
    implements
    SymbolConvertable {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000),;

    private final int value;

    TypeNumberSymbol(
        final int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    public static boolean has(
        final int value) {
        for (TypeNumberSymbol enumm : values()) {
            if (enumm.getValue() == value) {
                return true;
            }
        }
        return false;
    }

    public static TypeNumberSymbol fromValue(
        final int value) {
        for (TypeNumberSymbol enumm : values()) {
            if (enumm.getValue() == value) {
                return enumm;
            }
        }
        throw new IllegalArgumentException(String.valueOf(value));
    }

    @Override
    public String getSymbol() {
        return toString();
    }
}
