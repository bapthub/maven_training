package fr.lernejo;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    Sample sample = new Sample();

    @Test
    void test_add() {
        System.out.println("Inside testOP()");
        assertEquals(2, sample.op(ADD, 1,1));
    }
    @Test
    void test_mul() {
        System.out.println("Inside testOP()");
        assertEquals(4, sample.op(MULT, 2,2));
    }
    @Test
    void testFact3() {
        System.out.println("Inside testFact()");
        assertEquals(6, sample.fact(3));
    }
    @Test
    void testFact0() {
        System.out.println("Inside testFact()");
        assertEquals(1, sample.fact(0));
    }
    @Test
    void fact_neg() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> {
            sample.fact(-2);
        });
        assertEquals("N should be positive", exception.getMessage());
    }
}
