package huhula.symbolnumber.converter;

import huhula.symbolnumber.beans.SymbolConvertable;

public interface AnySymbolConverter {

    String toSymbol(
        int number,
        Iterable<? extends SymbolConvertable> values);

    int toValue(
        String value,
        Iterable<? extends SymbolConvertable> values);
}
