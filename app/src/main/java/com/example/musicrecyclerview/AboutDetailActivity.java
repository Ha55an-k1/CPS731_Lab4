package com.example.musicrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutDetailActivity extends AppCompatActivity {

    ImageView MusicImage;
    TextView MusicDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_detail);

        MusicImage= (ImageView)findViewById(R.id.ivImage2);
        MusicDescription=(TextView)findViewById(R.id.txtDescription);
        MusicDescription.setMovementMethod(new ScrollingMovementMethod());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle!=null){
            MusicDescription.setText(mBundle.getString("Description"));
            MusicImage.setImageResource(mBundle.getInt("Image"));
        }

    }
}