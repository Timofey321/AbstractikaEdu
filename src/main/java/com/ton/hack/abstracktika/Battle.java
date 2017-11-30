package com.ton.hack.abstracktika;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Created by tkorg on 27.11.2017.
 */

public class Battle extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BattleView view = new BattleView(this);
        setContentView(view);
        // setContentView(R.layout.activity_main);
        }

}
