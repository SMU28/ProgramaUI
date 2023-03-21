package com.example.programaui;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button botoncolor;
    private TextView textView;
    private Switch Switchbloqueo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        botoncolor=(Button) findViewById(R.id.button5);
        textView=(TextView) findViewById(R.id.textView);
        Switchbloqueo = (Switch) findViewById(R.id.switch1);

        Switchbloqueo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Switchbloqueo.isChecked()){
                    botoncolor.setEnabled(false);
                }else{
                    botoncolor.setEnabled(true);
                }
            }
        });
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button5:
                textView.setTextColor(Color.parseColor("#80CBC4"));
                break;
        }
    }


}