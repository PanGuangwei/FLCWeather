package com.ws.flcweather.db;

import org.litepal.crud.DataSupport;

/**
 * <pre>
 *     author : Administrator
 *     e-mail : 89925977@qq.com
 *     time   : 2018/03/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class City extends DataSupport {
	private int id;
	private String cityName;
	private int cityCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	private int provinceId;
}
