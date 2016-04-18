package com.example.rudnef.p0201_hello_kitty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_showText;
    ImageButton ib_kitty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib_kitty = (ImageButton) findViewById(R.id.ib_kitty);
        tv_showText = (TextView) findViewById(R.id.tv_showText);

        ib_kitty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_showText.setText("Hello Kitty");
            }
        });
    }
}
