package me.t3sl4.countryselection;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import me.t3sl4.countrypicker.CountryPicker;

public class MainActivity extends AppCompatActivity {

    CountryPicker countryPicker;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryPicker = findViewById(R.id.countryPicker);
    }
}
