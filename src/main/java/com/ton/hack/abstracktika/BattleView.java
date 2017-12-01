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
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;

import java.util.TimerTask;

public class BattleView extends View {

    Bitmap[] demons = {BitmapFactory.decodeResource(getResources(), R.drawable.demon1),BitmapFactory.decodeResource(getResources(), R.drawable.demon2),BitmapFactory.decodeResource(getResources(), R.drawable.demon3),BitmapFactory.decodeResource(getResources(), R.drawable.demon4),BitmapFactory.decodeResource(getResources(), R.drawable.demon5),BitmapFactory.decodeResource(getResources(), R.drawable.demon6),BitmapFactory.decodeResource(getResources(), R.drawable.demon7)};
    public class MyTimer extends CountDownTimer {
        int i=0;
        public MyTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            // Do something...
        }

        public void onTick(long millisUntilFinished) {
            demon = demons[i];
            i=i+1;
            invalidate();

        }
    }



    Bitmap demon;

    public BattleView(Context context){
        super(context);
        // demon = BitmapFactory.decodeResource(getResources(), R.drawable.demon1);
        MyTimer t = new MyTimer(700, 100);
        t.start();

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRGB(133, 133, 133);

        Paint p = new Paint();
        p.setColor(Color.rgb(255, 255, 255));
        p.setAntiAlias(true);
        p.setTextSize(32);

       // canvas.drawText("Очки: "+points, 100, 100, p);
        canvas.drawBitmap(demon, 50, 100, p);


        Paint p2 = new Paint();
        p2.setColor(Color.rgb(255, 255, 255));
        p2.setAntiAlias(true);
        p2.setTextSize(100);
        canvas.drawText("Какой иероглеф означает слово 'ТЫ' ",100,100,p2);

    }


}
