package com.gaos.butlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LIbActivity extends AppCompatActivity {

    @BindView(R2.id.tv)
    TextView tv;
    @BindView(R2.id.tv2_lib)
    TextView tv2;
    @BindView(R2.id.tv_last)
    TextView tvLast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lib_main);
        ButterKnife.bind(this);
    }

    @OnClick({R2.id.tv, R2.id.tv2_lib, R2.id.tv_last})
    public void onClick(View view) {
        int i = view.getId();
        if (i == R.id.tv) {
            Toast.makeText(this, "tvlib", Toast.LENGTH_SHORT).show();
        } else if (i == R.id.tv2_lib) {
            Toast.makeText(this, "tv2lib", Toast.LENGTH_SHORT).show();
        } else if (i == R.id.tv_last) {
            Toast.makeText(this, "lastone", Toast.LENGTH_SHORT).show();
        }
    }

//    /**
//     * 04-06 07:20:38.754 12537-12537/com.gaos.butapp I/id: onClick: id = 2131427416
//     * 04-06 07:20:38.754 12537-12537/com.gaos.butapp I/id: onClick: R2.id.tv = 2131427414
//     * 04-06 07:20:38.754 12537-12537/com.gaos.butapp I/id: onClick: R2.id.tv2_lib = 2131427415
//     *
//     * @param view
//     */
//    @OnClick({R2.id.tv, R2.id.tv2_lib})
//    public void onClick(View view) {
//        String id = "id";
//        Log.i(id, "onClick: id = " + view.getId());
//        Log.i(id, "onClick: R2.id.tv = " + R2.id.tv);
//        Log.i(id, "onClick: R2.id.tv2_lib = " + R2.id.tv2_lib);
//        int i = view.getId();
//        if (i == R2.id.tv) {
//            Toast.makeText(this, "tvlib", Toast.LENGTH_SHORT).show();
//
//        } else if (i == R2.id.tv2_lib) {
//            Toast.makeText(this, "autotvlib", Toast.LENGTH_SHORT).show();
//        }
//    }
}
