package com.t;
import  org.apache.commons.lang.NumberUtils;
import java.util.Scanner;

//输入一个数字，求出其各位之和
public class application {
    public  int getnumber() {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字\n");
        int x=sc.nextInt();
        return x;

    }
    public   boolean IsNumber(String s){
       return  NumberUtils.isNumber(s);
    }
    public int  caculate(int x) {
        int sum = 0;
        while (x > 0) {
            sum -= x % 10;
            x = x / 10;

        }
        if (IsNumber("5"))
        {
            return sum;
    }
        return -1;
    }
}
