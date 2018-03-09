package com.ws.flcweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * <pre>
 *     author : Administrator
 *     e-mail : 89925977@qq.com
 *     time   : 2018/03/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class HttpUtil {
	public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
		OkHttpClient client=new OkHttpClient();
		Request request=new Request.Builder().url(address).build();
		client.newCall(request).enqueue(callback);
	}
}
