package org.tw4j.romannumber.util;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public final class ToStringUtil {

    private ToStringUtil() {
        super();
        throw new IllegalStateException(getClass().toString());
    }

    public static String reflectionToString(
        final Object object) {
        ToStringStyle style = ToStringStyle.SHORT_PREFIX_STYLE;
        return ToStringBuilder.reflectionToString(object, style);
    }
}
