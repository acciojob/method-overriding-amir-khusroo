package com.driver.test;

import com.driver.A;
import com.driver.B;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases {

    @Test
    public void testClassA() {
        A objA = new A();
        String expectedOutput = "Invoking method from class A";
        assertEquals(expectedOutput, objA.meth());
    }

    @Test
    public void testClassB() {
        B objB = new B();
        String expectedOutput = "Method is overridden in Extended class B";
        assertEquals(expectedOutput, objB.meth());
    }
}