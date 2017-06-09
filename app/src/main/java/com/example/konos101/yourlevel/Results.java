package com.example.konos101.yourlevel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Konos101 on 06/06/2017.
 */

public class Results extends AppCompatActivity {

    private TextView scoreView;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        scoreView = (TextView) findViewById(R.id.txtScore);

        Intent mIntent = getIntent();
        score = mIntent.getIntExtra("score", score);
        scoreView.setText(mIntent.getStringExtra("text") + " " + String.valueOf(score));
    }

}
