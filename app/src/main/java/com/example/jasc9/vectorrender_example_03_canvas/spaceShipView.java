package com.example.jasc9.vectorrender_example_03_canvas;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jasc9 on 5/4/2016.
 */
public class spaceShipView extends View {

    private VectorDrawableCompat spaceShip;

    public spaceShipView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        prepareImage();
    }

    public spaceShipView(Context context, AttributeSet attrs) {
        super(context, attrs);
        prepareImage();
    }

    public spaceShipView(Context context) {
        super(context);
        prepareImage();
    }

    public void prepareImage() {
        Resources res = getResources();
        spaceShip = VectorDrawableCompat.create(res, R.drawable.space_ship, null);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawARGB(0, 255, 255, 255);

        spaceShip.setBounds(0, 0, 297, 362);
        spaceShip.draw(canvas);
    }
}
