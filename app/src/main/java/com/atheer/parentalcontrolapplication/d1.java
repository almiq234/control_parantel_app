package com.atheer.parentalcontrolapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class d1 extends AppCompatActivity {

    EditText etTitle,etLocation,etDescription;
    Button addEvent;
    View view;
    private CardView cardView2;
    ImageView Event;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d1);

        cardView2= (CardView)  findViewById(R.id.cardView2);
        etTitle=  findViewById(R.id.etTitle);
        etLocation=  findViewById(R.id.etLocation);
       etDescription= findViewById(R.id.etDescription);
        addEvent=  findViewById(R.id.addEvent);
        view=  findViewById(R.id.view);
        Event=  findViewById(R.id.Event);

        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etTitle.getText().toString().isEmpty() && !etLocation.getText().toString().isEmpty() && !etDescription
                        .getText().toString().isEmpty()) {

                    Intent intent = new Intent(Intent.ACTION_INSERT);
                    intent.setData(CalendarContract.Events.CONTENT_URI);
                    intent.putExtra(CalendarContract.Events.TITLE, etTitle.getText().toString());
                    intent.putExtra(CalendarContract.Events.EVENT_LOCATION, etLocation.getText().toString());
                    intent.putExtra(CalendarContract.Events.DESCRIPTION, etDescription.getText().toString());
                    intent.putExtra(CalendarContract.Events.ALL_DAY, true);
                    intent.putExtra(Intent.EXTRA_EMAIL, "Ahmed@yahoo.com, sara@yahoo.com, doctor@yahoo.com");

                    if(intent.resolveActivity(getPackageManager()) != null){
                        startActivity(intent);
                    }else{
                        Toast.makeText(d1.this, "There is no app that support this action", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(d1.this, "Please fill all the fields",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}