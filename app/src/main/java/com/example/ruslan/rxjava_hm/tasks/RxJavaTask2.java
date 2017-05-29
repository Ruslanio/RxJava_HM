package com.example.ruslan.rxjava_hm.tasks;


import rx.Observable;

/**
 * Created by Ruslan on 28.05.2017.
 */

public class RxJavaTask2 {
    /**
     * TODO:
     * <p>
     * Method takes observable of strings as a parameter
     * <p>
     * Supply all elements until you meet word END in the stream (END word should be excluded)
     * After that remove all repeated values from the stream
     */
    public static Observable<String> executeTask(Observable<String> data){
        return data
                .takeWhile(value -> !value.equals("END"))
                .distinct();
    }
}
