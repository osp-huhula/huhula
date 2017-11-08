package org.tw4j.romannumber;

import org.tw4j.romannumber.enums.TypeNumberSymbol;

public final class DefaultSymbolNumberConverter
    implements
    SymbolNumberConverter {

    @Override
    public TypeNumberSymbol fromDecimal(
        final char value) {
        return TypeNumberSymbol.valueOf(String.valueOf(value));
    }

    @Override
    public TypeNumberSymbol fromRoman(
        final int value) {
        return TypeNumberSymbol.fromValue(value);
    }
}
