package com.ggpl.taskproject;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ggpl.taskproject.Network.RetrofitAPI;
import com.ggpl.taskproject.databinding.ActivityMainBinding;
import com.ggpl.taskproject.models.Data;
import com.ggpl.taskproject.models.ReqGetData;
import com.ggpl.taskproject.models.ResGetData;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private RecyclerView recyclerView;
    private MyAdapter adapter;

    List<Data> dataList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

initView();
        postData();
        getData();

        // Call the method to get data

        setContentView(binding.getRoot());

    }

    private void initView() {
        binding.recyclerview.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(this, dataList);
        binding.recyclerview.setAdapter(adapter);
    }

    private void postData() {
        List<ItemImage> list=new ArrayList<ItemImage>(  );
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://mapi.grataeshop.com:8091/api/Category/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        ReqSaveData modal = new ReqSaveData(0,0,0,"",
                0,90,10,0,"","",list
        );
        Call<ResSaveData> call = retrofitAPI.createPost(modal);

        call.enqueue(new Callback<ResSaveData>() {
            @Override
            public void onResponse(Call<ResSaveData> call, Response<ResSaveData> response) {
                Log.d("res","success" );
                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show( );
            }

            @Override
            public void onFailure(Call<ResSaveData> call, Throwable t) {
                Log.d("res","failed" );
                Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show( );

            }
        });


    }

    private void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://mapi.grataeshop.com:8091/api/Category/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        ReqGetData model=new ReqGetData(180);
        Log.d("res", ""+ new Gson().toJson(model));
        Call<ResGetData> call = retrofitAPI.getData(model);

        call.enqueue(new Callback<ResGetData>() {
            @Override
            public void onResponse(Call<ResGetData> call, Response<ResGetData> response) {
                Log.d("res", "success get Data"+new Gson().toJson(response.body()));
                if (response.isSuccessful() && response.body() != null) {
                    Log.d("res", "success get Data"+new Gson().toJson(response.body()));
                     dataList.addAll(response.body().getData());
                    adapter.notifyDataSetChanged();

                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
                } else {
                    Log.d("res", "Response not successful or body is null");
                    Toast.makeText(MainActivity.this, "Response not successful", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResGetData> call, Throwable t) {
                Log.d("res", "failed");
                Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
            }
        });



    }
}