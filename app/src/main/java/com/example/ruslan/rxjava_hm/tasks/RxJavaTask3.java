package com.example.ruslan.rxjava_hm.tasks;

import java.util.List;

import rx.Observable;

/**
 * Created by Ruslan on 28.05.2017.
 */

public class RxJavaTask3 {
    /**
     * TODO :
     * Sum all elements from observable and return observable with this single sum
     * <p>
     * Example:
     * Input stream (1, 2, 3, 4, 5)
     * Result stream (15)
     * <p>
     * Find suitable operator for this task using Google
     */
    public static Observable<Integer> executeTask(Observable<Integer> data){
        return data.reduce((val1,val2) -> val1 + val2);
    }
}
