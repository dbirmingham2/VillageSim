package com.jadenball.villagesim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jadenball.villagesim.resources.Forest;
import com.jadenball.villagesim.resources.Landplot;


public class Game extends AppCompatActivity {

    int Day = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        /*
        ImageButton imgb1 = (ImageButton) findViewById(R.id.imgResource1);
        ImageButton imgb2 = (ImageButton) findViewById(R.id.imgResource2);
        ImageButton imgb3 = (ImageButton) findViewById(R.id.imgResource3);
        ImageButton imgb4 = (ImageButton) findViewById(R.id.imgResource4);
        */
        Landplot plot1 = new Forest();

    }


}
