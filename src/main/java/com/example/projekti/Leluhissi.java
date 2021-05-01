package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Exercise for Negative mood named Leluhissi
 */
public class Leluhissi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leluhissi);
    }
    /**
     * Returns back to MeterActivity when wants to change the mood
     * @see MeterActivity
     * @param view
     */
    //you can leave the exercise and choose another one with different mood
    public void vaihtoTeht(View view) {
        Intent goMeter = new
                Intent(Leluhissi.this, MeterActivity.class);
        startActivity(goMeter);
    }
}