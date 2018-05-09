package com.sabatfinance.sfoperation.client;

import com.sabatfinance.sfoperation.Service.ISignUpService;
import com.sabatfinance.sfoperation.constant.OauthConstant;

import retrofit.RestAdapter;

/**
 * Created by narak.hok on 08-May-2018.
 */

public class SignUpService {
    private ISignUpService _signUpService;


    public ISignUpService signUpService() {
        RestAdapter restAdapter = new RestAdapter.Builder().setLogLevel(RestAdapter.LogLevel.FULL)

                .setEndpoint(OauthConstant.AUTHENTICATION_SERVER_URL).
                        setRequestInterceptor(new RequestInterceptorService().requestInterceptor)
                .build();
        _signUpService = restAdapter.create(ISignUpService.class);


        return _signUpService;
    }
}
