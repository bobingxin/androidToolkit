package com.dreamiii.tools;

import android.util.Log;

/**
 * Created by bbx on 16/4/13.
 */
public final class LogUtil {

    private static final int LEVEL = 4;

    public static void i(String tag,String msg){
        if(LEVEL > 0) {
            Log.i(tag, msg);
        }
    }

    public static void d(String tag,String msg){
        if(LEVEL > 1) {
            Log.d(tag, msg);
        }
    }

    public static void w(String tag,String msg){
        if(LEVEL > 2) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag,String msg){
        if(LEVEL > 3) {
            Log.e(tag, msg);
        }
    }
}
