package com.dreamiii.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * Created by bbx on 16/4/23.
 * 应用版本管理的类
 */
public class AppVersionUtil {

    /**
     * 获取app的版本号
     * @param context app上下文
     * @return 当前app的版本号
     */
    public static String getVersionName(Context context){
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo packageInfo = pm.getPackageInfo(context.getPackageName(),0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
