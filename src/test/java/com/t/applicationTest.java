package com.t;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class applicationTest extends TestCase {

    @Test
    public void testgetnumber() {
        application a=new application();
        int x=1;
        int m=a.getnumber(x);//输入为1
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
        assertEquals(13,a.caculate(256));

    }
    public void mytest() {
        application a=mock(application.class);
        when(a.getnumber(1)).thenReturn(1);
        int x=a.getnumber(1);
        Assert.assertEquals(1,x);
        System.out.println(x);
        when(a.IsNumber("1")).thenReturn(true);
        Assert.assertEquals(true,a.IsNumber("1"));
        System.out.println(a.IsNumber("1"));
        when(a.caculate(123)).thenReturn(6);
        System.out.println("结果是"+a.caculate(123));
        Assert.assertEquals(6,a.caculate(123));
        verify(a,times(2)).caculate(123);






    }
}