package org.tw4j.romannumber.beans;

public final class CharRomanNumber {

    private final char symbol;
    private final int value;

    public CharRomanNumber(
        final char symbol,
        final int value) {
        this.symbol = symbol;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public char getSymbol() {
        return symbol;
    }
}
