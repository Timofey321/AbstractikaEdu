package com.ton.hack.abstracktika;

<<<<<<< HEAD
import android.content.Intent;
=======
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
>>>>>>> parent of 29076c1... Я сделал

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn_teach;
    Button btn_dunge;
    Button btn_advent;
    Button btn_settings;
<<<<<<< HEAD
=======
    Button btn_hero;

    final Context context = this;
    private Button button;
    private TextView final_text;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал
        final_text = (TextView) findViewById(R.id.final_text);
        Toast toast = Toast.makeText(getApplicationContext(),
                "с возвращением, хозяин", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.demon7);
        toastContainer.addView(catImageView, 0);
        toast.show();
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал

        btn_teach = (Button) findViewById(R.id.teacher);
        btn_teach.setOnClickListener(this);
        btn_dunge = (Button) findViewById(R.id.dungeon);
        btn_dunge.setOnClickListener(this);
        btn_advent = (Button) findViewById(R.id.adventure);
        btn_advent.setOnClickListener(this);
        btn_settings = (Button) findViewById(R.id.Settings);
        btn_settings.setOnClickListener(this);
<<<<<<< HEAD
    }

=======
        btn_hero = (Button) findViewById(R.id.hero);
        btn_hero.setOnClickListener(this);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "пора кормить", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.demon7);
        toastContainer.addView(catImageView, 0);
        toast.show();
    }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал
=======
>>>>>>> parent of 29076c1... Я сделал
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
            default:
                break;
        }
    }
}
