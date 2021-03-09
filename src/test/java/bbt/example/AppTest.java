package bbt.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{


    private VerifyIsPrime objVerifyIsPrime;
    @Before
    public void setup()
    {
        objVerifyIsPrime = new VerifyIsPrime();
    }

    @Test
    public void test_TC_1_EC() {
        try
        {
            boolean nIsPrime = objVerifyIsPrime.isPrime(5);
            assertTrue(nIsPrime);
        }
        catch (MyValueException e) {
            System.out.println(e.toString());
        }
    }


    @Test
    public void test_TC_2_EC(){
        try
        {
            assertFalse(objVerifyIsPrime.isPrime(14));
        }
        catch(MyValueException e)
        {
            System.out.println(e.toString());
        }
    }
    @Test
    public void test_TC_3_EC()
    {
        try
        {
            assertFalse(objVerifyIsPrime.isPrime(-5));
        }
        catch(MyValueException e)
        {
            assertEquals("data not valid", e.getMessage());
        }
    }

    @Test(expected = bbt.example.MyValueException.class)
    public void test_TC_3_EC_or() throws MyValueException
    {
        objVerifyIsPrime.isPrime(-5);
    }

    @Test
    public void test_TC_1_BVA()
    {
        try
        {
            assertFalse(objVerifyIsPrime.isPrime(0));
        }
        catch(MyValueException e)
        {
            System.out.println(e.toString());
        }
    }
    @Test
    public void test_TC_2_BVA()
    {
        try
        {								//MAX_VALUE = 2147483647 -prime
            assertTrue( objVerifyIsPrime.isPrime(Integer.MAX_VALUE));
        }
        catch(MyValueException e)
        {
            System.out.println(e.toString());
        }

    }
    @Test
    public void test_TC_3_BVA()
    {
        try
        {
            assertFalse( objVerifyIsPrime.isPrime(-1));
        }
        catch(MyValueException e)
        {
            //e.printStackTrace();
            assertEquals("data not valid", e.getMessage());
        }
    }
    @Test
    public void test_TC_4_BVA()
    {
        try
        {
            assertFalse( objVerifyIsPrime.isPrime(1));
        }
        catch(MyValueException e)
        {
            System.out.println(e.toString());
        }
    }

    @Test
    public void test_TC_5_BVA()
    {
        try
        {								//MAX_VALUE = 2147483647-1=2147483646  -prime
            assertFalse(objVerifyIsPrime.isPrime(Integer.MAX_VALUE-1));
        }
        catch(MyValueException e)
        {
            System.out.println(e.toString());
        }

    }
    @Ignore
    //@Test
    public void test_TC_6_BVA()
    {
        try
        {								//MAX_VALUE = 2147483647-1=2147483646  -prime
            assertFalse( objVerifyIsPrime.isPrime(Integer.MAX_VALUE+1));
        }
        catch(MyValueException e)
        {
            System.out.println(e.toString());
        }

    }
    @Test
    public void test_TC_7_special()
    {
        try
        {
            assertTrue( objVerifyIsPrime.isPrime(5));
        }
        catch(MyValueException e)
        {
            System.out.println(e.toString());
        }
    }



    @After
    public void tearDown(){
        objVerifyIsPrime = null;
    }

    /**
     * Rigorous Test :-)
     */
   // @Test
    //public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
