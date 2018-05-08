package com.sabatfinance.sfoperation.client;

import com.sabatfinance.sfoperation.Service.IOauthService;
import com.sabatfinance.sfoperation.constant.OauthConstant;

import retrofit.RestAdapter;

/**
 * Created by narak.hok on 08-May-2018.
 */

public class OauthService {
    private IOauthService _oauthService;


    public IOauthService getAccessToken() {
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(OauthConstant.AUTHENTICATION_SERVER_URL)
                .build();
        _oauthService = restAdapter.create(IOauthService.class);


        return _oauthService;
    }
}
