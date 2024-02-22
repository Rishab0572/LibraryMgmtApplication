package com.example.demo_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        display=findViewById(R.id.display);
        display.setText("firstname: "+getIntent().getStringExtra("fnamenext")+"\nLast Name: "+getIntent().getStringExtra("lnamenext")+"\nBook Name: "+getIntent().getStringExtra("bknamenext")+"\nBook ID: "+getIntent().getStringExtra("bkidnext"));
    }
}