package com.sabatfinance.sfoperation.Service;


import com.sabatfinance.sfoperation.response.AccessTokenResponse;

import retrofit.Callback;
import retrofit.http.Header;
import retrofit.http.POST;
import retrofit.http.Query;


public interface IOauthService {

    @POST("/oauth/token")
    void getAccessToken(@Query("grant_type") String grantType,
                        @Query("username") String username,
                        @Query("password") String password,
                        @Header("Authorization") String authHeader,
                        @Header("Content-Type") String contentType,
                        Callback<AccessTokenResponse> responseCallback );

/* @POST("/oauth/token")
    void getAccessToken(@Body AccessTokenRequest accessTokenRequest,
                        Callback<AccessTokenResponse> responseCallback );*/
    /*@POST("/login")
    AccessTokenResponse getAccessToken(@Query("grand_type") String grand_type,@Query("username") String username,@Query("password") String password
                         );*/

}
