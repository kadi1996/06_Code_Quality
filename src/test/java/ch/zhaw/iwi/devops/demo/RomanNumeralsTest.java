package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {
    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", RomanNumerals.convert(1));
    }

    @Test
    public void shouldConvert2ToII() {
        assertEquals("II", RomanNumerals.convert(2));
    }

    @Test
    public void shouldConvert4ToIV() {
        assertEquals("IV", RomanNumerals.convert(4));
    }

    @Test
    public void shouldConvert9ToIX() {
        assertEquals("IX", RomanNumerals.convert(9));
    }

    @Test
    public void shouldConvert21ToXXI() {
        assertEquals("XXI", RomanNumerals.convert(21));
    }

    @Test
    public void shouldConvert50ToL() {
        assertEquals("L", RomanNumerals.convert(50));
    }

    @Test
    public void shouldConvert100ToC() {
        assertEquals("C", RomanNumerals.convert(100));
    }

    @Test
    public void shouldConvert500ToD() {
        assertEquals("D", RomanNumerals.convert(500));
    }

    @Test
    public void shouldConvert1000ToM() {
        assertEquals("M", RomanNumerals.convert(1000));
    }

    @Test
    public void shouldConvert1999ToMCMXCIX() {
        assertEquals("MCMXCIX", RomanNumerals.convert(1999));
    }

        @Test
    public void shouldConvert40ToXL() {
        assertEquals("XL", RomanNumerals.convert(40));
    }

    @Test
    public void shouldConvert90ToXC() {
        assertEquals("XC", RomanNumerals.convert(90));
    }

 //   @Test
   // public void shouldConvert1toXC() {
     //   assertEquals("I", RomanNumerals.convert(1)); //hier war der Fehler (Ist nicht gleich XC)
    //}
}


