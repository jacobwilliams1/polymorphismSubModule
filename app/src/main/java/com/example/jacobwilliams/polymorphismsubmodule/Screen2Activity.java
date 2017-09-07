package com.example.jacobwilliams.polymorphismsubmodule;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Screen2Activity extends Activity implements ViewManipulator {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        final Button button = findViewById(R.id.button);
        final Button button1 = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeText();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });
    }

    @Override
    public void changeText() {
        final TextView textView = findViewById(R.id.textView);
        textView.setTextColor(Color.parseColor("#ff0000"));
    }

    public void changeActivity(){
        Intent i = new Intent(this, Screen1Activity.class);
        startActivity(i);
    }
}
