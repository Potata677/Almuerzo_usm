package com.example.wea_almuerzo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override




    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Actual_edit = (EditText) findViewById(R.id.editTextNumberSigned2);
        TextView Fill_view = (TextView) findViewById(R.id.textView3);
        TextView Actual_view = (TextView) findViewById(R.id.textView2);

        //Fill_edit.setText(0);
        Fill_view.setText(Integer.toString(0));
        //Actual_edit.setText(Double.toString(1));
        //Actual_view.setText(Integer.toString(0));




        Button button_under = (Button) findViewById(R.id.button14);
        button_under.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double actual_number = Double.parseDouble(Actual_edit.getText().toString()) - 1;
                Actual_view.setText(Double.toString(actual_number));
            }
        });



        Button button_below = (Button) findViewById(R.id.button13);
        button_below.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                double num1 = Double.parseDouble(Fill_view.getText().toString());
                double num2 = Double.parseDouble(Actual_edit.getText().toString());
                double sum = num1 + num2;
                Actual_view.setText(Double.toString(sum));
            }
        });



    }
}