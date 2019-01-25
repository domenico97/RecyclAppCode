package com.example.domenico.myapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;

public class Calendario extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendario_utente);
    }

    public void back(View v) {
        Intent i = new Intent();
        i.setClass(getApplicationContext(), HomepageCittadino.class);
        startActivity(i);
    }
}