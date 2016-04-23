package com.dreamiii.tools;

import android.os.Environment;

/**
 * Created by bbx on 16/4/23.
 * 文件操作的类
 */
public class FileUtil {

    /**
     * 检测外部存储是否挂载
     * @return 外置存储是否挂载
     */
    public static boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }
}
