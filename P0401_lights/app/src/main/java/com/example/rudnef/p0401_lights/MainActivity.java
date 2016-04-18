package com.example.rudnef.p0401_lights;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button btn_green;
    private Button btn_yellow;
    private Button btn_red;

    private RelativeLayout rl_1;
    private TextView tv_color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl_1 = (RelativeLayout) findViewById(R.id.rl_1);
        tv_color = (TextView) findViewById(R.id.tv_color);
        btn_yellow = (Button) findViewById(R.id.btn_yellow);
        btn_red = (Button) findViewById(R.id.btn_red);
        btn_green = (Button) findViewById(R.id.btn_green);

        btn_red.setOnClickListener(this);
        btn_yellow.setOnClickListener(this);
        btn_green.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_red:
                rl_1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                tv_color.setText(R.string.red);
                break;
            case R.id.btn_yellow:
                rl_1.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                tv_color.setText(R.string.yellow);
                break;
            case R.id.btn_green:
                rl_1.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                tv_color.setText(R.string.green);
        }
    }
}