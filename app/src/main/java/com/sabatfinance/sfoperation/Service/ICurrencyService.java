package com.sabatfinance.sfoperation.Service;

import com.sabatfinance.sfoperation.response.CurrencyResponse;
import com.sabatfinance.sfoperation.response.UserResponse;

import retrofit.Callback;
import retrofit.http.GET;

public interface ICurrencyService {

    @GET("/manage/currency")
    void currency(Callback<CurrencyResponse> currencyResponseCallback);
}
