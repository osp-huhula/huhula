package huhula.romannumber.enums;

public enum TypeSubtractiveNumberSymbol {
        IV(4),
        IX(9),
        XL(40),
        XC(90),
        CD(400),
        CM(900),
        ;

    private final int value;

    TypeSubtractiveNumberSymbol(
        final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean has(
        final String value) {
        for (TypeSubtractiveNumberSymbol enumm : values()) {
            if (enumm.toString().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
