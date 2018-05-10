package com.sabatfinance.sfoperation.ui;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.sabatfinance.sfoperation.R;

import com.sabatfinance.sfoperation.client.ApiService;
import com.sabatfinance.sfoperation.client.CurrencyService;
import com.sabatfinance.sfoperation.client.OauthService;
import com.sabatfinance.sfoperation.client.SignUpService;
import com.sabatfinance.sfoperation.constant.OauthConstant;
import com.sabatfinance.sfoperation.request.AccessTokenRequest;
import com.sabatfinance.sfoperation.request.SignUpRequest;
import com.sabatfinance.sfoperation.response.AccessTokenResponse;
import com.sabatfinance.sfoperation.response.ApiResponse;
import com.sabatfinance.sfoperation.response.CurrencyResponse;
import com.sabatfinance.sfoperation.response.UserResponse;


import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit2.Call;


public class LoginActivity extends AppCompatActivity {
    Button textView_login;
    TextView textView_sign_up;
    EditText editText_username;
    EditText editText_password;
    private TextView txtUserDetail;
    private Button btnUserDetail;
    private static final String TAG =  LoginActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_login);


        txtUserDetail = (TextView) findViewById(R.id.txtUserDetail);

        btnUserDetail = (Button) findViewById(R.id.btnUserDetail);
        //Contact to View layout

        textView_login = (Button) findViewById(R.id.text_login_login);
        textView_sign_up = (TextView) findViewById(R.id.text_sign_up_login);
        editText_username = (EditText) findViewById(R.id.edit_text_username_login);
        editText_password = (EditText) findViewById(R.id.edit_text_password_login);

      /*  textView_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });*/


        textView_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
        textView_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAccessToken();
                Toast.makeText(getApplicationContext(),"hello", Toast.LENGTH_LONG).show();

            }
        });

        btnUserDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getCurrency();
            }
        });

    }

    public void getCurrency() {
        CurrencyService currencyService = new CurrencyService();
        currencyService.getCurrency().currency(new Callback<CurrencyResponse>() {
            @Override
            public void success(CurrencyResponse currencyResponse, Response response) {
                txtUserDetail.setText("Currency:" + currencyResponse.getDescription()
                        + "/n" + "Code:" + currencyResponse.getCode());
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }



    public void getAccessToken() {
        AccessTokenRequest accessTokenRequest = new AccessTokenRequest();
        accessTokenRequest.setClient_id(OauthConstant.CLIENT_ID);
        accessTokenRequest.setClient_secret(OauthConstant.CLIENT_SECRET);
        accessTokenRequest.setGrant_type(OauthConstant.GRANT_TYPE);
        accessTokenRequest.setScopes(OauthConstant.SCOPE);
        accessTokenRequest.setUsername(OauthConstant.USERNAME);
        accessTokenRequest.setPassword(OauthConstant.PASSWORD);


        Toast.makeText(getApplicationContext(),"Currency",Toast.LENGTH_SHORT).show();
       //accessTokenRequest.setPassword(editText_password.getText().toString());
        OauthService service = new OauthService();

        //Toast.makeText(getApplicationContext(),accessTokenRequest.toString(),Toast.LENGTH_SHORT).show();

        service.getAccessToken().getAccessToken(accessTokenRequest, new Callback<AccessTokenResponse>() {
            @Override
            public void success(AccessTokenResponse accessTokenResponse, Response response) {


                if (accessTokenResponse.getAccess_token() == null) {
                    Toast.makeText(getApplicationContext(), accessTokenResponse.getError(), Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), accessTokenResponse.getAccess_token(), Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            accessTokenResponse.getAccess_token(),
                            Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }

    public void getMessage() {
        ApiService apiService = new ApiService();
        apiService.getMessage().getMessage(new Callback<ApiResponse>() {
            @Override
            public void success(ApiResponse apiResponse, Response response) {
                Log.e(TAG, apiResponse.getMsg());
                Toast.makeText(getApplicationContext(), apiResponse.getMsg(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
    public void signUp() {

        SignUpRequest signUpRequest = new SignUpRequest();
        signUpRequest.setFullName("HOk Narak");
        signUpRequest.setUsername(OauthConstant.USERNAME);
        signUpRequest.setPassword(OauthConstant.PASSWORD);

        signUpRequest.setBranch("120");
        signUpRequest.setDeviceId("1234567890");

        SignUpService signUpService = new SignUpService();
       signUpService.signUpService().signUp(signUpRequest, new Callback<UserResponse>() {
           @Override
           public void success(UserResponse userResponse, Response response) {
               Toast.makeText(getApplicationContext(), userResponse.getUsername(), Toast.LENGTH_LONG).show();
           }

           @Override
           public void failure(RetrofitError error) {

           }
       });

    }
}



