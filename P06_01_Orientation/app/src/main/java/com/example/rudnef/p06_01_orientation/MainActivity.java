package com.example.rudnef.p06_01_orientation;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_new_text;
    private String mOrientation = "";
    private Button btn_4;
    static final String ORIENTATION_PORTRAIT = "Портретный режим";
    static final String ORIENTATION_LANDSCAPE = "Альбомный режим";

    boolean mState = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); //запускает в альбомной ориентации
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);// запускает в портретной ориентации
        // эти варианты не желательны, лучше прописывать в манифесте

        et_new_text = (EditText) findViewById(R.id.et_new_text);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setText(ORIENTATION_PORTRAIT);
    }

    private String getStringOrientation() {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
            return "портретная ориентация";
        else if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            return "альбомная ориентация";
        else
            return "";
    }

    public void showOrientation(View view) {
        et_new_text.setText(getStringOrientation());
    }

    private String isLandscapeMode(Activity activity) {
        int width =
                activity.getWindowManager().getDefaultDisplay().getWidth();
        int height = activity.getWindowManager().getDefaultDisplay().getHeight();
        boolean isLanscape = width > height;
        if (isLanscape) {
            mOrientation = "Альбомная";
        } else
            mOrientation = "Портретная!";
        return mOrientation;
    }

    public void showOrientation1(View view) {
        et_new_text.setText(isLandscapeMode(MainActivity.this));
    }

    private String getRotateOrientation() {
        int rotate = getWindowManager().getDefaultDisplay().getRotation();
        switch (rotate) {
            case Surface.ROTATION_0:
                return "не поворачивали";
            case Surface.ROTATION_90:
                return "повернули на 90˚";
            case Surface.ROTATION_180:
                return "повернули на 180˚";
            case Surface.ROTATION_270:
                return "повернули на 90˚ против часовой стрелки";
            default:
                return "не понятно";
        }
    }

    public void showRotation(View view) {
        et_new_text.setText(getRotateOrientation());
    }

    public void OnRotate(View view) {
        // state FALSE: переключаемся на LANDSCAPE
        if (!mState) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            btn_4.setText(ORIENTATION_PORTRAIT);
            // state TRUE: переключаемся на PORTRAIT
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            btn_4.setText(ORIENTATION_LANDSCAPE);
        }
        mState = !mState;
    }
}
