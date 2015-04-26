package com.franbaena;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * http://tutorials.jenkov.com/java-unit-testing/asserts.html
 * Unit test for simple App.
 */
public class PointTest 
    extends TestCase{
        protected Point p, p2;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */

    public PointTest( String testName ){
        super( testName );
    }


    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( PointTest.class );
    }

    public void setUp(){
        p = new Point(2,3);
        p2 = new Point(5,7);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        assertTrue( p.toString().equals("(2,3)") );
        assertTrue( p.distance(p2) == 5 );
    }
}
