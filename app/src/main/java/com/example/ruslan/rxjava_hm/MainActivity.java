package com.example.ruslan.rxjava_hm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ruslan.rxjava_hm.tasks.RxJavaTask1;
import com.example.ruslan.rxjava_hm.tasks.RxJavaTask2;
import com.example.ruslan.rxjava_hm.tasks.RxJavaTask3;
import com.example.ruslan.rxjava_hm.tasks.RxJavaTask4;
import com.example.ruslan.rxjava_hm.tasks.RxJavaTask5;
import com.example.ruslan.rxjava_hm.tasks.RxJavaTask6;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "RX_JAVA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //"Vasya", "Dima", "Artur", "Petya", "Roma"
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasya");
        names.add("Dima");
        names.add("Artur");
        names.add("Petya");
        names.add("Roma");
        RxJavaTask1.executeTask(names)
                .map(String::valueOf)
                .subscribe(value -> Log.i(TAG, value));

        names.add("END");
        names.add("Roma");
        RxJavaTask2.executeTask(Observable.from(names))
                .subscribe(value -> Log.i(TAG,value));

        RxJavaTask3.executeTask(Observable.just(1, 2, 3, 4, 5,6))
                .map(String::valueOf)
                .subscribe(value -> Log.i(TAG,value));


        RxJavaTask4.executeTask(Observable.just(true),Observable.just(1,3,4,5),Observable.just(13,77,2132,0))
                .map(String::valueOf)
                .subscribe(value -> Log.i(TAG,value));


        RxJavaTask5.executeTask(Observable.just(100,17,63),Observable.just(15,89,27))
                .map(String::valueOf)
                .subscribe(value -> Log.i(TAG,value));

        RxJavaTask6.executeTask().map(String::valueOf).subscribe(value -> Log.i(TAG,value));

    }
}
