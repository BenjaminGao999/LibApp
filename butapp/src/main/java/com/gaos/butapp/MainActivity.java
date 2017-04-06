package com.gaos.butapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.gaos.butlib.LIbActivity;
import com.gaos.butlib.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_but)
    TextView tvBut;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_but, R.id.activity_main})
    public void onClick(View view) {
        String id = "id";
        Log.i(id, "onClick: id = " + view.getId());
        Log.i(id, "onClick: R.id.tv_but = " + R.id.tv_but);
        Log.i(id, "onClick: R.id.activity_main = " + R.id.activity_main);
        switch (view.getId()) {
            case R.id.tv_but:
                startActivity(new Intent(this, LIbActivity.class));
                Toast.makeText(this, "open lib", Toast.LENGTH_SHORT).show();
                break;
            case R.id.activity_main:
                Toast.makeText(this, "butmain", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
