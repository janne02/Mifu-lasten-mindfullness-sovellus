package com.example.projekti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;

import androidx.annotation.Nullable;

/**
 * idea taken from https://www.youtube.com/watch?v=fn5OlqQuOCk
 * Displays window in MeterActivity with information about project, authors and date.
 */
public class AboutActivity extends Activity {
    //Shows window in MeterActivity with information about project, authors and date.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.aboutwindow);

        DisplayMetrics dMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dMetrics);

        int width = dMetrics.widthPixels;
        int height = dMetrics.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .6));

    }
}

