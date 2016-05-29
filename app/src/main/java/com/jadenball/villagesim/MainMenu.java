package com.jadenball.villagesim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }


    public void startTheGame(View view) {
        Intent getGameScreen = new Intent(this, Game.class);
        startActivity(getGameScreen);
    }


    public void exitTheGame(View view) {
        finish();
    }


}
