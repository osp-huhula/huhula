package huhula.romannumber.converter;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import huhula.romannumber.enums.TypeNumberSymbol;

public final class DefaultSymbolNumberConverterTest {

    private DefaultSymbolNumberConverter instance;

    @Before
    public void setUp() {
        instance = new DefaultSymbolNumberConverter();
    }

    @Test
    public void converterAnyValue() {
        Assert.assertEquals(TypeNumberSymbol.I, instance.fromDecimal('I'));
    }

    @Test(
        expected = IllegalArgumentException.class)
    public void converterInexesistentValue() {
        instance.fromDecimal('A');
        Assert.fail();
    }
}
