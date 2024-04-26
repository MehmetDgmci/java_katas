package IsANumberPrime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsANumberPrimeSolutionTest {

    @Test
    public void testBasic() {
        assertFalse(IsANumberPrimeSolution.isPrime(0),"0  is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(1),"1  is not prime");
        assertTrue (IsANumberPrimeSolution.isPrime(2),"2  is prime");
        assertTrue (IsANumberPrimeSolution.isPrime(73),"73 is prime");
        assertFalse(IsANumberPrimeSolution.isPrime(75),"75 is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(-1),"-1 is not prime");
    }

    @Test
    public void testPrime() {
        assertTrue(IsANumberPrimeSolution.isPrime(3),"3 is prime");
        assertTrue(IsANumberPrimeSolution.isPrime(5),"5 is prime");
        assertTrue(IsANumberPrimeSolution.isPrime(7), "7 is prime");
        assertTrue(IsANumberPrimeSolution.isPrime(41),"41 is prime");
        assertTrue(IsANumberPrimeSolution.isPrime(5099),"5099 is prime");
    }

    @Test
    public void testNotPrime() {
        assertFalse(IsANumberPrimeSolution.isPrime(4), "4 is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(6), "6 is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(8), "8 is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(9), "9 is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(45),"45 is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(-5), "-5 is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(-8), "-8 is not prime");
        assertFalse(IsANumberPrimeSolution.isPrime(-41), "-41 is not prime");
    }

}
