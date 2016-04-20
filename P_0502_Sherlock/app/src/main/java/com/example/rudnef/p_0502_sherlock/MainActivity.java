package com.example.rudnef.p_0502_sherlock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int CHOOSE_THIEF = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, ChooseActivity.class);
        startActivityForResult(intent, CHOOSE_THIEF);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView tv_who_trie = (TextView) findViewById(R.id.tv_who_trie);

        if (requestCode == CHOOSE_THIEF){
            if (resultCode == RESULT_OK){
                String thiefname = data.getStringExtra(ChooseActivity.THIEF);
                tv_who_trie.setText(thiefname);
            } else {
                tv_who_trie.setText("");
            }
        }
    }
}
