package com.app.abby.tsnackbardemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.abby.tsnackbar.TSnackbar;

public class MainActivity extends AppCompatActivity {

    private Button mLoading;
    private Button mError;
    private Button mComplete;
    private Button mFadeOut;
    private Button mIcon;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoading=(Button)findViewById(R.id.loading);
        mLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSnackbar.make(getWindow().getDecorView(),"正在加载中，请稍候...",TSnackbar.LENGTH_LONG)
                        .setPreDefinedStyle(TSnackbar.STYLE_LOADING)
                        .show();
            }
        });

        mError=(Button)findViewById(R.id.error);
        mError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSnackbar.make(getWindow().getDecorView(),"出现错误，无法加载！",TSnackbar.LENGTH_LONG)
                        .setPreDefinedStyle(TSnackbar.STYLE_ERROR)
                        .show();
            }
        });

        mComplete=(Button)findViewById(R.id.complete);
        mComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSnackbar.make(getWindow().getDecorView(),"加载完毕",TSnackbar.LENGTH_LONG)
                        .setPreDefinedStyle(TSnackbar.STYLE_COMPLETE)
                        .show();
            }
        });

        mFadeOut=(Button)findViewById(R.id.fade_out);
        mFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSnackbar.make(getWindow().getDecorView(),"加载中",TSnackbar.LENGTH_LONG)
                        .setFadeOrTranslateStyle(TSnackbar.STYLE_FADE_OUT)
                        .setBackgroundColor(Color.GREEN)
                        .show();
            }
        });


        mIcon=(Button)findViewById(R.id.icon);
        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TSnackbar.make(getWindow().getDecorView(),"正在加载中",TSnackbar.LENGTH_LONG)
                        .setIconRes(R.drawable.ic_wifi_black_24dp)
                        .setBackgroundColor(Color.GREEN)
                        .show();
            }
        });
    }
}
