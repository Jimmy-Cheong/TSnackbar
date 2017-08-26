package com.app.abby.tsnackbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Abby on 8/24/2017.
 */

public class MainActivity extends AppCompatActivity {

    TSnackbar tSnackbar;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        TSnackbar.make(this.getWindow().getDecorView(),"加载完毕",TSnackbar.LENGTH_LONG)
                .setActionTextColor(Color.WHITE)
                .setMessageTextColor(Color.WHITE)
            //    .setAlpha(150)
                .setShowsDirection(TSnackbar.SHOW_FROM_BOTTOM_TO_TOP)
                .setPreDefinedStyle(TSnackbar.STYLE_LOADING)
                .setBackgroundColor(Color.BLUE)
                .setFadeOrTranslateStyle(TSnackbar.STYLE_FADE_OUT)
                .setAction("取消", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        tSnackbar.dismiss();
                    }
                }).show();




    }
}
