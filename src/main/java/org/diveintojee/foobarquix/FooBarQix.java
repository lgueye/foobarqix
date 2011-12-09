/*
 *
 */
package org.diveintojee.foobarquix;

import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;

/**
 * @author louis.gueye@gmail.com
 */
public class FooBarQix {

    public static void main(final String[] args) {

        for (int index = 1; index < 101; index++) {

            System.out.println(new FooBarQix(index));

        }

    }

    private final int input;

    private final StringBuilder output = new StringBuilder();

    private static Map<Integer, String> encodings;

    static {

        encodings = new TreeMap<Integer, String>();

        encodings.put(3, "Foo");

        encodings.put(5, "Bar");

        encodings.put(7, "Qix");

    }

    /**
     * @param i
     */
    public FooBarQix(final int i) {
        input = i;
    }

    /**
     * @return
     */
    public FooBarQix applyContainsRule() {

        if (!checkPreconditions())
            return this;

        final String inputAsString = String.valueOf(input);

        for (int i = 0; i < inputAsString.length(); i++) {

            final char digit = inputAsString.charAt(i);

            final String digitAsString = String.valueOf(digit);

            final Integer key = Integer.valueOf(digitAsString);

            if (encodings.keySet().contains(key)) {

                output.append(encodings.get(key));

            }

        }

        return this;

    }

    /**
     * @return
     */
    public FooBarQix applyDivisibleRule() {

        if (!checkPreconditions())
            return this;

        for (final Integer key : encodings.keySet()) {

            if (input % key == 0) {

                output.append(encodings.get(key));

            }

        }

        return this;
    }

    /**
     * @return
     */
    public String build() {

        if (StringUtils.isEmpty(output.toString()))
            return String.valueOf(input);

        return output.toString();

    }

    private boolean checkPreconditions() {

        if (input < 1 || input > 100)
            return false;

        return true;

    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {

        return applyDivisibleRule().applyContainsRule().build();

    }
}
