package com.udacity.gradle.ferfig.gradlejokeandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class JokeLibActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_lib);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent receivedIntent = getIntent();
        if (receivedIntent!=null) {
            if (!(receivedIntent.hasExtra("JOKE"))) {
                Toast.makeText(getApplicationContext(), "No joke provided!", Toast.LENGTH_SHORT).show();
                finish();
            }
        }else{
            Toast.makeText(getApplicationContext(), "No joke provided!", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

}
