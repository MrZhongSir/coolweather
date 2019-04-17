package com.wensir.lutong.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lutong on 2019/4/11.
 */

public class HttpUtil {
    /**
     * 获取数据
     * @param address 接口地址
     * @param callback 接口
     */
    public static void sendOhHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
