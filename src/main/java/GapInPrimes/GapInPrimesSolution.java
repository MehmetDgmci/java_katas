package GapInPrimes;

public class GapInPrimesSolution {
    public static long[] gap(int g, long m, long n) {
        long prime1 = 0;
        long prime2 = 1;
        for (long i = m; i <= n; i++) {
            if (isPrime(i) && (prime1 != prime2)) {
                prime1 = prime2;
                prime2 = i;
                if (isPrime(prime2 + g) && prime2 + g <= n && isNextPrime(prime2, prime2 + g)) {
                    return new long[]{prime2, prime2 + g};
                }
            }
        }
        return null;
    }

    public static boolean isNextPrime(long firstPrime, long scndPrime) {
        for (long i = firstPrime + 1; i < scndPrime; i++) {
            if (isPrime(i))
                return false;
        }
        return true;

    }

    public static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
