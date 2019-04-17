package com.wensir.lutong.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by lutong on 2019/4/11.
 */

public class County extends DataSupport {
    // 标号
    private int id;
    // 县的名字
    private String countyName;
    // 对应县的天气id
    private String weatherId;
    // 当前县所属城市的id值
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
