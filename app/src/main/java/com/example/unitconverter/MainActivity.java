package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView appName, result;
    Button btn_convert;
    EditText et_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appName = findViewById(R.id.tv_app_name);
        result = findViewById(R.id.tv_result);
        btn_convert = findViewById(R.id.btn);
        et_input = findViewById(R.id.editText);

        btn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kilosInput = Double.parseDouble(et_input.getText().toString());
                result.setText("" + convertToPounds(kilosInput) + " lb");
            }
        });
    }

    public double convertToPounds(double kilos) {
        return kilos * 2.20462;
    }
}