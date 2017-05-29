package com.example.ruslan.rxjava_hm.tasks;


import java.util.List;

import rx.Observable;

/**
 * Created by Ruslan on 28.05.2017.
 */

public class RxJavaTask1 {
    /**
     * TODO : implement this method
     * <p>
     * This method takes list of strings and creates an observable of integers,
     * that represents length of strings which contains letter 'r' (or 'R')
     * <p>
     * Example:
     * Input list: ("Vasya", "Dima", "Artur", "Petya", "Roma")
     * Result stream: (5, 4)
     */

    public static Observable<Integer> executeTask(List<String> data) {
        return Observable
                .from(data).filter(value -> value.toLowerCase().contains("r"))
                .flatMap(value -> {
                    return Observable.just(value.length());
                });
    }
}

