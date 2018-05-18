package com.example.androidjokedisplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    public static final String EXTRA_JOKE = "extra_joke";
    TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        mJokeTextView = findViewById(R.id.joke_tv);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(EXTRA_JOKE);

        if(joke != null && joke.length() != 0){
            mJokeTextView.setText(joke);
        }
    }
}
