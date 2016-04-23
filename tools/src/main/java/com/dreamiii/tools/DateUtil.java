package com.dreamiii.tools;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by bbx on 16/4/23.
 * 日期操作的类
 */
public class DateUtil {

    /**
     * 用来获取当前的时间
     * @param timeFormat 时间格式(如:yyyy-MM-dd)
     * @return 当前时间
     */
    public static String getCurrentTime(String timeFormat){
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        SimpleDateFormat format = new SimpleDateFormat(timeFormat,Locale.CHINA);
        return format.format(calendar.getTime());
    }


}
