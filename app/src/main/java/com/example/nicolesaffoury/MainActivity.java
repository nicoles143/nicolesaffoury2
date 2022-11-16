 package com.example.nicolesaffoury;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     private EditText textEmail, textPassword, textName;
     private Button btSignup, btRegister;
     private TextView tvWelcome;

     private final String vaild_mail = "admin";
     private final String vaild_passworg = "1";
     SharedPreferences preferences;

     @Override
     protected void onCreate(Bundle savedInsgtanceState) {
         super.onCreate(savedInsgtanceState);
         setContentView(R.layout.activity_main);
         getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colornew)));


         textPassword = findViewById(R.id.editTextPassword);
         textName = findViewById(R.id.editTextName);


         preferences = getSharedPreferences("Userinfo", 0);

     }


     public void signin(View view) {

         if (textPassword.getText().toString().equals(""))
             Toast.makeText(this, "Empty password", Toast.LENGTH_LONG).show();
         else if (textName.getText().toString().equals(""))
             Toast.makeText(this, "Empty name", Toast.LENGTH_LONG).show();
         else {

             String input_name = textName.getText().toString();
             String input_password = textPassword.getText().toString();

             String registeredPassword = preferences.getString("password", "");
             String registeredName = preferences.getString("username", "");


             if ( input_password.equals(registeredPassword) && input_name.equals(registeredName)) {
                 Intent i_done = new Intent(this, HomeActivity.class);
                 startActivity(i_done);
             } else {
                 Toast.makeText(this, "incorrect credentails", Toast.LENGTH_SHORT).show();
             }


         }
     }


     @Override
     public boolean onOptionsItemSelected(@NonNull MenuItem item) {
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
     public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu, menu); // menu b3d al r -> hee alfolder ale mogod fio ale bde aia , 3m ba5d mno , resurce
         return true;
     }


     @Override
     public void onBackPressed() { // its called when the user press the back button
         AlertDialog.Builder dialog = new AlertDialog.Builder(this);
         dialog.setTitle("back button was pressed");
         dialog.setMessage("did you press it on purpose ?");
         dialog.setNegativeButton("No", null);   // if the user chose no , he will stay on the same page and the page wont go back
         dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialogInterface, int i) {

                 MainActivity.this.finish();
             }
         });
         dialog.setIcon(R.drawable.ic_baseline_feedback_24);
         AlertDialog alertDialog = dialog.create();
         alertDialog.show();

     }


     public void register(View view) {
         Intent i_register = new Intent(this, RegisterActivity.class);
         startActivity(i_register);
     }





 }




