package org.sasha.basic;

/**
 * Question 1:
 * Given a positive number n, count the number of prime numbers less than that.
 */
public class CountPrimeNumber {

  public int getSolution(int number) throws Exception {

    if (number < 0) {
      throw new Exception("invalid number: " + number);
    }

    boolean[] notPrime = new boolean[number];
    int count = 0;

    for (int i = 2; i < number; i++) {
      if (!notPrime[i]) {
        count++;
        for (int j = 2; i * j < number; j++) {
          notPrime[i * j] = true;
        }
      }
    }

    return count;
  }

}
