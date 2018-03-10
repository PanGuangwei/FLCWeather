package com.ws.flcweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * <pre>
 *     author : Administrator
 *     e-mail : 89925977@qq.com
 *     time   : 2018/03/10
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Weather {
	public String status;
	public Basic basic;
	public AQI aqi;
	public Now now;
	public Suggestion suggestion;
	@SerializedName("daily_forecast")
	public List<Forecast> forecastList;
}
