package com.example.android.richfriendsworldwide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SignconfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signconfirm);

    }

    public void goHome(View view) {
        Button tohome = (Button) findViewById(R.id.signupconf);
        tohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tohomeIntent = new Intent(SignconfActivity.this, HomeActivity.class);
                startActivity(tohomeIntent);
            }
        });

    }

}
