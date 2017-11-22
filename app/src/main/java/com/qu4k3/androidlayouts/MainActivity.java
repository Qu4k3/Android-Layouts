package com.qu4k3.androidlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.linear);
        setContentView(R.layout.relative);
        //setContentView(R.layout.constraint);
    }
}
