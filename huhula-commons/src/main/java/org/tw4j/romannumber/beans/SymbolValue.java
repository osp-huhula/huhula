package org.tw4j.romannumber.beans;

public class SymbolValue {

    private int result;

    public boolean add(
        final int value) {
        return addResult(value);
    }

    private boolean addResult(
        final int value) {
        result = result + value;
        return true;
    }

    public int getResutl() {
        return result;
    }
}
