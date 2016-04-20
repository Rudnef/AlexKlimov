package com.example.rudnef.p0501_twoscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public final static String USER = "com.example.rudnef.p0501_twoscreens.USER";

    // создаем строковые переменные
    private String gift = "Дырку от бублика";
    private String user = "Животное";
    private String from_who = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

// созданные переменные получают из интента строку по ключу
        gift = getIntent().getExtras().getString("gift");
        user = getIntent().getExtras().getString("username");
        from_who = getIntent().getExtras().getString("from_who");

        TextView tv_showText = (TextView) findViewById(R.id.tv_showText);
        tv_showText.setText(user + "\n" + "Вам передали " + gift + "\n" + "От " + from_who);
    }

    public void first(View view) {
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);

        startActivity(intent);
    }
}
