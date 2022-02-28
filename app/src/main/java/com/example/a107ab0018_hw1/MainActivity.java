package com.example.a107ab0018_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        Log.v(LOG_TAG, "VVVVVVVVVVVV");
        Log.d(LOG_TAG, "DDDDDDDDDDDD");
        Log.i(LOG_TAG, "IIIIIIIIIIII");
        Log.w(LOG_TAG, "WWWWWWWWWWWW");
        Log.e(LOG_TAG, "EEEEEEEEEEEE");
    }
}