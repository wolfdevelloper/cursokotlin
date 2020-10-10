package com.wolfdevelloper.estudo.ineractor.remote.iapi

import com.wolfdevelloper.estudo.entity.ListStatement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IStatementApi {
    @GET("statements/{id}")
    fun statement(@Path("id") id: Int): Call<ListStatement?>

}