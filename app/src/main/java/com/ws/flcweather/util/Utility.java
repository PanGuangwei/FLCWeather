package com.ws.flcweather.util;

import android.text.TextUtils;

import com.ws.flcweather.db.City;
import com.ws.flcweather.db.County;
import com.ws.flcweather.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * <pre>
 *     author : Administrator
 *     e-mail : 89925977@qq.com
 *     time   : 2018/03/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Utility {
	public static boolean handleProvinceResponse(String respone){
		if (!TextUtils.isEmpty(respone)){
			try{
				JSONArray allProvinces=new JSONArray(respone);
				for (int i = 0; i < allProvinces.length(); i++) {
					JSONObject object=allProvinces.getJSONObject(i);
					Province province=new Province();
					province.setProvinceName(object.getString("name"));
					province.setProvinceCode(object.getInt("id"));
					province.save();
				}
				return true;
			}catch (JSONException e){

			}
		}

		return false;
	}

	public static boolean handleCityResponse(String response,int provinceId){
		if (!TextUtils.isEmpty(response)){
			try {
				JSONArray allCitys=new JSONArray(response);
				for (int i = 0; i < allCitys.length(); i++) {
					JSONObject object=allCitys.getJSONObject(i);
					City city=new City();
					city.setCityName(object.getString("name"));
					city.setCityCode(object.getInt("id"));
					city.setProvinceId(provinceId);
					city.save();
				}
				return true;
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public static boolean handleCountyResponse(String response,int cityId){
		if (!TextUtils.isEmpty(response)){
			try {
				JSONArray allCounty=new JSONArray(response);
				for (int i = 0; i < allCounty.length(); i++) {
					JSONObject object=allCounty.getJSONObject(i);
					County county=new County();
					county.setCountyName(object.getString("name"));
					county.setWeatherId(object.getString("weather_id"));
					county.setCityId(cityId);
					county.save();
				}
				return true;
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
