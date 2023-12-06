package com.ggpl.taskproject.Network;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitInstance {

    private static final String BASE_URL = "http://apiconfident.confidentdentalteam.in/";
    private static RetrofitInstance retrofitInstance;
    public static Retrofit retrofit = null;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS) // Increase the connection timeout
                    .readTimeout(30, TimeUnit.SECONDS)    // Increase the read timeout
                    .writeTimeout(30, TimeUnit.SECONDS)   // Increase the write timeout
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient) // Set the OkHttpClient with timeout values
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                    .build();
        }

        return retrofit;
    }



}
