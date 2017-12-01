package com.ton.hack.abstracktika;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.media.AudioManager;
import android.media.MediaPlayer;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer mPlayer;
    Button btn_teach;
    Button btn_dunge;
    Button btn_advent;
    Button btn_settings;
    Button btn_hero;
    ImageButton info;
    AudioManager audioManager;
    AlertDialog.Builder ad;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //пора включить звук и сделать его бесконечным
        mPlayer= MediaPlayer.create(this, R.raw.music);
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mPlayer.start();
            }
        });
        mPlayer.start();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toast toast = Toast.makeText(getApplicationContext(),
                "с возвращением, хозяин", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.demon7);
        toastContainer.addView(catImageView, 0);
        toast.show();
        info = (ImageButton) findViewById(R.id.info);

        btn_teach = (Button) findViewById(R.id.teacher);
        btn_teach.setOnClickListener(this);
        btn_dunge = (Button) findViewById(R.id.dungeon);
        btn_dunge.setOnClickListener(this);
        btn_advent = (Button) findViewById(R.id.adventure);
        btn_advent.setOnClickListener(this);
        btn_settings = (Button) findViewById(R.id.Settings);
        btn_settings.setOnClickListener(this);
        btn_hero = (Button) findViewById(R.id.hero);
        btn_hero.setOnClickListener(this);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Кто есть кто")
                        .setMessage("Подземелье - место, где вам зададут разнообразные вопросы по ВСЕМ пройденным темам." +
                                "Это поможет вам лучше углубиться в обучение"+"Приключение - это конкретные вопросы по пройденному материалу" +
                                ", 1-ый уровень - это 1-ый урок. Сенсей - это учитель, если вы зайдете к нему, то он вас научит новой теме," +
                                "а после прохождения уровня, зайдите к ниму снова и он даст вам новый урок. О персанаже расскажет вам о вашем герое, его вещах," +
                                "который можно использовать как подсказки. Удачи, боритесь, познавайте!")
                        .setIcon(R.drawable.ball)
                        .setCancelable(false)
                        .setNegativeButton("ОК, я понял",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();
            }

        });
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.teacher:
                Intent intent = new Intent(this, Teacher.class);
                startActivity(intent);
                break;
            case R.id.adventure:
                Intent intent1 = new Intent(this, Adventure.class);
                startActivity(intent1);
                break;
            case R.id.dungeon:
                Intent intent2 = new Intent(this, Main2Activity.class);
                startActivity(intent2);
                break;
            case R.id.Settings:
                Intent intent3 = new Intent(this, Settings.class);
                startActivity(intent3);
                break;
            case R.id.hero:
                Intent intent4 = new Intent(this, hero.class);
                startActivity(intent4);
                break;
            default:
                break;
        }
    }
}
