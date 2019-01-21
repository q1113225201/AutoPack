package com.sjl.autopack;

import android.app.Application;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

/**
 * App
 *
 * @author 沈建林
 * @date 2019/1/21
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initUmeng();
    }
    private void initUmeng() {
        //友盟统计
        UMConfigure.init(this, null, null, UMConfigure.DEVICE_TYPE_PHONE, null);
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);
        MobclickAgent.setCatchUncaughtExceptions(BuildConfig.DEBUG);
    }
}
