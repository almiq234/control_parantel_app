package com.atheer.parentalcontrolapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Message;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class d2 extends AppCompatActivity {
    ImageView send_btn,bottom_layout;
    TextView text3,message_edit_text;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d2);

        send_btn =  findViewById(R.id.send_btn);
        bottom_layout =  findViewById(R.id.bottom_layout);
        text3 =  findViewById(R.id.text3);
        message_edit_text= findViewById(R.id.message_edit_text);




    }
}