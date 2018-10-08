package com.example.android.richfriendsworldwide;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }


    public void Open(View view) {
        Button toComf = (Button) findViewById(R.id.signup);
        toComf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toComfIntent = new Intent(SignupActivity.this, SignconfActivity.class);
                startActivity(toComfIntent);
            }
        });



    }




}
