package com.sabatfinance.sfoperation.client;

import com.sabatfinance.sfoperation.Service.ICurrencyService;
import com.sabatfinance.sfoperation.constant.OauthConstant;

import retrofit.RestAdapter;

public class CurrencyService {

    private ICurrencyService _currencyService;

    public ICurrencyService getCurrency(){
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(OauthConstant.RESOURCE_SERVER_URL)
                .setRequestInterceptor(new RequestInterceptorService().requestInterceptor)

                .build();
        _currencyService = restAdapter.create(ICurrencyService.class);


        return _currencyService;
    }
}
