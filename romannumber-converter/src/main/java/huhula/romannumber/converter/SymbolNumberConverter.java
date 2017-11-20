package huhula.romannumber.converter;

import huhula.romannumber.enums.TypeNumberSymbol;

public interface SymbolNumberConverter {

    TypeNumberSymbol fromDecimal(
        char symbol);

    TypeNumberSymbol fromRoman(
        int value);
}
