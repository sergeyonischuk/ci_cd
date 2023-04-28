package ua.goit.testExcemples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathFunctionsTest {

    private final MathFunctions mathFunctions = new MathFunctions();
    @Test
    void testGetAbsNumberShouldReturnOk() {
        //given
        int value = -10;
        //when
        int actualValue = mathFunctions.getAbsNumber(value);
        //then
        int expectedValue = 10;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    void testAdd() {
        int a = 5;
        int b = 3;
        int result = mathFunctions.add(a, b);
        assertEquals(result, 8);
        assertNotEquals(result, 2);
    }

}