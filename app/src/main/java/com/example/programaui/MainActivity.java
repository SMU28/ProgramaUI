package com.example.programaui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonactividad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonactividad=(Button) findViewById(R.id.button);
    }

    public void enviarnewactividad (View v){
        Intent intentouno = new Intent(this,MainActivity2.class);
        startActivity(intentouno);
    }
}