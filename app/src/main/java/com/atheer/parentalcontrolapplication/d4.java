package com.atheer.parentalcontrolapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class d4 extends AppCompatActivity {

    View view;
    private CardView cardView;
    ImageView Ali;
    TextView Health, Health1, Health2, Health3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4);

        cardView= (CardView) findViewById(R.id.cardView);
        view= findViewById(R.id.view);
        Ali= findViewById(R.id.Ali);
        Health= findViewById(R.id.Health);
        Health1= findViewById(R.id.Health1);
        Health2= findViewById(R.id.Health2);
        Health3= findViewById(R.id.Health3);

    }
}