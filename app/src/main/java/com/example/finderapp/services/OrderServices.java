package com.example.finderapp.services;

import com.example.finderapp.models.Order;
import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class OrderServices {
    private String token = "1abcd00b2731640e886fb41a8a9671ad1434c599dbaa0a0de9a5aa619f29a83f";
    private String user = "teste";
    public static final String API_BASE_URL = "https://api.linketrack.com/track/json";

    public Order getPackageList(String codigo){
        Order response = null;
        try{
            response = Unirest.get(API_BASE_URL+"?user=teste&token=1abcd00b2731640e886fb41a8a9671ad1434c599dbaa0a0de9a5aa619f29a83f&codigo="+codigo)
                    .asObject(Order.class)
                    .getBody();

        }catch (Exception e){
            return null;
        }
        return response;
    }
}
