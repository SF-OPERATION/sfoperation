package com.sabatfinance.sfoperation.client;

import com.sabatfinance.sfoperation.Service.IApiService;
import com.sabatfinance.sfoperation.constant.OauthConstant;
import retrofit.RestAdapter;

/**
 * Created by narak.hok on 08-May-2018.
 */

public class ApiService {
    private IApiService _apiService;

    public IApiService getMessage(){
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(OauthConstant.AUTHENTICATION_SERVER_URL).
                        setRequestInterceptor(new RequestInterceptorService().requestInterceptor)
                .build();
        _apiService = restAdapter.create(IApiService.class);


        return _apiService;

    }
}
