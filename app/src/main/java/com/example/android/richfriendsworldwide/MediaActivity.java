package com.example.android.richfriendsworldwide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MediaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        ArrayList<Song> words = new ArrayList<Song>();
        words.add(new Song("Rose", "Filthy Rich Friend", "Chicago, IL"));
        words.add(new Song("Tony", "Rich Friend", "Miami, FL"));
        words.add(new Song("Luke", "Rich Friend", "Cleveland, OH"));
        words.add(new Song("Brandi", "Really Rich Friend", "Las Vegas, NV"));
        words.add(new Song("Joan", "Filthy Rich Friend", "New York City, NY"));
        words.add(new Song("Ashley", "Rich Friend", "Stockton, CA"));
        words.add(new Song("Sam", "Rich Friend", "Dallas, TX"));
        words.add(new Song("Mike", "Filthy Rich Friend", "Boston, MA"));
        words.add(new Song("Paul", "Filthy Rich Friend", "Atlanta, GA"));
        words.add(new Song("Rich", "Really Rich Friend", "Las Vegas, NV"));



        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}