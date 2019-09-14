package com.soriano.myustapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPortals(View v){
        Intent i = new Intent(this, Portals.class);
        startActivity(i);
    }

    public void displayHello(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        for(int i =0;i<10;i++){
            Log.d("Portals", "Hello" + " " + (i+1));
        }
    }
}
