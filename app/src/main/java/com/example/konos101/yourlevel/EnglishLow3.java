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

public class EnglishLow3 extends AppCompatActivity {

    private RadioButton op1, op2, op3, op4, op11, op22, op33, op44;
    private Button btnNext;
    private TextView frase, frase2;
    private int count = 0, score = 0;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_low_3);

        op1 = (RadioButton) findViewById(R.id.opcion1);
        op2 = (RadioButton) findViewById(R.id.opcion2);
        op3 = (RadioButton) findViewById(R.id.opcion3);
        op4 = (RadioButton) findViewById(R.id.opcion4);

        op11 = (RadioButton) findViewById(R.id.opcion11);
        op22 = (RadioButton) findViewById(R.id.opcion22);
        op33 = (RadioButton) findViewById(R.id.opcion33);
        op44 = (RadioButton) findViewById(R.id.opcion44);

        btnNext = (Button) findViewById(R.id.btnNext);
        frase = (TextView) findViewById(R.id.txtFrase);
        frase2 = (TextView) findViewById(R.id.txtFrase2);

        Intent mIntent = getIntent();
        score = mIntent.getIntExtra("score", score);
    }

    public void onNext(View v) {
        switch (count) {
            case 0:
                frase.setText("1) Tierra");
                frase2.setText("Delgado");
                op1.setEnabled(true);
                op2.setEnabled(true);
                op3.setEnabled(true);
                op4.setEnabled(true);
                op11.setEnabled(true);
                op22.setEnabled(true);
                op33.setEnabled(true);
                op44.setEnabled(true);

                op1.setText("Help");
                op2.setText("Ground");
                op3.setText("Thin");
                op4.setText("Suit");

                op11.setText("Help");
                op22.setText("Ground");
                op33.setText("Thin");
                op44.setText("Suit");
                count++;
                break;
            case 1:
                if (op2.isChecked()) {
                    score++;
                    if (op33.isChecked()){
                        score++;
                    }
                }
                frase.setText("2) Carne");
                frase2.setText("Plano");

                op1.setText("Meat");
                op2.setText("Send");
                op3.setText("Flat");
                op4.setText("Fear");

                op11.setText("Meat");
                op22.setText("Send");
                op33.setText("Flat");
                op44.setText("Fear");
                count++;
                break;
            case 2:
                if (op1.isChecked()) {
                    score++;
                    if (op33.isChecked()){
                        score++;
                    }
                }
                frase.setText("3) Parecer");
                frase2.setText("Reparar");

                op1.setText("Mend");
                op2.setText("Sharp");
                op3.setText("Tie");
                op4.setText("Seem");

                op11.setText("Mend");
                op22.setText("Sharp");
                op33.setText("Tie");
                op44.setText("Seem");
                count++;
                break;
            case 3:
                if (op4.isChecked()) {
                    score++;
                    if (op11.isChecked()){
                        score++;
                    }
                }
                frase.setText("4) Martillo");
                frase2.setText("Duro");

                op1.setText("Weak");
                op2.setText("Hard");
                op3.setText("Sweep");
                op4.setText("Hammer");

                op11.setText("Weak");
                op22.setText("Hard");
                op33.setText("Sweep");
                op44.setText("Hammer");
                count++;
                break;
            case 4:
                if (op4.isChecked()) {
                    score++;
                    if (op22.isChecked()){
                        score++;
                    }
                }
                frase.setText("5) Perezoso");
                frase2.setText("Añimentar");

                op1.setText("Feed");
                op2.setText("Lazy");
                op3.setText("Pour");
                op4.setText("Bucket");

                op11.setText("Feed");
                op22.setText("Lazy");
                op33.setText("Pour");
                op44.setText("Bucket");
                count++;
                break;
            case 5:
                if (op2.isChecked()) {
                    score++;
                    if (op11.isChecked()){
                        score++;
                    }
                }
                frase.setText("6) Excavar");
                frase2.setText("Peine");

                op1.setText("Comb");
                op2.setText("Quarrel");
                op3.setText("Dig");
                op4.setText("Catch");

                op11.setText("Comb");
                op22.setText("Quarrel");
                op33.setText("Dig");
                op44.setText("Catch");
                count++;
                break;
            case 6:
                if (op3.isChecked()) {
                    score++;
                    if (op11.isChecked()){
                        score++;
                    }
                }
                frase.setText("7) Mosca");
                frase2.setText("Descanso");

                op1.setText("Swim");
                op2.setText("Cheese");
                op3.setText("Fly");
                op4.setText("Rest");

                op11.setText("Swim");
                op22.setText("Cheese");
                op33.setText("Fly");
                op44.setText("Rest");
                count++;
                break;
            case 7:
                if (op3.isChecked()) {
                    score++;
                    if (op44.isChecked()){
                        score++;
                    }
                }
                frase.setText("8) Crudo");
                frase2.setText("Probable");

                op1.setText("Bargain");
                op2.setText("Feather");
                op3.setText("Likely");
                op4.setText("Raw");

                op11.setText("Bargain");
                op22.setText("Feather");
                op33.setText("Likely");
                op44.setText("Raw");
                count++;
                break;
            case 8:
                if (op4.isChecked()) {
                    score++;
                    if (op33.isChecked()){
                        score++;
                    }
                }
                frase.setText("9) Bolsillo");
                frase2.setText("Lado");

                op1.setText("Brush");
                op2.setText("Side");
                op3.setText("Pocket");
                op4.setText("Lie");

                op11.setText("Brush");
                op22.setText("Side");
                op33.setText("Pocket");
                op44.setText("Lie");
                count++;
                break;
            case 9:
                if (op3.isChecked()) {
                    score++;
                    if (op22.isChecked()){
                        score++;
                    }
                }
                frase.setText("10) Sierra");
                frase2.setText("Carencia");

                op1.setText("Saw");
                op2.setText("Slight");
                op3.setText("Pin");
                op4.setText("Lack");

                op11.setText("Saw");
                op22.setText("Slight");
                op33.setText("Pin");
                op44.setText("Lack");
                count++;
                break;
            case 10:
                if (op1.isChecked()) {
                    score++;
                    if (op44.isChecked()){
                        score++;
                    }
                }
                Toast.makeText(this, String.valueOf(score), Toast.LENGTH_LONG).show();
                if (score >= 35){
                    text = "Your did it perfectly. You are able to take the higher level test.";
                }else{
                    text = "You should take this exam or go to this course";
                }
                Intent myIntent = new Intent(EnglishLow3.this, Results.class);
                myIntent.putExtra("score", score);
                myIntent.putExtra("text", text);
                startActivity(myIntent);
                break;
        }
    }
}
