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
public class Province extends DataSupport {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public int getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
	}

	private String provinceName;
	private int provinceCode;
}
