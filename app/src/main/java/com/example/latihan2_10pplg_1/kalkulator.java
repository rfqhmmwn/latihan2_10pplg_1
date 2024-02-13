package com.example.latihan2_10pplg_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class kalkulator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);


        final TextView resultTextView = findViewById(R.id.resultTextView);
        Button btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1 = Double.parseDouble(((EditText) findViewById(R.id.edtNumber1)).getText().toString());
                double num2 = Double.parseDouble(((EditText) findViewById(R.id.edtNumber2)).getText().toString());
                String operator = ((Spinner) findViewById(R.id.spinnerOperator)).getSelectedItem().toString();


                double result = 0;
                switch (operator) {
                    case "Tambah":
                        result = num1 + num2;
                        break;
                    case "Kurang":
                        result = num1 - num2;
                        break;
                    case "Kali":
                        result = num1 * num2;
                        break;
                    case "Bagi":
                        if (num2 == 0) {
                            result = num1 / num2;
                        } else {
                            Toast.makeText(kalkulator.this, "PEMBAGI TIDAK BOLEH 0", Toast.LENGTH_SHORT).show();
                            return;
                        }
                        break;
                }

                resultTextView.setText(String.valueOf(result));
            }
        });


    }
}

