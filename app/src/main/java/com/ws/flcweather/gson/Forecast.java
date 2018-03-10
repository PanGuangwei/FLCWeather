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
public class Forecast {
	public String date;
	@SerializedName("tmp")
	public Temperature temperature;
	@SerializedName("cond")
	public more more;

	public class Temperature{
		public String max;
		public String min;
	}

	public class more{
		@SerializedName("txt_d")
		public String info;
	}
}
