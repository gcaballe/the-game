package com.kronostudios.the_game;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        TextView tAuth = findViewById(R.id.textAuthors);
        tAuth.setText(tAuth.getText()+"\nMarc Fernandez Parra\nGuillem Caballé Tomás\nGerman Pérez Bordera");
        TextView tVersion = findViewById(R.id.textVersion);
        tVersion.setText(tVersion.getText()+"\n1.0");

    }
}