package com.dreamiii.toolkit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dreamiii.tools.AppVersionUtil;
import com.dreamiii.tools.DateUtil;
import com.dreamiii.tools.LogUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testLogUtil();
        testDateUtil();
        LogUtil.d(TAG,AppVersionUtil.getVersionName(this));
    }

    private void testLogUtil(){
        LogUtil.i(TAG,"i");
        LogUtil.d(TAG,"d");
        LogUtil.w(TAG,"w");
        LogUtil.e(TAG,"e");
    }

    private void testDateUtil(){
        LogUtil.d(TAG, DateUtil.getCurrentTime("yyyy-MM-dd"));
    }
}
