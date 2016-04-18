package com.example.rudnef.p0501_twoscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

    public void onSend(View view) {
        EditText et_name = (EditText) findViewById(R.id.et_name);
        EditText et_message = (EditText) findViewById(R.id.et_message);
        EditText et_from_who = (EditText) findViewById(R.id.et_from_who);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        // если вьюха не равна нулю присваиваем интенту с ключем, значение
        // далее стартуем интент
        if (et_name != null ) {
            intent.putExtra("username", et_name.getText().toString());
        }

        assert et_message != null;
        intent.putExtra("gift", et_message.getText().toString());

        assert et_from_who != null;
        intent.putExtra("from_who", et_from_who.getText().toString());
        startActivity(intent);
    }
}
