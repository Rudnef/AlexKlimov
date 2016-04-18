package com.example.rudnef.p0501_twoscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Toast.makeText(this, "Привет", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void onSecond(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
