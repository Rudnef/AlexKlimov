package com.example.rudnef.p0602_catcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private int catCount = 0;

    TextView tv_cat_count;
    Button btn_cat_count;
    private static final String KEY_COUNT = "COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_cat_count = (TextView) findViewById(R.id.tv_cat_count);
        btn_cat_count = (Button) findViewById(R.id.btn_cat_count);
        btn_cat_count.setOnClickListener(this);

        if (savedInstanceState != null){
            catCount = savedInstanceState.getInt(KEY_COUNT, 0);
            tv_cat_count.setText("я насчитал " + catCount + " котов");
        }

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, catCount);
    }

    @Override
    public void onClick(View v) {
        tv_cat_count.setText("я насчитал " + ++catCount + " котов");

    }
}
