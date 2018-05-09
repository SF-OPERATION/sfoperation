package com.sabatfinance.sfoperation.request;

public class AccessTokenRequest {
    private String username;
    private String password;
    private String client_id;
    private String client_secret;
    private String grant_type;
    private String scopes;

    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    @Override
    public String toString() {
        return "AccessTokenRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", client_id='" + client_id + '\'' +
                ", client_secret='" + client_secret + '\'' +
                ", grant_type='" + grant_type + '\'' +
                ", scopes='" + scopes + '\'' +
                '}';
    }
}
