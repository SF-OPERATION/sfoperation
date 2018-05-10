package com.sabatfinance.sfoperation.client;

import retrofit.RequestInterceptor;

/**
 * Created by narak.hok on 08-May-2018.
 */

public class RequestInterceptorService {
    RequestInterceptor requestInterceptor = request -> {

        request.addHeader("Authorization", "Bearer" );
        request.addHeader("User-Agent", "Android");

    };
}
