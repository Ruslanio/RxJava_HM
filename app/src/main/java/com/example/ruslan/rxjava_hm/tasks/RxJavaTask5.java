package com.example.ruslan.rxjava_hm.tasks;

import java.math.BigInteger;

import rx.Observable;

/**
 * Created by Ruslan on 28.05.2017.
 */

public class RxJavaTask5 {
    /**
     * TODO : you have two streams of integers of equal length
     * <p>
     * Return one stream of the same length with GCDs
     * of the original streams values
     * <p>
     * Example:
     * Stream 1 (100, 17, 63)
     * Stream 2 (15, 89, 27)
     * Result stream (5, 1, 9)
     * <p>
     * You can use {@link BigInteger#gcd(BigInteger)}
     */
    public static Observable<Integer> executeTask(Observable<Integer> dataFirst, Observable<Integer> dataSecond){
        return Observable.zip(dataFirst,dataSecond, RxJavaTask5::getGcd);
    }


    private static Integer getGcd(Integer a, Integer b) {
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
}
