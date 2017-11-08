package org.tw4j.romannumber;

import org.tw4j.romannumber.enums.TypeNumberSymbol;

public interface SymbolNumberConverter {

    TypeNumberSymbol fromDecimal(
        char symbol);

    TypeNumberSymbol fromRoman(
        int value);
}
