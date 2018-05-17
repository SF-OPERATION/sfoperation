package com.sabatfinance.sfoperation.client;

import retrofit.RequestInterceptor;

/**
 * Created by narak.hok on 08-May-2018.
 */

public class RequestInterceptorService {
    private  String token = "a549f9bc-db65-4b2c-adab-539326155456";
    RequestInterceptor requestInterceptor = request -> {
        request.addHeader("Accept", "application/json");
        request.addHeader("Authorization", "Bearer " + token );
        request.addHeader("User-Agent", "Android");

    };
}
