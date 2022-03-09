package fr.lernejo;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;
import static fr.lernejo.Sample.Operation.MULT;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    Sample sample = new Sample();

    @Test
    public void test_add() {
        System.out.println("Inside testOP()");
        assertEquals(2, sample.op(ADD, 1,1));
    }
    @Test
    public void test_mul() {
        System.out.println("Inside testOP()");
        assertEquals(4, sample.op(MULT, 2,2));
    }
    @Test
    public void testFact3() {
        System.out.println("Inside testFact()");
        assertEquals(6, sample.fact(3));
    }
    @Test
    public void testFact0() {
        System.out.println("Inside testFact()");
        assertEquals(1, sample.fact(0));
    }
}
