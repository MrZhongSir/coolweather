package com.wensir.lutong.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    /**
     * 城市名
     */
    @SerializedName("city")
    public String cityName;

    /**
     * 城市对应的天气id
     */
    @SerializedName("id")
    public String weatherId;

    /**
     * 更新时间
     */
    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
