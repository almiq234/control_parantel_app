package com.atheer.parentalcontrolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.Instant;


public class MainActivity extends AppCompatActivity {

  ImageView logo;
  TextView titleText,text2;

  ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        titleText = findViewById(R.id.titleText);
        text2 = findViewById(R.id.text2);
        imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GetStartedPage.class);
                startActivity(intent);
                finish();
            }
        });


    }




}