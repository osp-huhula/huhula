package org.tw4j.romannumber;

import org.tw4j.romannumber.beans.SymbolConvertable;

public interface AnySymbolConverter {

    String toSymbol(
        int number,
        Iterable<? extends SymbolConvertable> values);

    int toValue(
        String value,
        Iterable<? extends SymbolConvertable> values);
}
