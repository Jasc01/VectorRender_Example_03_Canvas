package com.example.jasc9.vectorrender_example_03_canvas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private spaceShipView spaceShip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spaceShip = (spaceShipView) findViewById(R.id.space_ship);
    }
}
