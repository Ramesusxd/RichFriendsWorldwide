package com.example.android.richfriendsworldwide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MixersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixers);

        TextView mixer1 = (TextView) findViewById(R.id.mixerA);
        mixer1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent mixerAIntent = new Intent(MixersActivity.this, Mixer1Activity.class);
                startActivity(mixerAIntent);
            }
        });

        ImageView mixer1a = (ImageView) findViewById(R.id.mixerA1);
        mixer1a.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent mixerA1Intent = new Intent(MixersActivity.this, Mixer1Activity.class);
                startActivity(mixerA1Intent);
            }
        });

        TextView mixer2 = (TextView) findViewById(R.id.mixerB);
        mixer2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent mixer2Intent = new Intent(MixersActivity.this, Mixer2Activity.class);
                startActivity(mixer2Intent);
            }
        });

        ImageView mixer2a = (ImageView) findViewById(R.id.mixerB1);
        mixer2a.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent mixer2AIntent = new Intent(MixersActivity.this, Mixer2Activity.class);
                startActivity(mixer2AIntent);
            }
        });
    }
}

