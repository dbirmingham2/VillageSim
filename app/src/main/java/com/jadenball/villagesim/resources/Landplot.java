package com.jadenball.villagesim.resources;

import android.widget.ImageButton;

import com.jadenball.villagesim.Game;
import com.jadenball.villagesim.R;
//import android.os.Bundle;
//import android.view.View;

import java.util.Random;


public class Landplot extends Game {
    public int type;                    // Type of resource indicated by number
    public int resourceAmount;          // Amount of resources the current plot of land contains
    public int timeLeftForResource;     // How many turns are left till resource becomes nothing or something new
    public int resourceImage;           // Number for which image the imageButton should be
    public int danger;                  // DANGER: None, Low, Moderate, High, Extreme (Level of 0-4)

    /*
    ImageButton imgb1 = (ImageButton) findViewById(R.id.imgResource1);
    ImageButton imgb2 = (ImageButton) findViewById(R.id.imgResource2);
    ImageButton imgb3 = (ImageButton) findViewById(R.id.imgResource3);
    ImageButton imgb4 = (ImageButton) findViewById(R.id.imgResource4);
    */

    // LANDPLOT INITIALIZER
    {
        type = 0;
        resourceAmount = 0;
        timeLeftForResource = -1;
        danger = 0;
    }


    int getResourceType() {
        return type;
    }

    int getResourceAmount() {
        return resourceAmount;
    }

    int getTimeLeftForResource() {
        return timeLeftForResource;
    }


    // function takeResource
    // When user successfully uses the Harvest button this function is called
    // calculates a random amount depending on amount of workers, minuses this from resourceAmount
    // Returns amount of resources taken
    int takeResource(int workers) {
        if (resourceAmount > 0) {
            workers = 6 - workers;
            Random rand = new Random();
            int randAmount = rand.nextInt((int) (resourceAmount * 0.9 / workers + 1));
            resourceAmount -= randAmount;
            return randAmount;
        } else {
            // TODO: TELL USER THAT THERE ARE NO RESOURCES TO TAKE
            return 0;
        }
    }

    void genNewResource() {
        Random rand = new Random();
        type = rand.nextInt(10); // TODO: CHANGE NUMBER TO BE HOW MANY RESOURCES WE HAVE
    }
}