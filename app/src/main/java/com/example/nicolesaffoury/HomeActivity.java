package com.example.nicolesaffoury;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colornew)));
    }



    public boolean onOptionsItemSelected (@NonNull MenuItem item){
        switch (item.getItemId()) {
            case R.id.help_menu:
                Intent i = new Intent(this, HelpActivity.class);
                startActivity(i);
                break;
            case R.id.setting_menu:
                Intent v = new Intent(this, SettingActivity.class);
                startActivity(v);
                break;
            case R.id.logout_menu:
                Intent h = new Intent(this, MainActivity.class);
                startActivity(h);
                break;
            case R.id.about_menu:
                Intent m = new Intent(this, AboutActivity.class);
                startActivity(m);
                break;
        }
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu); // menu b3d al r -> hee alfolder ale mogod fio ale bde aia , 3m ba5d mno , resurce
        return true;
    }


}