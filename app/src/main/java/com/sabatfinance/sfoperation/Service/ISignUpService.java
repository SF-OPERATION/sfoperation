package com.sabatfinance.sfoperation.Service;

import com.sabatfinance.sfoperation.request.SignUpRequest;
import com.sabatfinance.sfoperation.response.UserResponse;

import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ISignUpService {

    //Register new user
    @POST("/register?role=ROLE_USER ")
    void signUp(@Body SignUpRequest signUpRequest,
                Callback<UserResponse> signUpResponseCallback);
}
