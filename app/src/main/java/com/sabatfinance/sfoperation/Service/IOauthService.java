package com.sabatfinance.sfoperation.Service;

import com.sabatfinance.sfoperation.request.AccessTokenRequest;

import com.sabatfinance.sfoperation.response.AccessTokenResponse;

import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface IOauthService {
    @POST("/oauth/token")
    void getAccessToken(@Body AccessTokenRequest accessTokenRequest,
                        Callback<AccessTokenResponse> responseCallback);
}
