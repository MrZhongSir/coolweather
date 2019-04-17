package com.wensir.lutong.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lutong on 2019/4/11.
 */

public class City extends DataSupport {
    // 标号
    private int id;
    // 市的名字
    private String cityName;
    // 市的代号
    private int cityCode;
    // 所属省市的id值
    private int ProvinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(int provinceId) {
        ProvinceId = provinceId;
    }
}
