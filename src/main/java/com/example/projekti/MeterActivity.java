package com.example.projekti;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MeterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);

        Button aboutPopup = (Button) findViewById(R.id.about);

        aboutPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MeterActivity.this, AboutActivity.class));
            }
        });
    }

    /**
     * Opens the allexercises activity
     * @see AllExercises
     * @param view
     */
    //you chose allexercises so we open allexercises activity
    public void allExercises(View view) {
        Intent allexercises = new Intent(MeterActivity.this, AllExercises.class);
        startActivity(allexercises);
    }
    /**
     * Opens the MoodPositive activity
     * @see MoodPositive
     * @param view
     */
    //you chose positive feeling so we open positive activity
    public void MoodPositive(View view) {
        Intent goodMood = new Intent(MeterActivity.this, MoodPositive.class);
        startActivity(goodMood);
    }
    /**
     * Opens the MoodNegative activity
     * @see MoodNegative
     * @param view
     */
    //you chose negative feeling so we open negative activity
    public void MoodNegative(View view) {
        Intent badMood = new
                Intent(MeterActivity.this, MoodNegative.class);
        startActivity(badMood);
    }
    /**
     * Opens the MoodNeutral activity
     * @see MoodNeutral
     * @param view
     */
    //you chose neutral feeling so we open neutral activity
    public void MoodNeutral(View view) {
        Intent goBack = new
                Intent(MeterActivity.this, MoodNeutral.class);
        startActivity(goBack);
    }
    /**
     * Opens the AboutActivity activity
     * @see AboutActivity
     * @param view
     */
    //Opens activity with more information about the app
    public void openAboutActivity(View view) {
        Intent sovellustiedot = new
                Intent(MeterActivity.this, AboutActivity.class);
        startActivity(sovellustiedot);
    }
    /**
     * Opens the ViewListContents activity
     * @see ViewListContents
     * @param view
     */
    // Opens ViewList activity which has all the users from the SQLLITE database as a listview
    public void ViewListContents(View view) {
        Intent tiedot = new
                Intent(MeterActivity.this, ViewListContents.class);
        startActivity(tiedot);
    }
}