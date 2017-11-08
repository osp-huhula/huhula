package org.tw4j.romannumber;

import org.tw4j.romannumber.enums.TypeRomanNumeral;

public final class DefaultRomanNumberConverter {

    private final AnySymbolConverter converter;

    public DefaultRomanNumberConverter(
        final AnySymbolConverter converter) {
        super();
        this.converter = converter;
    }

    public int toDecimal(
        final String value) {
        return converter.toValue(value, TypeRomanNumeral.getOrdenedList());
    }

    public String toRoman(
        final int number) {
        return converter.toSymbol(number, TypeRomanNumeral.getOrdenedList());
    }
}
