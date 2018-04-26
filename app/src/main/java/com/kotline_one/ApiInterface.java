package com.kotline_one;

import android.graphics.ColorSpace;

import com.kotline_one.Model.AllCategorysModel;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by love on 23-Apr-18.
 */

interface ApiInterface {


     @GET("api/get_category")
    Call<AllCategorysModel> getResponeApiInterface();

}
