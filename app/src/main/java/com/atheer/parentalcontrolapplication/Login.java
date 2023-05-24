package com.atheer.parentalcontrolapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    ImageView login;
    TextInputEditText username,ID;
    TextView signUp;
    Button Register;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login=findViewById(R.id.login);
        signUp=findViewById(R.id.signUp);
        username=findViewById(R.id.username);
        ID=findViewById(R.id.ID);
        Register=findViewById(R.id.Register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameR = username.getText().toString();
                String Idi = ID.getText().toString();

                // Check if username and password are correct
                if (usernameR.equals("Ali") && Idi.equals("1234")){
                    Intent intent = new Intent(Login.this,homeDashboard.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}