import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    Math math = new Math();

    @org.junit.jupiter.api.Test
    void SignIsInputNumberNull() {
        int x = 0;
        int in = 0;
        assertEquals(x, math.sign(in));
    }

    @org.junit.jupiter.api.Test
    void SignIsInputNumberPositive() {
        int x = 1;
        int in = 100;
        assertEquals(x, math.sign(in));
    }

    @org.junit.jupiter.api.Test
    void SignIsInputNumberNegative() {
        int x = -1;
        int in = -100;
        assertEquals(x, math.sign(in));
    }

    @org.junit.jupiter.api.Test
    void FactInputNumberValidTest() {
        assertTrue(math.fact(0) == 1);
        assertTrue(math.fact(1) == 1);
        assertTrue(math.fact(5) == 120);
        assertTrue(math.fact(4) == 24);
    }

    @org.junit.jupiter.api.Test
    void FactInputNumberMoreThirdteeen() {
        int x = 1;
        int in = 15;
        assertEquals(x, math.sign(in));
    }

    @org.junit.jupiter.api.Test
    void FactInputNumberNotNegative() {
        int x = -1;
        int in = -100;
        assertEquals(x, math.sign(in));
    }
}