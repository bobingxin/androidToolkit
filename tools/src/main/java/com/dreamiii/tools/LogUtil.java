package com.dreamiii.tools;

import android.util.Log;

/**
 * Created by bbx on 16/4/13.
 * 日志控制工具，方便在打包的时候屏蔽Log
 */
public final class LogUtil {

    //LEVEL为0时候不显示任何日志
    public static int LEVEL = 4;

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
