package com.example.flyingbathtub;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private void alojzy(String aleksandra){
//        aleksandra="2";
        ((TextView)findViewById(R.id.calcScreen)).setText(aleksandra);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //polimer
        Button Jeden = findViewById(R.id.buttonMultiplication);
        Jeden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button)findViewById(R.id.buttonMultiplication)).setBackgroundColor(Color.parseColor("#ffffff"));
//                ((TextView)findViewById(R.id.textView)).setText("orangutan");
                alojzy("2");
            }
        });
        // koniec polimera

    }
}
