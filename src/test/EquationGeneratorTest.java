package test;

import main.EquationGenerator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationGeneratorTest {
    EquationGenerator gen;
    @BeforeEach
    void makeGen() {
        gen = new EquationGenerator(0);
    }

    @Test
    void solve() {
    }

    @Test
    void generateOpsLength() {
        StringBuilder s = new StringBuilder();
        gen.generateOps(new char[] {'0', '0', '0', '0', 'x', 'x', 'x'}, s);
        assertEquals(27, s.toString().length());
    }

    @Test
    void equalsGoal() {
        assertFalse(gen.equalsGoal("0 0 0 1 + + +"));
        assertTrue(gen.equalsGoal("0 0 0 0 + + +"));
    }
}