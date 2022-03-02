package com.metehanbolat.mvvmretrofitcallcompose.network

import com.metehanbolat.mvvmretrofitcallcompose.model.UserResponse
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface ApiInterface {

    @GET("todos")
    suspend fun getUserData(): List<UserResponse>
}