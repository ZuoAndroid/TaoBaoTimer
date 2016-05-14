package com.zwb.taobaotimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zwb.taobaotimer.view.RushBuyCountDownTimerView;

public class MainActivity extends AppCompatActivity {


    private RushBuyCountDownTimerView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = ((RushBuyCountDownTimerView) findViewById(R.id.timer_tv));
        tv.setTime(0 , 6 , 0);
        tv.start();
    }
}
