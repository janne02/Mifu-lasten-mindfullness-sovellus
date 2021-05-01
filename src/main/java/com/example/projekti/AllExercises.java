package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Shows AllExercises in same activity
 */
public class AllExercises extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_exercises);
        Spinner spinner = findViewById(R.id.spinnerallexerc);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dropdown, android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    /**
     * When button is pressed it returns to MeterActivity
     * @see MeterActivity
     * @param view
     */
    public void backToMeter(View view) {
        Intent badMood = new
                Intent(AllExercises.this, MeterActivity.class);
        startActivity(badMood);
    }

    /**
     * Displays Dropdownlist in right top corner
     * @see MainActivity
     * @param parent
     * @param view
     * @param position
     * @param id
     */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        if (text.equals("Vaihda käyttäjää")) {
            Intent paavalikko = new Intent(AllExercises.this, MainActivity.class);
            startActivity(paavalikko);
        } else if (text.equals("Sulje sovellus")) {
            this.finishAffinity();
        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}