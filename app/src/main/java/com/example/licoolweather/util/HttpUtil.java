package com.example.licoolweather.util;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtil {
    public static void sendOkHttpRequest( String address,okhttp3.Callback callback){
//        try {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//        OkHttpClient client = new OkHttpClient();
//        Request request = new Request.Builder().url(address).build();
//                    try {
//                        Response response = client.newCall(request).execute();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }).start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        client.newCall(request).enqueue(callback);
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);





    }
}
