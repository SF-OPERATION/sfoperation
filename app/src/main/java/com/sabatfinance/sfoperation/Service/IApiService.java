package com.sabatfinance.sfoperation.Service;

import com.sabatfinance.sfoperation.response.ApiResponse;

import retrofit.Callback;
import retrofit.http.GET;

public interface IApiService {
    @GET("/")
    void getMessage(Callback<ApiResponse> responseCallback);
}
