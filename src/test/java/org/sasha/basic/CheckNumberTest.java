package org.sasha.basic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumberTest {

  @Test
  public void testIsDuplicateNumbers_true() {
    int[] numbers1 = new int[]{1, 1, 2};
    boolean actual1 = new CheckNumber().isDuplicateNumbers(numbers1);
    assertTrue(actual1);

    int[] numbers2 = new int[]{0, 2, 2, 4};
    boolean actual2 = new CheckNumber().isDuplicateNumbers(numbers2);
    assertTrue(actual2);

    int[] numbers3 = new int[]{1, 0, 2, 1};
    boolean actual3 = new CheckNumber().isDuplicateNumbers(numbers3);
    assertTrue(actual3);
  }


  @Test
  public void testIsDuplicateNumbers_false() {
    int[] numbers1 = new int[]{0, -1, 1, 2};
    boolean actual1 = new CheckNumber().isDuplicateNumbers(numbers1);
    assertFalse(actual1);

    int[] numbers2 = new int[]{0, -3, 2};
    boolean actual2 = new CheckNumber().isDuplicateNumbers(numbers2);
    assertFalse(actual2);

    int[] numbers3 = new int[]{0, -3, 2};
    boolean actual3 = new CheckNumber().isDuplicateNumbers(numbers3);
    assertFalse(actual3);
  }

}
