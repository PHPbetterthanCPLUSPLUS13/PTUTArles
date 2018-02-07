package com.enzo.ptut.projetptut_v1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ArboActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arbo);
    }

    public void ret(View view) {
        Intent intent= new Intent(ArboActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void bientot(View view) {
        Toast.makeText(getApplicationContext(),"Fonctionnalité à venir.",Toast.LENGTH_LONG).show();
    }

    public void accept(View view) {
        Toast.makeText(getApplicationContext(),"Fonctionnalité à venir.",Toast.LENGTH_LONG).show();
        //MediaPlayer.create(getApplicationContext(), R.id.btn_valid).start();
    }

}
