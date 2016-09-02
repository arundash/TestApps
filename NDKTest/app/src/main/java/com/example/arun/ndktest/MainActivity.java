package com.example.arun.ndktest;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewtoshow;

    public native String hello();
    static {
        System.loadLibrary("ndktest");
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewtoshow=(TextView) findViewById(R.id.textViewtoshow);
        textViewtoshow.setText(hello());

    }
}
