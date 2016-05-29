package com.jadenball.villagesim.resources;


import java.util.Random;

public class Forest extends Landplot {

    {
        Random rand = new Random();
        resourceAmount = rand.nextInt(151) + 50;
        timeLeftForResource = rand.nextInt(6) + 10;
        resourceImage = 1;
        danger = 2;
    }



}
