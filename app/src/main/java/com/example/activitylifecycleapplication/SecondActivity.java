package com.example.activitylifecycleapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends FragmentActivity{

    Button red;
    Button green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("lifecycle update", "Second: onCreate");
        red = findViewById(R.id.button2);
        green = findViewById(R.id.button3);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle update","Second: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifecycle update","Second: onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle update", "Second: onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle update", "Second: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle update","Second: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle update", "Second: onDestroy");
    }

    public void changeToRed(View v){
        findViewById(R.id.fragment).setBackgroundColor(Color.RED);
    }

    public void changeToGreen(View v){
        findViewById(R.id.fragment).setBackgroundColor(Color.GREEN);
    }
}
