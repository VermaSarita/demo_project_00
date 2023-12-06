package com.ggpl.taskproject.Network;
import com.ggpl.taskproject.ReqSaveData;
import com.ggpl.taskproject.ResSaveData;
import com.ggpl.taskproject.models.ReqGetData;
import com.ggpl.taskproject.models.ResGetData;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetrofitAPI {
	@Headers({
			"Xapikey: 1"
	})
	@POST("InsertStoreItem")
	Call<ResSaveData> createPost(@Body ReqSaveData dataModal);

	@Headers({
			"Xapikey: 1"
	})
	@POST("GetStoreItems")
	Call<ResGetData> getData(@Body ReqGetData dataModal);

}

