package com.coolweather.android.gson;

/**
 * Created by yuanhonglei on 2017/6/4.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
