package com.example.projekti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
/**
 * MoodPositive is intro activity for KiitollisuusHarjoitus
 */
public class MoodPositive extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_positive);
        Spinner spinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.dropdown, android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }
    /**
     * Opens the KiitollisuusHarjoitus activity
     * @see KiitollisuusHarjoitus
     * @param view
     */
    //Opens next activity which is for positive mood
    public void goButton(View view) {
        Intent goBack = new
                Intent(MoodPositive.this, KiitollisuusHarjoitus.class);
        startActivity(goBack);
    }

    /**
     * Shows dropdownlist with 2 alternatives to choose from which are Change user and Shut down app
     * @param parent
     * @param view
     * @param position
     * @param id
     */
    //Shows dropdownlist with 2 alternatives to choose from
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        if (text.equals("Vaihda käyttäjää")) {
            Intent paavalikko = new Intent(MoodPositive.this, MainActivity.class);
            startActivity(paavalikko);
        } else if (text.equals("Sulje sovellus")) {
            this.finishAffinity();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

