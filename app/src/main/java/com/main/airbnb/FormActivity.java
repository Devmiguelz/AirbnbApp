package com.main.airbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        // Ocultar el actionBar
        getSupportActionBar().hide();
    }
}
