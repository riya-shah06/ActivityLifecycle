package com.example.activitylifecycleapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("lifecycle update", "First: onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("lifecycle update","First: onStart called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("lifecycle update", "First: onRestart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("lifecycle update", "First: onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("lifecycle update", "First: onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("lifecycle update", "First: onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("lifecycle update", "First: onDestroy called");
    }

    public void gotoActivity(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void showAlert(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Don't click on text")
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        Toast.makeText(MainActivity.this, "Back to main", Toast.LENGTH_SHORT).show();
                    }
                });
        builder.show();
        Log.i("lifecycle update","alert pop up");
    }
}
