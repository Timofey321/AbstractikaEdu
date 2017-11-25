package com.ton.hack.abstracktika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btn_teach;
    Button btn_dunge;
    Button btn_advent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_teach = (Button) findViewById(R.id.teacher);
        btn_teach.setOnClickListener(this);
        btn_dunge = (Button) findViewById(R.id.dungeon);
        btn_dunge.setOnClickListener(this);
        btn_advent = (Button) findViewById(R.id.adventure);
        btn_advent.setOnClickListener(this);
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
            default:
                break;
        }
    }
}
