package com.example.android.richfriendsworldwide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView loginid = (TextView) findViewById(R.id.signinButton);
        loginid.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent SignupIntent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(SignupIntent);
            }
        });


        TextView signin = (TextView) findViewById(R.id.loginButton);
        signin.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
            }
        });


        TextView termsC = (TextView) findViewById(R.id.TConditions);
        termsC.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent termsIntent = new Intent(MainActivity.this, TermsActivity.class);
                startActivity(termsIntent);
            }
        });
    }
}
