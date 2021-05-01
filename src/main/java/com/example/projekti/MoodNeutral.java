package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
/**
 * MoodNeutral is intro activity for Vakoiluleikki
 */
public class MoodNeutral extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_neutral);
        Spinner spinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dropdown, android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    /**
     * Opens the Vakoiluleikki activity
     * @see Vakoiluleikki
     * @param view
     */
    //Opens next activity which is for neutral mood
    public void goButton(View view) {
        Intent goBack = new
                Intent(MoodNeutral.this, Vakoiluleikki.class);
        startActivity(goBack);
    }

    /**
     * Shows dropdownlist to choose from 2 alternatives which are Change user and Shut down app
     * @param parent
     * @param view
     * @param position
     * @param id
     */
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        if (text.equals("Vaihda käyttäjää")) {
            Intent paavalikko = new Intent(MoodNeutral.this, MainActivity.class);
            startActivity(paavalikko);
        } else if (text.equals("Sulje sovellus")) {
            this.finishAffinity();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}