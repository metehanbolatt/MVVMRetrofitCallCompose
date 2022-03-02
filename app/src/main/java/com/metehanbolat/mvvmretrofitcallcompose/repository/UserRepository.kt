package com.metehanbolat.mvvmretrofitcallcompose.repository

import com.metehanbolat.mvvmretrofitcallcompose.model.UserResponse
import com.metehanbolat.mvvmretrofitcallcompose.network.ApiInterface
import com.metehanbolat.mvvmretrofitcallcompose.utils.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class UserRepository @Inject constructor(
    private val apiInterface: ApiInterface
) {

    suspend fun getUserResponse(): Resource<List<UserResponse>> {
        val response = try {
            apiInterface.getUserData()
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred: ${e.localizedMessage}")
        }
        return Resource.Success(response)
    }
}