package com.example.testretrofir;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitAPI {
    @GET("pubinfo?exchange&json&coursid=11")
    Call<List<RecyclerData>> getCourse();
}
