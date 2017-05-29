package com.example.ruslan.rxjava_hm.tasks;

import rx.Observable;

/**
 * Created by Ruslan on 28.05.2017.
 */

public class RxJavaTask4 {
    /**
     * TODO :
     * <p>
     * Method takes boolean stream of single boolean value
     * and two numbers streams
     * <p>
     * If boolean value in stream it true, then you should choose first stream of number,
     * in other case - second
     * <p>
     * If result stream has any number greater than 99, your observable should finish with error
     * <p>
     * Examples:
     * Input boolean stream: (true)
     * First input stream: (5, 19, 12)
     * Second input stream: (9, 210, 87)
     * Result stream: (5, 19, 12)
     * <p>
     * Input boolean stream: (false)
     * First input stream: (5, 19, 12)
     * Second input stream: (9, 210, 87)
     * Result stream: (9, Exception)
     */
    public static Observable<Integer> executeTask(Observable<Boolean> flag,
                                                  Observable<Integer> dataFirst,
                                                  Observable<Integer> dataSecond) {
        return flag.flatMap(value -> {
            if (value) {
                return dataFirst;
            } else {
                return dataSecond;
            }
        }).flatMap(value -> {
            if (value <= 99){
                return Observable.just(value);
            } else {
                throw new IllegalArgumentException("more than 99");
            }
        });
    }
}
