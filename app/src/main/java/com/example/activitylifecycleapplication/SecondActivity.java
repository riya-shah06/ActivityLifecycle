package com.example.activitylifecycleapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity{

    Button red;
    Button green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("lifecycle update", "Second: onCreate");
        red = findViewById(R.id.red_btn);
        green = findViewById(R.id.green_btn);

//        TitleFragment titleFragment = new TitleFragment();
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.add(titleFragment, "TitleFragment");
//        fragmentTransaction.commit();

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Red fragment displayed", Toast.LENGTH_SHORT).show();
                changeFragment(view);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Green Fragment displayed", Toast.LENGTH_SHORT).show();
                changeFragment(view);
            }
        });

    }


    public void changeFragment(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment;
        if(view.getId() == R.id.red_btn){
            fragment = new RedFragment();
            fragmentTransaction.replace(R.id.fragment_ll, fragment);
        }else if(view.getId() == R.id.green_btn){
            fragment = new GreenFragment();
            fragmentTransaction.replace(R.id.fragment_ll, fragment);
        }
//        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

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

}
