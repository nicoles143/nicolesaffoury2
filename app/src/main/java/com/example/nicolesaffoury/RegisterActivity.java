package com.example.nicolesaffoury;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    private EditText etEmailR, etPasswordR, etNameR ;
    private Button btnDone, btnCancle;
    private TextView tvWelcome;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colornew)));

        etEmailR = findViewById(R.id.editRegisterEmail);
        etNameR = findViewById(R.id.editRegisterName);
        etPasswordR = findViewById(R.id.editRegisterPassword);
        btnDone = findViewById(R.id.DoneRegister);

        preferences = getSharedPreferences("Userinfo", 0);

    }


    public void Register(View view) {
        String input_mail = etEmailR.getText().toString();
        String input_password = etPasswordR.getText().toString();
        String input_name = etNameR.getText().toString();
        if (input_mail.length() > 0) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("username", input_name);
            editor.putString("password", input_password);
            editor.putString("mail", input_mail);

            editor.apply();
            Toast.makeText(this, "user register!", Toast.LENGTH_LONG).show();
            Intent intent_main = new Intent(this, MainActivity.class);
            startActivity(intent_main);
        } else {
            Toast.makeText(this, "Empty values, please insert!", Toast.LENGTH_SHORT).show();
        }
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