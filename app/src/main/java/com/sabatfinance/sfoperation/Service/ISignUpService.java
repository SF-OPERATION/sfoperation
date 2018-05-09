package com.sabatfinance.sfoperation.Service;

import com.sabatfinance.sfoperation.request.SignUpRequest;
import com.sabatfinance.sfoperation.response.UserResponse;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

public interface ISignUpService {

    //Register new user
    @POST("/signup")
    void signUp(@Body SignUpRequest signUpRequest,
                Callback<UserResponse> signUpResponseCallback);
}
