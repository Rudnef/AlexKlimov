package com.example.rudnef.p0501_twoscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acrivity_about);
    }

    public void onClick1(View view) {
        Intent intent = new Intent(AboutActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
