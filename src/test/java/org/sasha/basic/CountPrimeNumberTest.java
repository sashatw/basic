package org.sasha.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountPrimeNumberTest {

  @Test
  public void testGetSolution() throws Exception {
    int actual1 = new CountPrimeNumber().getSolution(2);
    assertEquals(0, actual1);

    int actual2 = new CountPrimeNumber().getSolution(11);
    assertEquals(4, actual2);

    int actual3 = new CountPrimeNumber().getSolution(15);
    assertEquals(6, actual3);
  }


  @Test(expected = Exception.class)
  public void testGetSolution_invalidNumber() throws Exception {
    new CountPrimeNumber().getSolution(-1);
  }


}
