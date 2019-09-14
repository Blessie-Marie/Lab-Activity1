package com.soriano.myustapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Portals extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portals);
    }

    public void displayUSTWeb(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.ust.edu.ph"));
        startActivity(i);

    }

    public void displayMyUste(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.myuste.ust.edu.ph"));
        startActivity(i);

    }

    public void displayBlackboard(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.ust.blackboard.com"));
        startActivity(i);

    }

}
