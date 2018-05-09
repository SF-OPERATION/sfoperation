package com.sabatfinance.sfoperation.Service;

import com.sabatfinance.sfoperation.request.AccessTokenRequest;

import com.sabatfinance.sfoperation.response.AccessTokenResponse;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;


public interface IOauthService {

   @POST("/oauth/token")
    void getAccessToken(@Body AccessTokenRequest accessTokenRequest,
                        Callback<AccessTokenResponse> responseCallback);


}
