package com.szfp.pos;

import android.app.Application;
import android.os.Build;
import android.util.Log;

import com.pos.device.SDKManager;
import com.pos.device.SDKManagerCallback;
import com.pos.device.ped.KeySystem;
import com.pos.device.ped.KeyType;
import com.pos.device.ped.Ped;
import com.szfp.pos.utils.AidlUtil;
import com.szfp.utils.Utils;

/**
 * author：ct on 2017/10/23 17:47
 * email：cnhttt@163.com
 */

public class App extends Application {
    public static String LOGRECORD="LOGRECORD";
    public static String isLogin="isLogin";
    private boolean isAidl; //5800
    public static String PIN = "123";
    public static String TID = "123";


    public static String companyName = "SZFP TECHNOLOGY LIMITED";
    public static String slogan = "EXPERT IN WIRELESS POS TERMINAL FIELD";

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);

        String   model = Build.MODEL;
        Log.d("Model",model);
        if (model.equals("V1-B18"))
        AidlUtil.getInstance().connectPrinterService(this);

//        SDKManager.init(this, new SDKManagerCallback() {
//            @Override
//            public void onFinish() {
//
//            }
//        });


    }
}
