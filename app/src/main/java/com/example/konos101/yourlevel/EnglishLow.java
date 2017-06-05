package com.example.konos101.yourlevel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Konos101 on 05/06/2017.
 */

public class EnglishLow extends AppCompatActivity {
    private RadioButton op1, op2, op3, op4;
    private Button btnNext;
    private TextView frase;
    private int count = 0, score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_low);

        op1 = (RadioButton) findViewById(R.id.opcion1);
        op2 = (RadioButton) findViewById(R.id.opcion2);
        op3 = (RadioButton) findViewById(R.id.opcion3);
        op4 = (RadioButton) findViewById(R.id.opcion4);
        btnNext = (Button) findViewById(R.id.btnNext);
        frase = (TextView) findViewById(R.id.txtFrase);
    }

    public void onNext(View v) {
        switch (count) {
            case 0:
                frase.setText(R.string.f1);
                op1.setEnabled(true);
                op2.setEnabled(true);
                op3.setEnabled(true);
                op4.setEnabled(true);

                op1.setText("you're");
                op2.setText("you");
                op3.setText("your");
                op4.setText("yours");
                count++;
                break;
            case 1:
                if (op3.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f2);
                op1.setText("to look");
                op2.setText("to see");
                op3.setText("look");
                op4.setText("see");
                count++;
                break;
            case 2:
                if (op4.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f3);
                op1.setText("a");
                op2.setText("many");
                op3.setText("any");
                op4.setText("no");
                count++;
                break;
            case 3:
                if (op3.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f4);
                op1.setText("her");
                op2.setText("she");
                op3.setText("him");
                op4.setText("it's");
                count++;
                break;
            case 4:
                if (op1.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f5);
                op1.setText("live at");
                op2.setText("lives in");
                op3.setText("live in");
                op4.setText("live at");
                count++;
                break;
            case 5:
                if (op3.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f6);
                op1.setText("the guitar well");
                op2.setText("well the guitar");
                op3.setText("the guitar good");
                op4.setText("good the guitar");
                count++;
                break;
            case 6:
                if (op2.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f7);
                op1.setText("fell");
                op2.setText("felt");
                op3.setText("felled");
                op4.setText("fall");
                count++;
                break;
            case 7:
                if (op2.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f8);
                op1.setText("for repair");
                op2.setText("for to repair");
                op3.setText("repairing");
                op4.setText("to repair");
                count++;
                break;
            case 8:
                if (op4.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f9);
                op1.setText("looks for her");
                op2.setText("look her for");
                op3.setText("looks after her");
                op4.setText("looks her after");
                count++;
                break;
            case 9:
                if (op3.isChecked()) {
                    score++;
                }
                frase.setText(R.string.f10);
                op1.setText("better film I've never");
                op2.setText("better film I've ever");
                op3.setText("best film I've never");
                op4.setText("best film I've ever");
                count++;
                break;
            case 10:
                if (op4.isChecked()) {
                    score++;
                }
                Toast.makeText(this, String.valueOf(score), Toast.LENGTH_LONG).show();
                startActivity(new Intent(EnglishLow.this, EnglishLow2.class));
                break;
        }
    }
}

