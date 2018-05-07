package com.sabatfinance.sfoperation.Service;

import com.sabatfinance.sfoperation.response.ApiResponse;

import retrofit2.Callback;
import retrofit2.http.GET;

public interface IApiService {
    @GET("/")
    void getMessage(Callback<ApiResponse> responseCallback);
}
