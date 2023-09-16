package org.math;

public class Main {
    public static void main(String[] args) {
       int result =  Math.round(1.1F);
       System.out.println(result); // 1: round a floating point number to a whole number
        result = (int)Math.ceil(1.1F); // 2: returns the smallest int that is greater than or equal to its param, in this case 1.1, so it returns 2
        result = (int)Math.floor(1.1F);// 1: return the largest int that is smaller or equal to its param
        result = Math.max(1, 2);// or min
        double result1 = Math.random();// we can't cast this value because random() returns values between 0 and 1 so if we casting it to int, it returns 0 everytime
        result1 = Math.random() * 100;// returns numbers between 0 and 100
    }
}