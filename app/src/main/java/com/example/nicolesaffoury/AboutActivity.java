package com.example.nicolesaffoury;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class AboutActivity extends AppCompatActivity {
     @SuppressLint("UseSwitchCompatOrMaterialCode")



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
         getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colornew)));
    }
}