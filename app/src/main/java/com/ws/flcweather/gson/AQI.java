package com.ws.flcweather.gson;

/**
 * <pre>
 *     author : Administrator
 *     e-mail : 89925977@qq.com
 *     time   : 2018/03/10
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class AQI {
	public AQICity city;

	public class AQICity{
		public String aqi;
		public String pm25;
	}
}
