package primes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimesUnitTest {

	@Test
	void primeTest1() {
		TwinPrimes tp = new TwinPrimes();
		boolean res = tp.isPrime(2);
		assertTrue(res);
	}
	
	@Test
	void primeTest2() {
		TwinPrimes tp = new TwinPrimes();
		boolean res = tp.isPrime(4);
		assertFalse(res);
	}

	@Test
	void twinPrimeTest1() {
		TwinPrimes tp = new TwinPrimes();
		boolean res = tp.areTwinPrimes(3, 5);
		assertTrue(res);
	}
	
	@Test
	void twinPrimeTest2() {
		TwinPrimes tp = new TwinPrimes();
		boolean res = tp.areTwinPrimes(13, 15);
		assertFalse(res);
	}
}
