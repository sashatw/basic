package org.sasha.basic;

import java.util.HashSet;

/**
 * Question 2:
 * Given an array of numbers, check whether this array contains duplicate numbers. The numbers are all integers.
 */
public class CheckNumber {

  public boolean isDuplicateNumbers(int[] numbers) {
    HashSet<Integer> set = new HashSet<>();
    for (int number : numbers) {
      if (!set.add(number)) return true;
    }
    return false;
  }

}
