package com.ton.hack.abstracktika;

/**
 * Created by tkorg on 27.11.2017.
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

public class BattleView extends View {
    Bitmap demon;
    public BattleView(Context context){
        super(context);
         demon = BitmapFactory.decodeResource(getResources(), R.drawable.demon1);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRGB(0, 0, 255);

        Paint p = new Paint();
        p.setColor(Color.rgb(255, 255, 255));
        p.setAntiAlias(true);
        p.setTextSize(32);

       // canvas.drawText("Очки: "+points, 100, 100, p);
        canvas.drawBitmap(demon, 150, 150, p);

    }


}
