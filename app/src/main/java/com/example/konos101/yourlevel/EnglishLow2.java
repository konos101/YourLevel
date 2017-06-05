package com.example.konos101.yourlevel;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Konos101 on 05/06/2017.
 */

public class EnglishLow2 extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private RadioButton op1, op2, op3;
    private Button btnNext;
    private TextView frase;
    private int count = 0, score = 0;
    private ImageButton play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_low_2);

        op1 = (RadioButton) findViewById(R.id.opcion1);
        op2 = (RadioButton) findViewById(R.id.opcion2);
        op3 = (RadioButton) findViewById(R.id.opcion3);
        btnNext = (Button) findViewById(R.id.btnNext);
        frase = (TextView) findViewById(R.id.txtFrase);
        play = (ImageButton) findViewById(R.id.imgPLay);

    }

    public void onNext(View v) {
        switch (count) {
            case 0:
                frase.setText("1)");
                op1.setEnabled(true);
                op2.setEnabled(true);
                op3.setEnabled(true);

                op1.setText("Yes, he has");
                op2.setText("Yes, she's a sister");
                op3.setText("Yes, she has");
                count++;
                break;
            case 1:
                if (op3.isChecked()) {
                    score++;
                }
                frase.setText("2)");
                op1.setText("Yes, you can");
                op2.setText("Yes, we can");
                op3.setText("Yes, they can");
                count++;
                break;
            case 2:
                if (op1.isChecked()) {
                    score++;
                }
                frase.setText("3)");
                op1.setText("Very well");
                op2.setText("Very good");
                op3.setText("Very much");
                count++;
                break;
            case 3:
                if (op2.isChecked()) {
                    score++;
                }
                frase.setText("4)");
                op1.setText("To Barcelona");
                op2.setText("Tomorrow");
                op3.setText("Everyday");
                count++;
                break;
            case 4:
                if (op1.isChecked()) {
                    score++;
                }
                frase.setText("5)");
                op1.setText("No, I don't");
                op2.setText("Not just now");
                op3.setText("No, I'm not");
                count++;
                break;
            case 5:
                if (op1.isChecked()) {
                    score++;
                }
                frase.setText("6)");
                op1.setText("I'm a student");
                op2.setText("Very well, thank you");
                op3.setText("I do a test");
                count++;
                break;
            case 6:
                if (op1.isChecked()) {
                    score++;
                }
                frase.setText("7)");
                op1.setText("She is fine");
                op2.setText("It's Monica");
                op3.setText("She's a doctor");
                count++;
                break;
            case 7:
                if (op2.isChecked()) {
                    score++;
                }
                frase.setText("8)");
                op1.setText("He walks in the park");
                op2.setText("He's working now");
                op3.setText("In an office");
                count++;
                break;
            case 8:
                if (op3.isChecked()) {
                    score++;
                }
                frase.setText("9)");
                op1.setText("Every day.");
                op2.setText("Sometimes");
                op3.setText("Yesterday");
                count++;
                break;
            case 9:
                if (op3.isChecked()) {
                    score++;
                }
                frase.setText("10)");
                op1.setText("No, they're not");
                op2.setText("No, we aren't");
                op3.setText("No, he is not");
                count++;
                break;
            case 10:
                if (op2.isChecked()) {
                    score++;
                }
                Toast.makeText(this, String.valueOf(score), Toast.LENGTH_LONG).show();
                startActivity(new Intent(EnglishLow2.this, EnglishLow3.class));
                break;
        }
    }

    public void Play(View v) {
        switch (count) {
            case 0:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow0);
                break;
            case 1:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow1);
                break;
            case 2:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow2);
                break;
            case 3:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow3);
                break;
            case 4:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow4);
                break;
            case 5:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow5);
                break;
            case 6:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow6);
                break;
            case 7:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow7);
                break;
            case 8:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow8);
                break;
            case 9:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow9);
                break;
            case 10:
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englishlow10);
                break;

        }
        mediaPlayer.start();
    }
}
