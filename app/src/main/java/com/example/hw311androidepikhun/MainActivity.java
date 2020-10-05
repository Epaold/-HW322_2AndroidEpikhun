package com.example.hw311androidepikhun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private boolean isUsual=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final View usual=findViewById(R.id.usualLayout);
        final View unusual=findViewById(R.id.unusualLayout);
        findViewById(R.id.switchBtn).setOnClickListener(new View.OnClickListener() {
             @Override
              public void onClick(View v){

               if(isUsual) {
                   usual.setVisibility(View.INVISIBLE);
                   unusual.setVisibility(View.VISIBLE);
                   isUsual=false;
                   //false
               }else{
                   usual.setVisibility(View.VISIBLE);
                   unusual.setVisibility(View.INVISIBLE);
                   isUsual=true;
               }
             }
        }
        );

    }
}