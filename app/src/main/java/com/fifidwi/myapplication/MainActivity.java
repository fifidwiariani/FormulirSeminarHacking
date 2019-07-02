package com.fifidwi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed_nama;
    EditText ed_no;
    Button btn;
    EditText ed_almt;
    TextView hasill;
    Spinner spinner;
    String [] Pilihan = {"MOBILE", "WEB", "DEKSTOP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_nama = findViewById(R.id.ed_nama);
        ed_no = findViewById(R.id.ed_no);
        ed_almt = findViewById(R.id.ed_almt);
        spinner = findViewById(R.id.spinner);
        hasill = findViewById(R.id.hasill);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner.getSelectedItem().toString().equals(Pilihan[0])) {
                    String hasil = "SYARAT BAWA SMARTPHONE";
                    hasill.setText(hasil.toString());
                } else if (spinner.getSelectedItem().toString().equals(Pilihan[2])) {
                    String hasil = "SYARAT BAWA LAPTOP DAN XAMMP";
                    hasill.setText(hasil.toString());
                } else if (spinner.getSelectedItem().toString().equals(Pilihan[3])) {
                    String hasil = "SYARAT BAWA PLUS ADA NEATBEANS";
                    hasill.setText(hasil.toString());
                }
            }
        });
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, Pilihan);
        spinner.setAdapter(adapter);
    }

}
