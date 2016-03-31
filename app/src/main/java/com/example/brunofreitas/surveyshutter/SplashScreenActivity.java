package com.example.brunofreitas.surveyshutter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }

    Intent intent;

    /** Called when the user clicks the Skip button */
    public void startProjectListActivity(View view) {
        intent = new Intent(this, ProjectListActivity.class);
        startActivity(intent);
    }
}
