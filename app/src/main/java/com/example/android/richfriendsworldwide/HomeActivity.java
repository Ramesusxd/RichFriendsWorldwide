package com.example.android.richfriendsworldwide;

import android.support.v7.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView special = (ImageView) findViewById(R.id.dailyDeal);
        special.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent SignupIntent = new Intent(HomeActivity.this, ProfileActivity.class);
                startActivity(SignupIntent);
            }
        });

        ImageView nightc = (ImageView) findViewById(R.id.djicon);
        nightc.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent NightclubIntent = new Intent(HomeActivity.this, MixersActivity.class);
                startActivity(NightclubIntent);
            }
        });


        ImageView hotels = (ImageView) findViewById(R.id.hotelicon);
        hotels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent HotelIntent = new Intent(HomeActivity.this, WorldActivity.class);
                startActivity(HotelIntent);
            }
        });


        ImageView transpo = (ImageView) findViewById(R.id.transport);
        transpo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent transportIntent = new Intent(HomeActivity.this, AboutActivity.class);
                startActivity(transportIntent);
            }
        });
    }
}
