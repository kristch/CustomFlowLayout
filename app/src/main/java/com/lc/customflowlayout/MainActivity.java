package com.lc.customflowlayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomFlowLayout customFlowLayout = (CustomFlowLayout) findViewById(R.id.customFlowLayout);
        String[] keys = getResources().getStringArray(R.array.keys);
        for (int i = 0; i < keys.length; i++) {
            TextView tv = (TextView) LayoutInflater.from(this).inflate(R.layout.item,customFlowLayout,false);
            tv.setText(keys[i]);
            customFlowLayout.addView(tv);
        }
    }
}
