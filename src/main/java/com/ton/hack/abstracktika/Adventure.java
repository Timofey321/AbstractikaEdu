package com.ton.hack.abstracktika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adventure extends BuildConfig.AppCompatActivity implements View.OnClickListener {
    Button first;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adventure);
        first = (Button)findViewById(R.id.first);
        first.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.first:
                Intent intent = new Intent(this, Battle.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
