package com.atheer.parentalcontrolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GetStartedPage extends AppCompatActivity {

    ImageView image_get, image1;
    TextView text2;
    Button get_started_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started_page);

        image_get = findViewById(R.id.image_get);
        image1 = findViewById(R.id.image1);
        text2 = findViewById(R.id.text2);
        get_started_txt = findViewById(R.id.get_started_txt);
        get_started_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GetStartedPage.this, Login.class);
                startActivity(i);
                finish();
            }
        });
    }
}