package org.tw4j.romannumber;

import org.tw4j.romannumber.beans.SymbolConvertable;
import org.tw4j.romannumber.beans.SymbolValue;

public final class DefaultAnySymbolConverter
    implements
    AnySymbolConverter {

    @Override
    public String toSymbol(
        final int number,
        final Iterable<? extends SymbolConvertable> values) {
        StringBuilder result = new StringBuilder();
        int actual = number;
        for (SymbolConvertable each : values) {
            while (actual >= each.getValue()) {
                result.append(each.getSymbol());
                actual = actual - each.getValue();
            }
        }
        return result.toString();
    }

    @Override
    public int toValue(
        final String value,
        final Iterable<? extends SymbolConvertable> values) {
        SymbolValue result = new SymbolValue();
        char[] array = value.toCharArray();
        for (int index = 0; index < array.length; index = index + 1) {
            if (index + 1 < array.length) {
                String actual = String.valueOf(array[index]);
                String next = String.valueOf(array[index + 1]);
                String sybolm = actual.concat(next);
                if (contains(values, sybolm)) {
                    index = index + 1;
                    result.add(get(values, sybolm));
                } else {
                    result.add(toValue(String.valueOf(array[index]), values));
                }
            } else {
                result.add(get(values, String.valueOf(array[index])));
            }
        }
        return result.getResutl();
    }

    private int get(
        final Iterable<? extends SymbolConvertable> values,
        final String value) {
        for (SymbolConvertable o : values) {
            if (o.getSymbol().equals(value)) {
                return o.getValue();
            }
        }
        throw new IllegalArgumentException(value);
    }

    private boolean contains(
        final Iterable<? extends SymbolConvertable> values,
        final String sybolm) {
        for (SymbolConvertable o : values) {
            if (o.getSymbol().equals(sybolm)) {
                return true;
            }
        }
        return false;
    }
}
