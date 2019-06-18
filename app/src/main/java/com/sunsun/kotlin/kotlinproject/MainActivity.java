package com.sunsun.kotlin.kotlinproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "Test1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int sum1  = Test.INSTANCE.sum1(5,6);
        int sum2  = Test.INSTANCE.sum2(5,7);
        int sum3  = Test.INSTANCE.sum3(5,8);
         Test.INSTANCE.str1();
        Log.d(TAG,sum1+"   "+sum2+"   "+sum3+"   ");


    }
}
