package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtviewmsg2 = findViewById(R.id.tvmsg2);

        txtviewmsg2.setText(R.string.Msg2);

        Log.i( "Lifecycle" , "OnCreate called..");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Lifecycle","OnCreate() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("Lifecycle","OnCreate() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","OnCreate() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","OnCreate() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","OnCreate() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","OnCreate() invoked");
    }

}