package com.example.finderapp.services;

import android.os.AsyncTask;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class OrderServices {
    private String token = "1abcd00b2731640e886fb41a8a9671ad1434c599dbaa0a0de9a5aa619f29a83f";
    private String user = "teste";
    private String endpoint = "https://api.linketrack.com/track/json";

    public void getPackageList(String codigo){
        HttpResponse<JsonNode> response = Unirest.get(endpoint)
                .queryString("user", user)
                .queryString("token", token)
                .queryString("codigo", codigo)
                .asJson();
        response.getBody();

    }
}
