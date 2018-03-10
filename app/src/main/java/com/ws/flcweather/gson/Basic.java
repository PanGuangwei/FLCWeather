package com.ws.flcweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * <pre>
 *     author : Administrator
 *     e-mail : 89925977@qq.com
 *     time   : 2018/03/10
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Basic {
	@SerializedName("city")
	public String cityName;

	@SerializedName("id")
	public String weatherId;

	public Update update;

	public  class Update{
		@SerializedName("loc")
		public String updateTime;
	}
}
