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
public class Suggestion {
	@SerializedName("comf")
	public Comfort comfort;

	@SerializedName("cw")
	public CarWash carWash;

	public Sport sport;

	public class Comfort{
		@SerializedName("txt")
		public String info;
	}

	public class CarWash{
		@SerializedName("txt")
		public String info;
	}

	public class Sport{
		@SerializedName("txt")
		public String info;
	}

}
