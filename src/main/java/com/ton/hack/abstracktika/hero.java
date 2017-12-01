package com.ton.hack.abstracktika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;

public class hero extends AppCompatActivity {

    int x = 12;
    ProgressBar level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero);
        level = (ProgressBar) findViewById(R.id.progressBar);
    }
}
