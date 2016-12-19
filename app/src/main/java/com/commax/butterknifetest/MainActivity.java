package com.commax.butterknifetest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Bind(R.id.button)
    Button button;

    @OnClick(R.id.button)
    void onCallClick() {
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
    }


}
