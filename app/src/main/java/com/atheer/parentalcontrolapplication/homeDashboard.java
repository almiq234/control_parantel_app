package com.atheer.parentalcontrolapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class homeDashboard extends AppCompatActivity implements View.OnClickListener {

    private CardView D1;
    private CardView D2;
    private CardView D4;
    private CardView D3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashbord);


        D1 = (CardView) findViewById(R.id.d1);
        D2 = (CardView) findViewById(R.id.d2);
        D3 = (CardView) findViewById(R.id.d3);
        D4 = (CardView) findViewById(R.id.d4);

        D1.setOnClickListener((View.OnClickListener)this);
        D2.setOnClickListener((View.OnClickListener)this);
        D3.setOnClickListener((View.OnClickListener)this);
        D4.setOnClickListener((View.OnClickListener)this);


    }
    @Override
    public void onClick(View v) {
         Intent i;
         switch (v.getId()){
             case R.id.d1 : i = new Intent(this,d1.class); startActivity(i); break;
             case R.id.d2 : i = new Intent(this,d2.class); startActivity(i); break;
             case R.id.d3 : i = new Intent(this, MapsActivity.class); startActivity(i); break;
             case R.id.d4 : i = new Intent(this,d4.class); startActivity(i); break;

         }

    }
    }