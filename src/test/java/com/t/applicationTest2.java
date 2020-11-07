package com.t;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class applicationTest2 {

    @Test
    public void mytest() {
        application a=mock(application.class);
        when(a.getnumber()).thenReturn(1);
        int x=a.getnumber();
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