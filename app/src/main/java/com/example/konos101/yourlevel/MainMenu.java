package com.example.konos101.yourlevel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {
    private Button btnGo;
    private Spinner languageSelector;
    private String[] languages;
    private TextView txtDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnGo = (Button) findViewById(R.id.btnGo);
        languageSelector = (Spinner) findViewById(R.id.languageSelector);
        txtDes = (TextView) findViewById(R.id.txtDescription);

        languages = getResources().getStringArray(R.array.languages);
    }

    public void onClickBtn(View v) {
        if (languageSelector.getSelectedItem().toString().equals(languages[0].toString())) {
            Toast.makeText(this, languages[0].toString(), Toast.LENGTH_LONG).show();
            txtDes.setText(R.string.englishLow);
            startActivity(new Intent(MainMenu.this, EnglishLow.class));
        } else if (languageSelector.getSelectedItem().toString().equals(languages[1].toString())) {
            Toast.makeText(this, languages[1].toString(), Toast.LENGTH_LONG).show();
            txtDes.setText(R.string.englishHigh);
        } else if (languageSelector.getSelectedItem().toString().equals(languages[2].toString())) {
            Toast.makeText(this, languages[2].toString(), Toast.LENGTH_LONG).show();
            txtDes.setText(R.string.frenchLow);
        } else if (languageSelector.getSelectedItem().toString().equals(languages[3].toString())) {
            Toast.makeText(this, languages[3].toString(), Toast.LENGTH_LONG).show();
            txtDes.setText(R.string.frenchHigh);
        }else if (languageSelector.getSelectedItem().toString().equals(languages[4].toString())) {
            Toast.makeText(this, languages[4].toString(), Toast.LENGTH_LONG).show();
            txtDes.setText(R.string.catalan);
        }
    }
}
