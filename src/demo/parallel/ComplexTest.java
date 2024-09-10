package demo.parallel;

import demo.parallel.Complex;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testPlus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex expected = new Complex(4, 6);

        Complex result = a.plus(b);

        assertEquals(expected.getRe(), result.getRe(), 0.0001);
        assertEquals(expected.getIm(), result.getIm(), 0.0001);
    }

    @Test
    public void testMinus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex expected = new Complex(-2, -2);

        Complex result = a.minus(b);

        assertEquals(expected.getRe(), result.getRe(), 0.0001);
        assertEquals(expected.getIm(), result.getIm(), 0.0001);
    }

    @Test
    public void testTimes() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex expected = new Complex(-5, 10);

        Complex result = a.times(b);

        assertEquals(expected.getRe(), result.getRe(), 0.0001);
        assertEquals(expected.getIm(), result.getIm(), 0.0001);
    }

    @Test
    public void testDiv() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex expected = new Complex(0.44, 0.08);

        Complex result = a.div(b);

        assertEquals(expected.getRe(), result.getRe(), 0.0001);
        assertEquals(expected.getIm(), result.getIm(), 0.0001);
    }

    @Test
    public void testPow() {
        Complex a = new Complex(1, 2);
        Complex expected = new Complex(-3, 4);

        Complex result = a.pow(2);

        assertEquals(expected.getRe(), result.getRe(), 0.0001);
        assertEquals(expected.getIm(), result.getIm(), 0.0001);
    }

    @Test
    public void testLengthSQ() {
        Complex a = new Complex(3, 4);
        double expected = 25;

        double result = a.lengthSQ();

        assertEquals(expected, result, 0.0001);
    }
}
