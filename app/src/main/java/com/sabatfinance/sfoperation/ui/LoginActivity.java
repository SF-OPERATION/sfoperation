package com.sabatfinance.sfoperation.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.sabatfinance.sfoperation.R;
import com.sabatfinance.sfoperation.request.SignUpRequest;


public class LoginActivity extends AppCompatActivity {
    TextView textView_login;
    TextView textView_sign_up;
    EditText editText_username;
    EditText editText_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity_login);

    //Contact to View layout

    textView_login = (TextView) findViewById(R.id.text_login_login);
    textView_sign_up =(TextView) findViewById(R.id.text_sign_up_login);
    editText_username =(EditText) findViewById(R.id.edit_text_username_login);
    editText_password = (EditText) findViewById(R.id.edit_text_password_login);

    textView_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(intent);
        }
    });


    textView_sign_up.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           signUp();
        }
    });
    }

    public void signUp(){
        SignUpRequest signUpRequest = new SignUpRequest();
        signUpRequest.setFullName("HOk Narak");
        signUpRequest.setUsername(editText_username.getText().toString());
        signUpRequest.setPassword(editText_password.getText().toString());
        signUpRequest.setBranch("120");
        signUpRequest.setDeviceId("1234567890");

    }
}
