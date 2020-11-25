package com.t;



//输入一个数字，求出其各位之和
public class application {
    public  int getnumber(int x) {
        return x;

    }
    public   boolean IsNumber(String s){
       return  true;
    }
    public int  caculate(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;

        }
        if (IsNumber("5"))
        {
            return sum;
    }
        return -1;
    }
}
