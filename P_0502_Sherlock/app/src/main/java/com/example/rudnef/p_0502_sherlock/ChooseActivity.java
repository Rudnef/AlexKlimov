package com.example.rudnef.p_0502_sherlock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {

    public static final String THIEF = "rudnef.p_0502_sherlock.THIEF";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void onRadioClick(View view) {
        Intent answerIntent = new Intent();
        switch (view.getId()){
            case R.id.rb_cat:
                answerIntent.putExtra(THIEF, "Лошадь Прижевальского");
                break;
            case R.id.rb_crow:
                answerIntent.putExtra(THIEF, "Ворона");
                break;
            case R.id.rb_dog:
                answerIntent.putExtra(THIEF, "Сраный песик");
                break;
            default:
                break;
        }
        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
