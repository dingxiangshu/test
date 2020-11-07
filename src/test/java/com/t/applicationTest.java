package com.t;

import junit.framework.TestCase;
import org.junit.Test;

public class applicationTest extends TestCase {

    @Test
    public void testgetnumber() {
        application a=new application();
        int x=1;
        int m=a.getnumber();//输入为1
        assertEquals(1,m);
    }

    @Test
    public void testIsNumber() {
        String x="1";
        application a=new application();
        assertTrue(a.IsNumber(x));
    }

    @Test
    public void testcaculate() {
        application a=new application();
        assertEquals(-13,a.caculate(256));

    }
}