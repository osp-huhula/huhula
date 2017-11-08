package org.tw4j.romannumber.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.tw4j.romannumber.beans.SymbolConvertable;

public enum TypeRomanNumeral
    implements
    SymbolConvertable {
        I(1),
        IV(4),
        V(5),
        IX(9),
        X(10),
        XL(40),
        L(50),
        XC(90),
        C(100),
        CD(400),
        D(500),
        CM(900),
        M(1000),;

    private final int value;

    TypeRomanNumeral(
        final int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    public static boolean has(
        final String value) {
        for (TypeRomanNumeral enumm : values()) {
            if (enumm.toString().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static TypeRomanNumeral valueOf(
        final char value) {
        return valueOf(String.valueOf(value));
    }

    public static TypeRomanNumeral valueOf(
        final long value) {
        for (TypeRomanNumeral enumm : values()) {
            if (enumm.getValue() == value) {
                return enumm;
            }
        }
        throw new IllegalArgumentException(String.valueOf(value));
    }

    public static List<TypeRomanNumeral> getOrdenedList() {
        List<TypeRomanNumeral> result = Arrays.asList(values());
        Collections.sort(result, new TypeRomanNumeralComparator());
        return result;
    }

    @Override
    public String getSymbol() {
        return toString();
    }
}

class TypeRomanNumeralComparator implements Comparator<TypeRomanNumeral> {

	@Override
	public int compare(TypeRomanNumeral o1, TypeRomanNumeral o2) {
		return Integer.valueOf(o2.getValue()).compareTo(Integer.valueOf(o1.getValue()));
	}

}