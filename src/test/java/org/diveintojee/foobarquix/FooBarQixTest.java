/*
 *
 */
package org.diveintojee.foobarquix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author louis.gueye@gmail.com
 */
public class FooBarQixTest {

    @Test
    public void fooBarQixOnNumber101ShouldReturn101() {
        final FooBarQix fooBarQix = new FooBarQix(101);
        assertEquals("101", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber10ShouldReturnBar() {
        final FooBarQix fooBarQix = new FooBarQix(10);
        assertEquals("Bar", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber13ShouldReturnFoo() {
        final FooBarQix fooBarQix = new FooBarQix(13);
        assertEquals("Foo", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber15ShouldReturnFooBarBar() {
        final FooBarQix fooBarQix = new FooBarQix(15);
        assertEquals("FooBarBar", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber1ShouldReturn1() {
        final FooBarQix fooBarQix = new FooBarQix(1);
        assertEquals("1", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber2ShouldReturn2() {
        final FooBarQix fooBarQix = new FooBarQix(2);
        assertEquals("2", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber33ShouldReturnFooFooFoo() {
        final FooBarQix fooBarQix = new FooBarQix(33);
        assertEquals("FooFooFoo", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber3ShouldReturnFooFoo() {
        final FooBarQix fooBarQix = new FooBarQix(3);
        assertEquals("FooFoo", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber4ShouldReturn4() {
        final FooBarQix fooBarQix = new FooBarQix(4);
        assertEquals("4", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber51ShouldReturnFooBar() {
        final FooBarQix fooBarQix = new FooBarQix(51);
        assertEquals("FooBar", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber53ShouldReturnBarFoo() {
        final FooBarQix fooBarQix = new FooBarQix(53);
        assertEquals("BarFoo", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber55ShouldReturnBarBarBar() {
        final FooBarQix fooBarQix = new FooBarQix(55);
        assertEquals("BarBarBar", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber5ShouldReturnBarBar() {
        final FooBarQix fooBarQix = new FooBarQix(5);
        assertEquals("BarBar", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber6ShouldReturnFoo() {
        final FooBarQix fooBarQix = new FooBarQix(6);
        assertEquals("Foo", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber77ShouldReturnQixQixQix() {
        final FooBarQix fooBarQix = new FooBarQix(77);
        assertEquals("QixQixQix", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber7ShouldReturnQixQix() {
        final FooBarQix fooBarQix = new FooBarQix(7);
        assertEquals("QixQix", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber8ShouldReturn8() {
        final FooBarQix fooBarQix = new FooBarQix(8);
        assertEquals("8", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumber9ShouldReturnFoo() {
        final FooBarQix fooBarQix = new FooBarQix(9);
        assertEquals("Foo", fooBarQix.toString());
    }

    @Test
    public void fooBarQixOnNumberMinusOneShouldReturnMinusOne() {
        final FooBarQix fooBarQix = new FooBarQix(-1);
        assertEquals("-1", fooBarQix.toString());
    }
}
