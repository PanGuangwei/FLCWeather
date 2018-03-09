package com.ws.flcweather.util;

import android.widget.Toast;

import com.ws.flcweather.app.WeatherApplication;

/**
 * <pre>
 *     author : Administrator
 *     e-mail : 89925977@qq.com
 *     time   : 2018/03/09
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class ToastUtil {
	public static void showToast(String msg){
		Toast.makeText(WeatherApplication.getContext(), msg,Toast.LENGTH_SHORT).show();
	}
}
