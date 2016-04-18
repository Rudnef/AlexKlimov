package com.example.rudnef.p0301_catcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_cat_counter;
    private Button btn_crow;
    private Button btn_hello;

    private TextView tv_showText;
    private int catCount = 0;
    private int crowCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cat_counter = (Button) findViewById(R.id.btn_cat_counter);
        btn_crow = (Button) findViewById(R.id.btn_crow);
        btn_hello = (Button) findViewById(R.id.btn_hello);

        tv_showText = (TextView) findViewById(R.id.tv_showText);

        btn_cat_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_showText.setText("Я насчитал " + ++catCount + " котов." );
            }
        });
        btn_crow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_showText.setText("Я насчитал "+ ++ crowCount + " ворон.");
            }
        });
        btn_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_showText.setText("Привет, Евгений");
            }
        });
    }
}
