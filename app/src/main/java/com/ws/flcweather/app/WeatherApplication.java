package com.ws.flcweather.app;

import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * <pre>
 *     author : Administrator
 *     e-mail : 89925977@qq.com
 *     time   : 2018/03/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class WeatherApplication extends LitePalApplication{
	@Override
	public void onCreate() {
		super.onCreate();
	}

	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
	}
}
