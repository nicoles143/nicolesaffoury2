
package com.example.nicolesaffoury;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PlusActivity extends AppCompatActivity {
    EditText number1, number2;
    Button plusbutton, minusbutton, showresultbutton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);

        number1 = findViewById(R.id.editTextNumber1);
        number2 = findViewById(R.id.editTextNumber2);
        plusbutton = findViewById(R.id.buttonplus);
        minusbutton = findViewById(R.id.buttonminus);
        result = findViewById(R.id.textViewResult);


    }

    public void minus(View view) {
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());

        result.setText(n1-n2+"");
    }


    public void plus(View view) {
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());

        result.setText(n1+n2+"");
    }
}