package com.example.musicrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<MusicData> MusicList;
    MusicData musicData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        MusicList= new ArrayList<>();


        musicData= new MusicData("Frank Ocean\nAlternate R&B","Visionary American recording artist Frank Ocean is one of the most celebrated and critically acclaimed artists of this era.\n" + "\n" + "His heavily lauded breakout mixtape ‘Nostalgia Ultra’ in 2011 set the tone for what would be the Grammy-Award winning record ‘Channel Orange’. After a four year break, Ocean dropped one of the most anticipated albums of all time ‘Endless’, followed a day later by the seminal and game-changing album ‘Blonde’. ",R.drawable.frank);
        MusicList.add(musicData);

        Adapter adapter= new Adapter(MainActivity.this,MusicList);
        mRecyclerView.setAdapter(adapter);

    }
}