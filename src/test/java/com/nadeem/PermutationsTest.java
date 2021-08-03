package com.nadeem;

import org.junit.Test;

/**
 * Unit test for Permuations Program
 */
public class PermutationsTest extends Permutations
{
    /**
     * Test 1
     */
    @Test
    public void testWith2Digits()
    {
        String sInput = "*1";
        String args[] = {sInput};
        main (args);
    }
    /**
     * Test 2
     */
    @Test
    public void testWith3Digits()
    {
        String sInput = "*1*";
        String args[] = {sInput};
        main (args);
    }
    /**
     * Test 3
     */
    @Test
    public void testWith5Digits()
    {
        String sInput = "*1*1*";
        String args[] = {sInput};
        main (args);
    }
}
