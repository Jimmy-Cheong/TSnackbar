package com.app.abby.tsnackbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

import java.lang.reflect.Method;

/**
 * Created by Abby on 9/9/2017.
 */

public class Util {


    public static boolean checkDeviceHasNavigationBar(Context context){
        boolean hasNavi=false;
        Resources res=context.getResources();
        int id=res.getIdentifier("config_showNavigationBar","bool","android");
        if(id>0){
            hasNavi=res.getBoolean(id);
        }
        try {
            Class systemProperties=Class.forName("android.os.SystemProperties");
            Method m=systemProperties.getMethod("get",String.class);
            String navBarOverride=(String)m.invoke(systemProperties,"qemu.hw.mainkeys");
            if("1".equals(navBarOverride)){
                hasNavi=false;
            }else if("0".equals(navBarOverride)){
                hasNavi=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return hasNavi;
    }


    public static int getNavigationBarHeight(Context context){

        Resources res=context.getResources();
        try {

            Class systemProperties=Class.forName("android.os.SystemProperties");
            Method m=systemProperties.getMethod("get",String.class);
            String navBarOverride=(String)m.invoke(systemProperties,"qemu.hw.mainkeys");
            if("1".equals(navBarOverride)){
                return 0;
            }else if("0".equals(navBarOverride)){
                int resourceId=res.getIdentifier("navigation_bar_height","dimen","android");
                return res.getDimensionPixelSize(resourceId);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }


    public static int dp2px(Context context, float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, context.getResources().getDisplayMetrics());
    }

    /**
     * sp转px
     *
     * @param context
     * @param
     * @return
     */
    public static int sp2px(Context context, float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, context.getResources().getDisplayMetrics());
    }

    /**

     * @param context
     * @param pxVal
     * @return
     */
    public static float px2dp(Context context, float pxVal) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    /**
     * @param
     * @param pxVal
     * @return
     */
    public static float px2sp(Context context, float pxVal) {
        return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
    }


}
